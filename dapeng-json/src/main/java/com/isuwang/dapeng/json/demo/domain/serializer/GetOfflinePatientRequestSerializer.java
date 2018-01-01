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
        public class GetOfflinePatientRequestSerializer implements BeanSerializer<com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest>{
        
      @Override
      public com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest read(TProtocol iprot) throws TException{

      com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest bean = new com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setId(Optional.of(elem0));
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setPhone(Optional.of(elem0));
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
      public void write(com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("GetOfflinePatientRequest"));

      if(bean.getId().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
              Integer elem0 = bean.getId().get();
              oprot.writeI32(elem0);
              
            }
            if(bean.getPhone().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("phone", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 2));
              String elem1 = bean.getPhone().get();
              oprot.writeString(elem1);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest bean) throws TException{
      
    }
    
        @Override
        public String toString(com.isuwang.dapeng.json.demo.domain.GetOfflinePatientRequest bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      