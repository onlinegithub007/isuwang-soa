package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class PatientHomePageAppointment{
        
            /**
            *医生id
            **/
            public int doctorId ;
            public int getDoctorId(){ return this.doctorId; }
            public void setDoctorId(int doctorId){ this.doctorId = doctorId; }

            public int doctorId(){ return this.doctorId; }
            public PatientHomePageAppointment doctorId(int doctorId){ this.doctorId = doctorId; return this; }
          
            /**
            *医生名字
            **/
            public Optional<String> name = Optional.empty();
            public Optional<String> getName(){ return this.name; }
            public void setName(Optional<String> name){ this.name = name; }

            public Optional<String> name(){ return this.name; }
            public PatientHomePageAppointment name(Optional<String> name){ this.name = name; return this; }
          
            /**
            *医生电话
            **/
            public Optional<String> phone = Optional.empty();
            public Optional<String> getPhone(){ return this.phone; }
            public void setPhone(Optional<String> phone){ this.phone = phone; }

            public Optional<String> phone(){ return this.phone; }
            public PatientHomePageAppointment phone(Optional<String> phone){ this.phone = phone; return this; }
          
            /**
            *

 医生头像

            **/
            public Optional<String> headImage = Optional.empty();
            public Optional<String> getHeadImage(){ return this.headImage; }
            public void setHeadImage(Optional<String> headImage){ this.headImage = headImage; }

            public Optional<String> headImage(){ return this.headImage; }
            public PatientHomePageAppointment headImage(Optional<String> headImage){ this.headImage = headImage; return this; }
          
            /**
            *

 医生职称

            **/
            public Optional<String> jobTitle = Optional.empty();
            public Optional<String> getJobTitle(){ return this.jobTitle; }
            public void setJobTitle(Optional<String> jobTitle){ this.jobTitle = jobTitle; }

            public Optional<String> jobTitle(){ return this.jobTitle; }
            public PatientHomePageAppointment jobTitle(Optional<String> jobTitle){ this.jobTitle = jobTitle; return this; }
          
            /**
            *

 医生级别

            **/
            public int level ;
            public int getLevel(){ return this.level; }
            public void setLevel(int level){ this.level = level; }

            public int level(){ return this.level; }
            public PatientHomePageAppointment level(int level){ this.level = level; return this; }
          
            /**
            *特长标签
            **/
            public Optional<String> labels = Optional.empty();
            public Optional<String> getLabels(){ return this.labels; }
            public void setLabels(Optional<String> labels){ this.labels = labels; }

            public Optional<String> labels(){ return this.labels; }
            public PatientHomePageAppointment labels(Optional<String> labels){ this.labels = labels; return this; }
          
            /**
            *

 从业经历

            **/
            public Optional<String> jobExperience = Optional.empty();
            public Optional<String> getJobExperience(){ return this.jobExperience; }
            public void setJobExperience(Optional<String> jobExperience){ this.jobExperience = jobExperience; }

            public Optional<String> jobExperience(){ return this.jobExperience; }
            public PatientHomePageAppointment jobExperience(Optional<String> jobExperience){ this.jobExperience = jobExperience; return this; }
          
            /**
            *

 所属医院名称

            **/
            public Optional<String> hospitalName = Optional.empty();
            public Optional<String> getHospitalName(){ return this.hospitalName; }
            public void setHospitalName(Optional<String> hospitalName){ this.hospitalName = hospitalName; }

            public Optional<String> hospitalName(){ return this.hospitalName; }
            public PatientHomePageAppointment hospitalName(Optional<String> hospitalName){ this.hospitalName = hospitalName; return this; }
          
            /**
            *

    所属部门名称

            **/
            public Optional<String> departmentName = Optional.empty();
            public Optional<String> getDepartmentName(){ return this.departmentName; }
            public void setDepartmentName(Optional<String> departmentName){ this.departmentName = departmentName; }

            public Optional<String> departmentName(){ return this.departmentName; }
            public PatientHomePageAppointment departmentName(Optional<String> departmentName){ this.departmentName = departmentName; return this; }
          
            /**
            *

  预约类型

            **/
            public Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType = Optional.empty();
            public Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> getAppointmentType(){ return this.appointmentType; }
            public void setAppointmentType(Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType){ this.appointmentType = appointmentType; }

            public Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType(){ return this.appointmentType; }
            public PatientHomePageAppointment appointmentType(Optional<com.isuwang.dapeng.json.demo.enums.AppointmentType> appointmentType){ this.appointmentType = appointmentType; return this; }
          
            /**
            *

  医生提醒描述信息

            **/
            public Optional<String> docInfo = Optional.empty();
            public Optional<String> getDocInfo(){ return this.docInfo; }
            public void setDocInfo(Optional<String> docInfo){ this.docInfo = docInfo; }

            public Optional<String> docInfo(){ return this.docInfo; }
            public PatientHomePageAppointment docInfo(Optional<String> docInfo){ this.docInfo = docInfo; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("doctorId").append("\":").append(this.doctorId).append(",");
    stringBuilder.append("\"").append("name").append("\":\"").append(this.name.isPresent()?this.name.get():null).append("\",");
    stringBuilder.append("\"").append("phone").append("\":\"").append(this.phone.isPresent()?this.phone.get():null).append("\",");
    stringBuilder.append("\"").append("headImage").append("\":\"").append(this.headImage.isPresent()?this.headImage.get():null).append("\",");
    stringBuilder.append("\"").append("jobTitle").append("\":\"").append(this.jobTitle.isPresent()?this.jobTitle.get():null).append("\",");
    stringBuilder.append("\"").append("level").append("\":").append(this.level).append(",");
    stringBuilder.append("\"").append("labels").append("\":\"").append(this.labels.isPresent()?this.labels.get():null).append("\",");
    stringBuilder.append("\"").append("jobExperience").append("\":\"").append(this.jobExperience.isPresent()?this.jobExperience.get():null).append("\",");
    stringBuilder.append("\"").append("hospitalName").append("\":\"").append(this.hospitalName.isPresent()?this.hospitalName.get():null).append("\",");
    stringBuilder.append("\"").append("departmentName").append("\":\"").append(this.departmentName.isPresent()?this.departmentName.get():null).append("\",");
    stringBuilder.append("\"").append("appointmentType").append("\":").append(this.appointmentType.isPresent()?this.appointmentType.get():null).append(",");
    stringBuilder.append("\"").append("docInfo").append("\":\"").append(this.docInfo.isPresent()?this.docInfo.get():null).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      