package com.isuwang.dapeng.code.generator

import java.io._
import java.util

import com.isuwang.dapeng.core.metadata.DataType.KIND
import com.isuwang.dapeng.core.metadata.TEnum.EnumItem
import com.isuwang.dapeng.core.metadata._

import scala.collection.mutable.ArrayBuffer
import scala.xml.Elem

/**
 * Scala生成器
 *
 * @author tangliu
 */
class ScalaGenerator extends CodeGenerator {

  override def generate(services: util.List[Service], outDir: String): Unit = {}

  private def rootDir(rootDir: String, packageName: String): File = {
    val dir = rootDir + "/scala/" + packageName.replaceAll("[.]", "/")

    val file = new File(dir)

    if(!file.exists())
      file.mkdirs()

    return file
  }

  protected def toFieldArrayBufferWithOptionBack(array: util.List[Field]): ArrayBuffer[Field] = {
    val newArray, optionalArray: ArrayBuffer[Field] = ArrayBuffer()

    for (index <- (0 until array.size())) {

      val field = array.get(index)
      if(field.isOptional)
        optionalArray += field
      else
        newArray += field
    }
    newArray.appendAll(optionalArray)
    newArray
  }

  private def resourceDir(rootDir: String, packageName: String): String = {
    val dir = rootDir + "/resources/"

    val file = new File(dir)

    if(!file.exists()){}
      file.mkdirs()

    dir
  }

  val notice: String = " * Autogenerated by Dapeng-Code-Generator (1.2.1)\n *\n * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING\n *  @generated\n"


