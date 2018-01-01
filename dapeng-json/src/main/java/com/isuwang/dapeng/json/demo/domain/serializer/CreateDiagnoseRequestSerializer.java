 package com.isuwang.dapeng.json.demo.domain.serializer;
        import com.isuwang.dapeng.json.demo.domain.serializer.*;

        import com.isuwang.dapeng.core.*;
        import com.isuwang.org.apache.thrift.*;
        import com.isuwang.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class CreateDiagnoseRequestSerializer implements BeanSerializer<com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest>{
        
      @Override
      public com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest read(TProtocol iprot) throws TException{

      com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest bean = new com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setOrderId(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setContent(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
               com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
        java.util.List<Integer> elem0 = new java.util.ArrayList<>(_list0.size);
        for(int _i0 = 0; _i0 < _list0.size; ++ _i0){
           int elem1 = iprot.readI32();
          elem0.add(elem1);
        }
        iprot.readListEnd();
       bean.setRecDoctorIds(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 4:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
               com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
        java.util.List<String> elem0 = new java.util.ArrayList<>(_list0.size);
        for(int _i0 = 0; _i0 < _list0.size; ++ _i0){
          String elem1 = iprot.readString();
          elem0.add(elem1);
        }
        iprot.readListEnd();
       bean.setRecTitleCategories(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("CreateDiagnoseRequest"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("orderId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getOrderId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("content", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 2));
            String elem1 = bean.getContent();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("recDoctorIds", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 3));
            java.util.List<Integer> elem2 = bean.getRecDoctorIds();
            
          oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.I32, elem2.size()));
          for(Integer elem3 : elem2){
          oprot.writeI32(elem3);
        }
          oprot.writeListEnd();
        
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("recTitleCategories", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 4));
            java.util.List<String> elem3 = bean.getRecTitleCategories();
            
          oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRING, elem3.size()));
          for(String elem4 : elem3){
          oprot.writeString(elem4);
        }
          oprot.writeListEnd();
        
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest bean) throws TException{
      
              if(bean.getContent() == null)
              throw new SoaException(SoaBaseCode.NotNull, "content字段不允许为空");
            
              if(bean.getRecDoctorIds() == null)
              throw new SoaException(SoaBaseCode.NotNull, "recDoctorIds字段不允许为空");
            
              if(bean.getRecTitleCategories() == null)
              throw new SoaException(SoaBaseCode.NotNull, "recTitleCategories字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.dapeng.json.demo.domain.CreateDiagnoseRequest bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      