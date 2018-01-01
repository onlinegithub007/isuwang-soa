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
        public class ListTextPackOrderForDoctorResponseSerializer implements BeanSerializer<com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse>{
        
      @Override
      public com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse read(TProtocol iprot) throws TException{

      com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse bean = new com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse();
      com.isuwang.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
               com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
        java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> elem0 = new java.util.ArrayList<>(_list0.size);
        for(int _i0 = 0; _i0 < _list0.size; ++ _i0){
          com.isuwang.dapeng.json.demo.domain.OrderItem elem1 = new com.isuwang.dapeng.json.demo.domain.OrderItem();
        elem1=new com.isuwang.dapeng.json.demo.domain.serializer.OrderItemSerializer().read(iprot);
          elem0.add(elem1);
        }
        iprot.readListEnd();
       bean.setOrderItems(elem0);
            }else{
              com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
              case 2:
              if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
              com.isuwang.dapeng.json.demo.domain.PageResponse elem0 = new com.isuwang.dapeng.json.demo.domain.PageResponse();
        elem0=new com.isuwang.dapeng.json.demo.domain.serializer.PageResponseSerializer().read(iprot);
       bean.setPageResponse(Optional.of(elem0));
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
      public void write(com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("ListTextPackOrderForDoctorResponse"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("orderItems", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 1));
            java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> elem0 = bean.getOrderItems();
            
          oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, elem0.size()));
          for(com.isuwang.dapeng.json.demo.domain.OrderItem elem1 : elem0){
           new com.isuwang.dapeng.json.demo.domain.serializer.OrderItemSerializer().write(elem1, oprot);
        }
          oprot.writeListEnd();
        
            
            oprot.writeFieldEnd();
          if(bean.getPageResponse().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("pageResponse", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 2));
              com.isuwang.dapeng.json.demo.domain.PageResponse elem1 = bean.getPageResponse().get();
               new com.isuwang.dapeng.json.demo.domain.serializer.PageResponseSerializer().write(elem1, oprot);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse bean) throws TException{
      
              if(bean.getOrderItems() == null)
              throw new SoaException(SoaBaseCode.NotNull, "orderItems字段不允许为空");
            
                if(bean.getPageResponse().isPresent())
                new com.isuwang.dapeng.json.demo.domain.serializer.PageResponseSerializer().validate(bean.getPageResponse().get());
              
    }
    
        @Override
        public String toString(com.isuwang.dapeng.json.demo.domain.ListTextPackOrderForDoctorResponse bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      