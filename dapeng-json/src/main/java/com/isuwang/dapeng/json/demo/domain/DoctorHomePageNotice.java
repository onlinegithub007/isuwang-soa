package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class DoctorHomePageNotice{
        
            /**
            *医生id
            **/
            public int doctorId ;
            public int getDoctorId(){ return this.doctorId; }
            public void setDoctorId(int doctorId){ this.doctorId = doctorId; }

            public int doctorId(){ return this.doctorId; }
            public DoctorHomePageNotice doctorId(int doctorId){ this.doctorId = doctorId; return this; }
          
            /**
            *预约数
            **/
            public int appointments ;
            public int getAppointments(){ return this.appointments; }
            public void setAppointments(int appointments){ this.appointments = appointments; }

            public int appointments(){ return this.appointments; }
            public DoctorHomePageNotice appointments(int appointments){ this.appointments = appointments; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("doctorId").append("\":").append(this.doctorId).append(",");
    stringBuilder.append("\"").append("appointments").append("\":").append(this.appointments).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      