  override def generate(services: util.List[Service], outDir: String, generateAll:Boolean , structs: util.List[Struct], enums:util.List[TEnum]): Unit = {

    val namespaces:util.Set[String] = new util.HashSet[String]()
    val structNamespaces:util.Set[String] = new util.HashSet[String]()
    for (index <- (0 until services.size())) {
      val service = services.get(index)
      if(!service.getNamespace.contains("com.isuwang.soa.scala")){
      service.setNamespace(service.getNamespace.replace("com.isuwang.soa","com.isuwang.soa.scala"))}
      namespaces.add(service.getNamespace)

      //設置method中字段的namespace
      for(methodIndex <-(0 until service.getMethods.size())){
        val methodDefinition = service.getMethods.get(methodIndex)
        for(reqFieldIndex <- (0 until methodDefinition.request.fields.size()) ){
          val fieldDefinition=methodDefinition.request.fields.get(reqFieldIndex)
          if(fieldDefinition.dataType!=null&&fieldDefinition.dataType.qualifiedName!=null&&(!fieldDefinition.dataType.qualifiedName.contains("com.isuwang.soa.scala"))){
            fieldDefinition.dataType.setQualifiedName(fieldDefinition.dataType.qualifiedName.replace("com.isuwang.soa","com.isuwang.soa.scala"))
        }}
        for(respFieldIndex <- (0 until methodDefinition.response.fields.size()) ){
          val field2Definition=methodDefinition.response.fields.get(respFieldIndex)
          if(field2Definition.dataType!=null&&field2Definition.dataType.qualifiedName!=null&&(!field2Definition.dataType.qualifiedName.contains("com.isuwang.soa.scala"))){
            field2Definition.dataType.setQualifiedName(field2Definition.dataType.qualifiedName.replace("com.isuwang.soa","com.isuwang.soa.scala"))
        }}
      }

      for(enumIndex <- (0 until service.getEnumDefinitions.size())) {
        val enumDefinition = service.getEnumDefinitions.get(enumIndex)
        if(!enumDefinition.getNamespace.contains("com.isuwang.soa.scala")){
        enumDefinition.setNamespace(enumDefinition.getNamespace.replace("com.isuwang.soa","com.isuwang.soa.scala"))}
        namespaces.add(enumDefinition.getNamespace)
      }
      for(structIndex <- (0 until service.getStructDefinitions.size())) {
        val structDefinition = service.getStructDefinitions.get(structIndex)
        if(!structDefinition.namespace.contains("com.isuwang.soa.scala")){
        structDefinition.setNamespace(structDefinition.getNamespace.replace("com.isuwang.soa","com.isuwang.soa.scala"))}
        namespaces.add(structDefinition.getNamespace)
        structNamespaces.add(structDefinition.getNamespace)
      }
    }

    if(generateAll){
      println("=========================================================")
      toStructArrayBuffer(structs).map{(struct: Struct)=>{
        if(!struct.namespace.contains("com.isuwang.soa.scala")){
        struct.setNamespace(struct.namespace.replace("com.isuwang.soa","com.isuwang.soa.scala"))}
        println(s"生成struct:${struct.name}.scala")
        val domainTemplate = new StringTemplate(toDomainTemplate(struct))
        val domainWriter = new PrintWriter(new File(rootDir(outDir, struct.getNamespace), s"${struct.name}.scala"), "UTF-8")
        domainWriter.write(domainTemplate.toString)
        domainWriter.close()
        println(s"生成struct:${struct.name}.scala 完成")
      }
      }

      toTEnumArrayBuffer(enums).map{(enum: TEnum)=>{

        println(s"生成Enum:${enum.name}.scala")
        if(!enum.namespace.contains("com.isuwang.soa","com.isuwang.soa.scala")){
        enum.setNamespace(enum.namespace.replaceAll("com.isuwang.soa","com.isuwang.soa.scala"))}
        val enumTemplate = new StringTemplate(toEnumTemplate(enum))
        val enumWriter = new PrintWriter(new File(rootDir(outDir, enum.getNamespace), s"${enum.name}.scala"), "UTF-8")
        enumWriter.write(enumTemplate.toString)
        enumWriter.close()
        println(s"生成Enum:${enum.name}.scala 完成")
      }
      }
      println("=========================================================")
    }

    for (index <- (0 until services.size())) {

      val service = services.get(index)
      val t1 = System.currentTimeMillis();
      println("=========================================================")
      println(s"服务名称:${service.name}")

      println(s"生成service:${service.name}.scala")
      val serviceTemplate = new StringTemplate(toServiceTemplate(service))
      val writer = new PrintWriter(new File(rootDir(outDir, service.getNamespace), s"${service.name}.scala"), "UTF-8")
      writer.write(serviceTemplate.toString())
      writer.close()
      println(s"生成service:${service.name}.scala 完成")

      if(!generateAll){
        {
          toStructArrayBuffer(service.structDefinitions).map{(struct: Struct)=>{

            println(s"生成struct:${struct.name}.scala")
            val domainTemplate = new StringTemplate(toDomainTemplate(struct))
            val domainWriter = new PrintWriter(new File(rootDir(outDir, struct.getNamespace), s"${struct.name}.scala"), "UTF-8")
            domainWriter.write(domainTemplate.toString)
            domainWriter.close()
            println(s"生成struct:${struct.name}.scala 完成")
          }
          }
        }

        {
          toTEnumArrayBuffer(service.enumDefinitions).map{(enum: TEnum)=>{

            println(s"生成Enum:${enum.name}.scala")
            val enumTemplate = new StringTemplate(toEnumTemplate(enum))
            val enumWriter = new PrintWriter(new File(rootDir(outDir, enum.getNamespace), s"${enum.name}.scala"), "UTF-8")
            enumWriter.write(enumTemplate.toString)
            enumWriter.close()
            println(s"生成Enum:${enum.name}.scala 完成")
          }
          }
        }
      }

      println(s"生成client:${service.name}Client.scala")
      val clientTemplate = new StringTemplate(toClientTemplate(service, namespaces))
      val clientWriter = new PrintWriter(new File(rootDir(outDir, service.namespace.substring(0, service.namespace.lastIndexOf("."))), s"${service.name}Client.scala"), "UTF-8")
      clientWriter.write(clientTemplate.toString())
      clientWriter.close()
      println(s"生成client:${service.name}Client.scala 完成")

      println(s"生成client:${service.name}AsyncClient.scala")
      val asyncClientTemplate = new StringTemplate(toAsyncClientTemplate(service, namespaces))
      val asyncClientWriter = new PrintWriter(new File(rootDir(outDir, service.namespace.substring(0, service.namespace.lastIndexOf("."))), s"${service.name}AsyncClient.scala"), "UTF-8")
      asyncClientWriter.write(asyncClientTemplate.toString())
      asyncClientWriter.close()
      println(s"生成client:${service.name}AsyncClient.scala 完成")


      println(s"生成serializer")
      toStructArrayBuffer(service.structDefinitions).map{(struct:Struct)=>{
        val structSerializerTemplate = new StringTemplate(new ScalaCodecGenerator().toStructSerializerTemplate(service.name,struct,structNamespaces))
        val structSerializerWriter = new PrintWriter(new File(rootDir(outDir, struct.namespace+".serializer."),s"${struct.name}Serializer.scala"), "UTF-8")
        structSerializerWriter.write(structSerializerTemplate.toString)
        structSerializerWriter.close()
        println(s"生成serializer:${struct.name}Serializer.scala 完成")
      }}


      println(s"生成Codec:${service.name}Codec.scala")
      val codecTemplate = new StringTemplate(new ScalaCodecGenerator().toCodecTemplate(service, namespaces,structNamespaces))
      val codecWriter = new PrintWriter(new File(rootDir(outDir, service.namespace.substring(0, service.namespace.lastIndexOf("."))), s"${service.name}Codec.scala"), "UTF-8")
      codecWriter.write(codecTemplate.toString())
      codecWriter.close()
      println(s"生成Codec:${service.name}Codec.scala 完成")



      println(s"生成metadata:${service.namespace}.${service.name}.xml")
      new MetadataGenerator().generateXmlFile(service, resourceDir(outDir, service.namespace.substring(0, service.namespace.lastIndexOf("."))));
      println(s"生成metadata:${service.namespace}.${service.name}.xml 完成")

      println("==========================================================")
      val t2 = System.currentTimeMillis();
      println(s"生成耗时:${t2 - t1}ms")
      println(s"生成状态:完成")

    }

  }

