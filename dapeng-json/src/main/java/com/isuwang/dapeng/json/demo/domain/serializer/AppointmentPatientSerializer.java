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
        public class AppointmentPatientSerializer implements BeanSerializer<com.isuwang.dapeng.json.demo.domain.AppointmentPatient>{
        
      @Override
      public com.isuwang.dapeng.json.demo.domain.AppointmentPatient read(TProtocol iprot) throws TException{

      com.isuwang.dapeng.json.demo.domain.AppointmentPatient bean = new com.isuwang.dapeng.json.demo.domain.AppointmentPatient();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setPatientId(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setPatientName(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 3:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setPatientHeadImage(Optional.of(elem0));
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 4:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setPatientInformationContent(Optional.of(elem0));
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 5:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
              long elem0 = iprot.readI64();
       bean.setTherapyBeginTime(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 6:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
              long elem0 = iprot.readI64();
       bean.setTherapyEndTime(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 7:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
              long elem0 = iprot.readI64();
       bean.setRemainTime(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 8:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
              com.isuwang.dapeng.json.demo.enums.AppointmentType elem0 = com.isuwang.dapeng.json.demo.enums.AppointmentType.findByValue(iprot.readI32());
       bean.setAppointmentType(Optional.of(elem0));
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 9:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setOrderId(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 10:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
              com.isuwang.dapeng.json.demo.enums.TOrderStatus elem0 = com.isuwang.dapeng.json.demo.enums.TOrderStatus.findByValue(iprot.readI32());
       bean.setStatus(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 11:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setDiagnoseId(Optional.of(elem0));
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 12:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setAdvanceMini(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 13:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setPhone(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 14:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
              com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode elem0 = com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode.findByValue(iprot.readI32());
       bean.setTherapyMode(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 15:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
              com.isuwang.dapeng.json.demo.enums.TOrderPayType elem0 = com.isuwang.dapeng.json.demo.enums.TOrderPayType.findByValue(iprot.readI32());
       bean.setPayType(elem0);
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
      public void write(com.isuwang.dapeng.json.demo.domain.AppointmentPatient bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("AppointmentPatient"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("patientId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getPatientId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("patientName", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 2));
            String elem1 = bean.getPatientName();
            oprot.writeString(elem1);
            
            oprot.writeFieldEnd();
          if(bean.getPatientHeadImage().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("patientHeadImage", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
              String elem2 = bean.getPatientHeadImage().get();
              oprot.writeString(elem2);
              
            }
            if(bean.getPatientInformationContent().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("patientInformationContent", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 4));
              String elem3 = bean.getPatientInformationContent().get();
              oprot.writeString(elem3);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("therapyBeginTime", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 5));
            Long elem4 = bean.getTherapyBeginTime();
            oprot.writeI64(elem4);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("therapyEndTime", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 6));
            Long elem5 = bean.getTherapyEndTime();
            oprot.writeI64(elem5);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("remainTime", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 7));
            Long elem6 = bean.getRemainTime();
            oprot.writeI64(elem6);
            
            oprot.writeFieldEnd();
          if(bean.getAppointmentType().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("appointmentType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 8));
              com.isuwang.dapeng.json.demo.enums.AppointmentType elem7 = bean.getAppointmentType().get();
              oprot.writeI32(elem7.getValue());
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("orderId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 9));
            Integer elem8 = bean.getOrderId();
            oprot.writeI32(elem8);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("status", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 10));
            com.isuwang.dapeng.json.demo.enums.TOrderStatus elem9 = bean.getStatus();
            oprot.writeI32(elem9.getValue());
            
            oprot.writeFieldEnd();
          if(bean.getDiagnoseId().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("diagnoseId", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 11));
              Integer elem10 = bean.getDiagnoseId().get();
              oprot.writeI32(elem10);
              
            }
            
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("advanceMini", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 12));
            Integer elem11 = bean.getAdvanceMini();
            oprot.writeI32(elem11);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("phone", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 13));
            String elem12 = bean.getPhone();
            oprot.writeString(elem12);
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("therapyMode", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 14));
            com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode elem13 = bean.getTherapyMode();
            oprot.writeI32(elem13.getValue());
            
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("payType", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 15));
            com.isuwang.dapeng.json.demo.enums.TOrderPayType elem14 = bean.getPayType();
            oprot.writeI32(elem14.getValue());
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.dapeng.json.demo.domain.AppointmentPatient bean) throws TException{
      
              if(bean.getPatientName() == null)
              throw new SoaException(SoaBaseCode.NotNull, "patientName字段不允许为空");
            
              if(bean.getStatus() == null)
              throw new SoaException(SoaBaseCode.NotNull, "status字段不允许为空");
            
              if(bean.getPhone() == null)
              throw new SoaException(SoaBaseCode.NotNull, "phone字段不允许为空");
            
              if(bean.getTherapyMode() == null)
              throw new SoaException(SoaBaseCode.NotNull, "therapyMode字段不允许为空");
            
              if(bean.getPayType() == null)
              throw new SoaException(SoaBaseCode.NotNull, "payType字段不允许为空");
            
    }
    
        @Override
        public String toString(com.isuwang.dapeng.json.demo.domain.AppointmentPatient bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      