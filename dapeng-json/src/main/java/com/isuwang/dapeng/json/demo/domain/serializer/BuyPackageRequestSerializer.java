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
        public class BuyPackageRequestSerializer implements BeanSerializer<com.isuwang.dapeng.json.demo.domain.BuyPackageRequest>{
        
      @Override
      public com.isuwang.dapeng.json.demo.domain.BuyPackageRequest read(TProtocol iprot) throws TException{

      com.isuwang.dapeng.json.demo.domain.BuyPackageRequest bean = new com.isuwang.dapeng.json.demo.domain.BuyPackageRequest();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setDoctorId(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
              com.isuwang.dapeng.json.demo.enums.AppointmentType elem0 = com.isuwang.dapeng.json.demo.enums.AppointmentType.findByValue(iprot.readI32());
       bean.setAppointmentType(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
              com.isuwang.dapeng.json.demo.enums.TOrderPayType elem0 = com.isuwang.dapeng.json.demo.enums.TOrderPayType.findByValue(iprot.readI32());
       bean.setPayType(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 4:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setRemark(Optional.of(elem0));
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
      public void write(com.isuwang.dapeng.json.demo.domain.BuyPackageRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("BuyPackageRequest"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("doctorId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getDoctorId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("appointmentType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            com.isuwang.dapeng.json.demo.enums.AppointmentType elem1 = bean.getAppointmentType();
            oprot.writeI32(elem1.getValue());
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("payType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 3));
            com.isuwang.dapeng.json.demo.enums.TOrderPayType elem2 = bean.getPayType();
            oprot.writeI32(elem2.getValue());
            
            oprot.writeFieldEnd();
          if(bean.getRemark().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("remark", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 4));
              String elem3 = bean.getRemark().get();
              oprot.writeString(elem3);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.dapeng.json.demo.domain.BuyPackageRequest bean) throws TException{
      
              if(bean.getAppointmentType() == null)
              throw new SoaException(SoaBaseCode.NotNull, "appointmentType字段不允许为空");
            
              if(bean.getPayType() == null)
              throw new SoaException(SoaBaseCode.NotNull, "payType字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.dapeng.json.demo.domain.BuyPackageRequest bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      