  private def toClientTemplate(service: Service, namespaces:util.Set[String]): Elem = {
    return {
      <div>package {service.namespace.substring(0, service.namespace.lastIndexOf("."))}

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import {service.namespace.substring(0, service.namespace.lastIndexOf(".")) + "." + service.name + "Codec._"}

        /**
        {notice}
        **/
        object {service.name}Client extends BaseCommonServiceClient("{service.namespace}.{service.name}", "{service.meta.version}")<block>

        override def isSoaTransactionalProcess: Boolean = <block>

          var isSoaTransactionalProcess = false
          {toMethodArrayBuffer(service.methods).map{(method:Method)=>{
            if(method.doc != null && method.doc.contains("@IsSoaTransactionProcess"))
              <div>if(InvocationContext.Factory.getCurrentInstance().getHeader().getMethodName().equals("{method.name}"))
                      isSoaTransactionalProcess = true</div>
          }}}
          isSoaTransactionalProcess
        </block>

        {
        toMethodArrayBuffer(service.methods).map{(method:Method)=>{
          <div>
         /**
         * {method.doc}
         **/

            def {method.name}({toFieldArrayBuffer(method.getRequest.getFields).map{ (field: Field) =>{
              <div>{nameAsId(field.name)}:{toDataTypeTemplate(field.getDataType())} {if(field != method.getRequest.fields.get(method.getRequest.fields.size() - 1)) <span>,</span>}</div>}}}) : {toDataTypeTemplate(method.getResponse.getFields().get(0).getDataType)} = <block>

            initContext("{method.name}");

            try <block>
              val response = sendBase({method.request.name}({
              toFieldArrayBuffer(method.getRequest.getFields).map{(field: Field)=>{
                <div>{nameAsId(field.name)}{if(field != method.getRequest.fields.get(method.getRequest.fields.size() - 1)) <span>,</span>}</div>
              }
              }
              }), new {method.request.name.charAt(0).toUpper + method.request.name.substring(1)}Serializer(), new {method.response.name.charAt(0).toUpper + method.response.name.substring(1)}Serializer())

              {if(method.getResponse.getFields.get(0).getDataType.kind != DataType.KIND.VOID) <div>response.success</div>}

            </block>catch<block>
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            </block>
            finally <block>
              destoryContext();
            </block>
            </block>
          </div>
        }
        }
        }

        /**
        * getServiceMetadata
        **/
        @throws[SoaException]
        def getServiceMetadata: String = <block>
          initContext("getServiceMetadata")
          try <block>
            val _request = new getServiceMetadata_args()
            val _response = sendBase(_request, new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer())
            _response.success
          </block>catch<block>
            case e: SoaException => throw e
            case e: TException => throw new SoaException(e)
          </block>
          finally <block>
            destoryContext()
          </block>
        </block>

        </block>
      </div>
    }
  }


