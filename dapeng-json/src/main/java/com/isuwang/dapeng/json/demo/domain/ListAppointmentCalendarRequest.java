package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class ListAppointmentCalendarRequest{
        
            /**
            *医生id
            **/
            public Optional<Integer> doctorId = Optional.empty();
            public Optional<Integer> getDoctorId(){ return this.doctorId; }
            public void setDoctorId(Optional<Integer> doctorId){ this.doctorId = doctorId; }

            public Optional<Integer> doctorId(){ return this.doctorId; }
            public ListAppointmentCalendarRequest doctorId(Optional<Integer> doctorId){ this.doctorId = doctorId; return this; }
          
            /**
            *

 预约类型

            **/
            public com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType ;
            public com.isuwang.dapeng.json.demo.enums.AppointmentType getAppointmentType(){ return this.appointmentType; }
            public void setAppointmentType(com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType){ this.appointmentType = appointmentType; }

            public com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType(){ return this.appointmentType; }
            public ListAppointmentCalendarRequest appointmentType(com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType){ this.appointmentType = appointmentType; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("doctorId").append("\":").append(this.doctorId.isPresent()?this.doctorId.get():null).append(",");
    stringBuilder.append("\"").append("appointmentType").append("\":").append(this.appointmentType).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      