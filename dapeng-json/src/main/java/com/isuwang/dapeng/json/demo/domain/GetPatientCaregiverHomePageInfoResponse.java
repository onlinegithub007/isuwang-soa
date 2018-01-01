package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class GetPatientCaregiverHomePageInfoResponse{
        
            /**
            *

 在线客服信息

            **/
            public Optional<com.isuwang.dapeng.json.demo.domain.DoctorInfo> doctorInf = Optional.empty();
            public Optional<com.isuwang.dapeng.json.demo.domain.DoctorInfo> getDoctorInf(){ return this.doctorInf; }
            public void setDoctorInf(Optional<com.isuwang.dapeng.json.demo.domain.DoctorInfo> doctorInf){ this.doctorInf = doctorInf; }

            public Optional<com.isuwang.dapeng.json.demo.domain.DoctorInfo> doctorInf(){ return this.doctorInf; }
            public GetPatientCaregiverHomePageInfoResponse doctorInf(Optional<com.isuwang.dapeng.json.demo.domain.DoctorInfo> doctorInf){ this.doctorInf = doctorInf; return this; }
          
            /**
            *

 剩余陪护天数

            **/
            public int dayNum ;
            public int getDayNum(){ return this.dayNum; }
            public void setDayNum(int dayNum){ this.dayNum = dayNum; }

            public int dayNum(){ return this.dayNum; }
            public GetPatientCaregiverHomePageInfoResponse dayNum(int dayNum){ this.dayNum = dayNum; return this; }
          
            /**
            *

 新消息数

            **/
            public int msgNum ;
            public int getMsgNum(){ return this.msgNum; }
            public void setMsgNum(int msgNum){ this.msgNum = msgNum; }

            public int msgNum(){ return this.msgNum; }
            public GetPatientCaregiverHomePageInfoResponse msgNum(int msgNum){ this.msgNum = msgNum; return this; }
          
            /**
            *

 预约数

            **/
            public int appointmentNum ;
            public int getAppointmentNum(){ return this.appointmentNum; }
            public void setAppointmentNum(int appointmentNum){ this.appointmentNum = appointmentNum; }

            public int appointmentNum(){ return this.appointmentNum; }
            public GetPatientCaregiverHomePageInfoResponse appointmentNum(int appointmentNum){ this.appointmentNum = appointmentNum; return this; }
          
            /**
            *

 标识是否购买过陪护套餐

            **/
            public boolean accompanyPackFlag ;
            public boolean getAccompanyPackFlag(){ return this.accompanyPackFlag; }
            public void setAccompanyPackFlag(boolean accompanyPackFlag){ this.accompanyPackFlag = accompanyPackFlag; }

            public boolean accompanyPackFlag(){ return this.accompanyPackFlag; }
            public GetPatientCaregiverHomePageInfoResponse accompanyPackFlag(boolean accompanyPackFlag){ this.accompanyPackFlag = accompanyPackFlag; return this; }
          
            /**
            *

 默认对话文本信息

            **/
            public Optional<String> replyCount = Optional.empty();
            public Optional<String> getReplyCount(){ return this.replyCount; }
            public void setReplyCount(Optional<String> replyCount){ this.replyCount = replyCount; }

            public Optional<String> replyCount(){ return this.replyCount; }
            public GetPatientCaregiverHomePageInfoResponse replyCount(Optional<String> replyCount){ this.replyCount = replyCount; return this; }
          
            /**
            *

 默认对话富文本信息

            **/
            public Optional<String> replyUrltext = Optional.empty();
            public Optional<String> getReplyUrltext(){ return this.replyUrltext; }
            public void setReplyUrltext(Optional<String> replyUrltext){ this.replyUrltext = replyUrltext; }

            public Optional<String> replyUrltext(){ return this.replyUrltext; }
            public GetPatientCaregiverHomePageInfoResponse replyUrltext(Optional<String> replyUrltext){ this.replyUrltext = replyUrltext; return this; }
          
            /**
            *

 默认对话富文本信息链接

            **/
            public Optional<String> replyUrl = Optional.empty();
            public Optional<String> getReplyUrl(){ return this.replyUrl; }
            public void setReplyUrl(Optional<String> replyUrl){ this.replyUrl = replyUrl; }

            public Optional<String> replyUrl(){ return this.replyUrl; }
            public GetPatientCaregiverHomePageInfoResponse replyUrl(Optional<String> replyUrl){ this.replyUrl = replyUrl; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("doctorInf").append("\":").append(this.doctorInf.isPresent()?this.doctorInf.get().toString():null).append(",");
    stringBuilder.append("\"").append("dayNum").append("\":").append(this.dayNum).append(",");
    stringBuilder.append("\"").append("msgNum").append("\":").append(this.msgNum).append(",");
    stringBuilder.append("\"").append("appointmentNum").append("\":").append(this.appointmentNum).append(",");
    stringBuilder.append("\"").append("accompanyPackFlag").append("\":").append(this.accompanyPackFlag).append(",");
    stringBuilder.append("\"").append("replyCount").append("\":\"").append(this.replyCount.isPresent()?this.replyCount.get():null).append("\",");
    stringBuilder.append("\"").append("replyUrltext").append("\":\"").append(this.replyUrltext.isPresent()?this.replyUrltext.get():null).append("\",");
    stringBuilder.append("\"").append("replyUrl").append("\":\"").append(this.replyUrl.isPresent()?this.replyUrl.get():null).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      