  private def toAsyncClientTemplate(service: Service, namespaces:util.Set[String]): Elem = {
    return {
      <div>package {service.namespace.substring(0, service.namespace.lastIndexOf("."))}

        import com.isuwang.dapeng.core._
        import com.isuwang.org.apache.thrift._
        import com.isuwang.dapeng.remoting.BaseCommonServiceClient
        import {service.namespace.substring(0, service.namespace.lastIndexOf(".")) + "." + service.name + "Codec._"}
        import scala.concurrent.<block>Future, Promise</block>
        import java.util.function.BiConsumer

        /**
        {notice}
        **/
        object {service.name}AsyncClient extends BaseCommonServiceClient("{service.namespace}.{service.name}", "{service.meta.version}")<block>

        override def isSoaTransactionalProcess: Boolean = <block>

          var isSoaTransactionalProcess = false
          {toMethodArrayBuffer(service.methods).map{(method:Method)=>{
            if(method.doc != null && method.doc.contains("@IsSoaTransactionProcess"))
              <div>if(InvocationContext.Factory.getCurrentInstance().getHeader().getMethodName().equals("{method.name}"))
                isSoaTransactionalProcess = true</div>
          }}}
          isSoaTransactionalProcess
        </block>

        {
        toMethodArrayBuffer(service.methods).map{(method:Method)=>{
          <div>
            /**
            * {method.doc}
            **/
            def {method.name}({toFieldArrayBuffer(method.getRequest.getFields).map{ (field: Field) =>{
            <div>{nameAsId(field.name)}:{toDataTypeTemplate(field.getDataType())} ,</div>}}} timeout: Long) : scala.concurrent.Future[{toDataTypeTemplate(method.getResponse.getFields().get(0).getDataType)}] = <block>

            initContext("{method.name}");

            try <block>
              val _responseFuture = sendBaseAsync({method.request.name}({
              toFieldArrayBuffer(method.getRequest.getFields).map{(field: Field)=>{
                <div>{nameAsId(field.name)}{if(field != method.getRequest.fields.get(method.getRequest.fields.size() - 1)) <span>,</span>}</div>
              }
              }
              }), new {method.request.name.charAt(0).toUpper + method.request.name.substring(1)}Serializer(), new {method.response.name.charAt(0).toUpper + method.response.name.substring(1)}Serializer(), timeout).asInstanceOf[java.util.concurrent.CompletableFuture[{method.response.name}]]

              val promise = Promise[{toDataTypeTemplate(method.getResponse.getFields().get(0).getDataType)}]()

              _responseFuture.whenComplete(new BiConsumer[{method.response.name}, Throwable]<block>

              override def accept(r: {method.response.name}, e: Throwable): Unit = <block>
                if(e != null)
                  promise.failure(e)
                else
                  promise.success({if(method.getResponse.getFields.get(0).getDataType.kind != DataType.KIND.VOID) <div>r.success</div>})
                </block>
              </block>)
              promise.future
            </block>catch<block>
              case e: SoaException => throw e
              case e: TException => throw new SoaException(e)
            </block>finally <block>
              destoryContext()
            </block>
          </block>
          </div>
        }
        }
        }

      </block>
      </div>
    }
  }

  private def toEnumTemplate(enum: TEnum): Elem = {
    return {
      <div>package {enum.namespace};

        /**
        {notice}
        * {enum.doc}
        **/
        object {enum.name} extends Enumeration<block>

        type {enum.name} = Value

        {
        toEnumItemArrayBuffer(enum.enumItems).map{(enumItem: EnumItem)=>{
          if(enumItem.doc != null)
            <div>val {enumItem.label} = Value({enumItem.value}, "{enumItem.doc.trim}")
            </div>
          else
            <div>val {enumItem.label} = Value({enumItem.value})
            </div>
        }
        }
        }
        <div>val UNDEFINED = Value(-1) // undefined enum
        </div>

        def findByValue(v: Int): {enum.name} = try<block>
            {enum.name}.apply(v)
          </block>
          catch<block>
            case ex: Throwable => UNDEFINED;
          </block>

      </block>
      </div>
    }
  }

