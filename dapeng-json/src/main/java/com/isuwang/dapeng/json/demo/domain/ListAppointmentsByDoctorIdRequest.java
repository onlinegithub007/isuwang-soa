package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class ListAppointmentsByDoctorIdRequest{
        
            /**
            *医生id
            **/
            public int doctorId ;
            public int getDoctorId(){ return this.doctorId; }
            public void setDoctorId(int doctorId){ this.doctorId = doctorId; }

            public int doctorId(){ return this.doctorId; }
            public ListAppointmentsByDoctorIdRequest doctorId(int doctorId){ this.doctorId = doctorId; return this; }
          
            /**
            *查询日期 格式yyyy-MM-dd
            **/
            public String date ;
            public String getDate(){ return this.date; }
            public void setDate(String date){ this.date = date; }

            public String date(){ return this.date; }
            public ListAppointmentsByDoctorIdRequest date(String date){ this.date = date; return this; }
          
            /**
            *

 预约类型

            **/
            public Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType = Optional.empty();
            public Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> getAppointmentType(){ return this.appointmentType; }
            public void setAppointmentType(Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType){ this.appointmentType = appointmentType; }

            public Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType(){ return this.appointmentType; }
            public ListAppointmentsByDoctorIdRequest appointmentType(Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType){ this.appointmentType = appointmentType; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("doctorId").append("\":").append(this.doctorId).append(",");
    stringBuilder.append("\"").append("date").append("\":\"").append(this.date).append("\",");
    stringBuilder.append("\"").append("appointmentType").append("\":").append(this.appointmentType.isPresent()?this.appointmentType.get():null).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      