  private def toDomainTemplate(struct: Struct): Elem = {
    return {

      var index = 0

      <div>package {struct.namespace}

        /**
        {notice}
        *{struct.doc}
        **/
        case class {struct.name}(

        {toFieldArrayBufferWithOptionBack(struct.getFields).map{(field : Field) =>{<div> /**
        *{field.doc}
        **/
        {index = index + 1}
        {nameAsId(field.name)} : {if(field.isOptional) <div>Option[</div>}{toDataTypeTemplate(field.getDataType)}{if(field.isOptional) <div>] = None</div>}{if(index < struct.getFields.size) <span>,</span>}</div>}}}
        )
      </div>
    }
  }

  val keywords = Set("type") // TODO is there any other keyword need to be escape
  def nameAsId(name: String) = if(keywords contains name) s"`$name`" else name

  private def toServiceTemplate(service:Service): Elem = {
    return {
      <div>
        package {service.namespace}

        import com.isuwang.dapeng.core.<block>Processor, Service</block>
        import com.isuwang.dapeng.core.SoaGlobalTransactional

        /**
        {notice}
        * {service.doc}
        **/
        @Service(version = "{service.meta.version}")
        @Processor(className = "{service.namespace.substring(0, service.namespace.lastIndexOf("service"))}{service.name}Codec$Processor")
        trait {service.name} <block>
        {
        toMethodArrayBuffer(service.methods).map { (method: Method) =>
        {
          <div>
            /**
            * {method.doc}
            **/
            {if(method.doc != null && method.doc.contains("@SoaGlobalTransactional")) <div>@SoaGlobalTransactional</div>}
            def {method.name}(
            {toFieldArrayBuffer(method.getRequest.getFields).map{ (field: Field) =>{
            <div>{nameAsId(field.name)}: {toDataTypeTemplate(field.getDataType())} {if(field != method.getRequest.fields.get(method.getRequest.fields.size() - 1)) <span>,</span>}</div>}
            }
            }): {toDataTypeTemplate(method.getResponse.getFields().get(0).getDataType)}

          </div>
        }
        }
        }
        </block>
        </div>
    }
  }

  /**
    * idl解析类型转为scala对应类型
    *
    * @param dataType
    * @return
    */
  def toDataTypeTemplate(dataType:DataType): Elem = {
    dataType.kind match {
      case KIND.VOID => <div>Unit</div>
      case KIND.BOOLEAN => <div>Boolean</div>
      case KIND.BYTE => <div>Byte</div>
      case KIND.SHORT => <div>Short</div>
      case KIND.INTEGER => <div>Int</div>
      case KIND.LONG => <div>Long</div>
      case KIND.DOUBLE => <div>Double</div>
      case KIND.STRING => <div>String</div>
      case KIND.BINARY => <div>java.nio.ByteBuffer</div>
      case KIND.DATE => <div>java.util.Date</div>
      case KIND.BIGDECIMAL => <div>BigDecimal</div>
      case KIND.MAP =>
        return {<div>Map[{toDataTypeTemplate(dataType.getKeyType())}, {toDataTypeTemplate(dataType.getValueType())}]</div>}
      case KIND.LIST =>
        return {<div>List[{toDataTypeTemplate(dataType.getValueType())}]</div>}
      case KIND.SET =>
        return {<div>Set[{toDataTypeTemplate(dataType.getValueType())}]</div>}
      case KIND.ENUM =>
        val ref = dataType.getQualifiedName
        val enumName = ref.substring(ref.lastIndexOf("."))
        return {<div>{ref}{enumName}</div>}
      case KIND.STRUCT =>
        val ref = dataType.getQualifiedName()
        return {<div>{ref}</div>}
    }
  }

  def getToStringElement(field: Field): Elem = {
    <div>stringBuilder.append("\"").append("{nameAsId(field.name)}").append("\":{if(field.dataType.kind == DataType.KIND.STRING) <div>\"</div>}").append({getToStringByDataType(field)}).append("{if(field.dataType.kind == DataType.KIND.STRING) <div>\"</div>},");
    </div>
  }

  def getToStringByDataType(field: Field):Elem = {

    if(field.getDoc != null && field.getDoc.toLowerCase.contains("@logger(level=\"off\")"))
       <div>"LOGGER_LEVEL_OFF"</div>
    else if(field.isOptional)
       <div>this.{nameAsId(field.name)}.isPresent()?this.{nameAsId(field.name)}.get(){if(field.dataType.kind == KIND.STRUCT) <div>.toString()</div>}:null</div>
    else
       <div>this.{nameAsId(field.name)}{if(field.dataType.kind == KIND.STRUCT) <div>.toString()</div>}</div>
  }
}