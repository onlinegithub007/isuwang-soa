package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class OrderItem{
        
            /**
            *

 订单 ID

            **/
            public int id ;
            public int getId(){ return this.id; }
            public void setId(int id){ this.id = id; }

            public int id(){ return this.id; }
            public OrderItem id(int id){ this.id = id; return this; }
          
            /**
            *

 医生 ID

            **/
            public int doctorId ;
            public int getDoctorId(){ return this.doctorId; }
            public void setDoctorId(int doctorId){ this.doctorId = doctorId; }

            public int doctorId(){ return this.doctorId; }
            public OrderItem doctorId(int doctorId){ this.doctorId = doctorId; return this; }
          
            /**
            *

 患者 ID

            **/
            public int patientId ;
            public int getPatientId(){ return this.patientId; }
            public void setPatientId(int patientId){ this.patientId = patientId; }

            public int patientId(){ return this.patientId; }
            public OrderItem patientId(int patientId){ this.patientId = patientId; return this; }
          
            /**
            *

 患者补充的症状描述

            **/
            public Optional<String> patientInformationContent = Optional.empty();
            public Optional<String> getPatientInformationContent(){ return this.patientInformationContent; }
            public void setPatientInformationContent(Optional<String> patientInformationContent){ this.patientInformationContent = patientInformationContent; }

            public Optional<String> patientInformationContent(){ return this.patientInformationContent; }
            public OrderItem patientInformationContent(Optional<String> patientInformationContent){ this.patientInformationContent = patientInformationContent; return this; }
          
            /**
            *

 诊断信息ID

            **/
            public Optional<Integer> diagnoseId = Optional.empty();
            public Optional<Integer> getDiagnoseId(){ return this.diagnoseId; }
            public void setDiagnoseId(Optional<Integer> diagnoseId){ this.diagnoseId = diagnoseId; }

            public Optional<Integer> diagnoseId(){ return this.diagnoseId; }
            public OrderItem diagnoseId(Optional<Integer> diagnoseId){ this.diagnoseId = diagnoseId; return this; }
          
            /**
            *

 预约信息 ID

            **/
            public int appointmentId ;
            public int getAppointmentId(){ return this.appointmentId; }
            public void setAppointmentId(int appointmentId){ this.appointmentId = appointmentId; }

            public int appointmentId(){ return this.appointmentId; }
            public OrderItem appointmentId(int appointmentId){ this.appointmentId = appointmentId; return this; }
          
            /**
            *

 结算状态,1:新建[已挂号,未缴纳就诊费用](init);2:待诊断[已缴纳就诊费用](waiting_diagnosis);3:已过期[挂号后没在设定时间缴纳就诊费用](expired);4:已诊断[正常诊断完毕](confirmed_diagnosis);5:已退款[异常情况导致退诊断费用](refund)

            **/
            public com.isuwang.dapeng.json.demo.enums.TOrderStatus status ;
            public com.isuwang.dapeng.json.demo.enums.TOrderStatus getStatus(){ return this.status; }
            public void setStatus(com.isuwang.dapeng.json.demo.enums.TOrderStatus status){ this.status = status; }

            public com.isuwang.dapeng.json.demo.enums.TOrderStatus status(){ return this.status; }
            public OrderItem status(com.isuwang.dapeng.json.demo.enums.TOrderStatus status){ this.status = status; return this; }
          
            /**
            *

 治疗费

            **/
            public double therapyAmount ;
            public double getTherapyAmount(){ return this.therapyAmount; }
            public void setTherapyAmount(double therapyAmount){ this.therapyAmount = therapyAmount; }

            public double therapyAmount(){ return this.therapyAmount; }
            public OrderItem therapyAmount(double therapyAmount){ this.therapyAmount = therapyAmount; return this; }
          
            /**
            *

 折扣后治疗费

            **/
            public double discountTherapyAmount ;
            public double getDiscountTherapyAmount(){ return this.discountTherapyAmount; }
            public void setDiscountTherapyAmount(double discountTherapyAmount){ this.discountTherapyAmount = discountTherapyAmount; }

            public double discountTherapyAmount(){ return this.discountTherapyAmount; }
            public OrderItem discountTherapyAmount(double discountTherapyAmount){ this.discountTherapyAmount = discountTherapyAmount; return this; }
          
            /**
            *

 缴费过期时间

            **/
            public long registrationExpireTime ;
            public long getRegistrationExpireTime(){ return this.registrationExpireTime; }
            public void setRegistrationExpireTime(long registrationExpireTime){ this.registrationExpireTime = registrationExpireTime; }

            public long registrationExpireTime(){ return this.registrationExpireTime; }
            public OrderItem registrationExpireTime(long registrationExpireTime){ this.registrationExpireTime = registrationExpireTime; return this; }
          
            /**
            *

  预约诊断开始时间

            **/
            public long therapyBeginTime ;
            public long getTherapyBeginTime(){ return this.therapyBeginTime; }
            public void setTherapyBeginTime(long therapyBeginTime){ this.therapyBeginTime = therapyBeginTime; }

            public long therapyBeginTime(){ return this.therapyBeginTime; }
            public OrderItem therapyBeginTime(long therapyBeginTime){ this.therapyBeginTime = therapyBeginTime; return this; }
          
            /**
            *

  预约诊断结束时间

            **/
            public long therapyEndTime ;
            public long getTherapyEndTime(){ return this.therapyEndTime; }
            public void setTherapyEndTime(long therapyEndTime){ this.therapyEndTime = therapyEndTime; }

            public long therapyEndTime(){ return this.therapyEndTime; }
            public OrderItem therapyEndTime(long therapyEndTime){ this.therapyEndTime = therapyEndTime; return this; }
          
            /**
            *

 创建时间

            **/
            public long createdAt ;
            public long getCreatedAt(){ return this.createdAt; }
            public void setCreatedAt(long createdAt){ this.createdAt = createdAt; }

            public long createdAt(){ return this.createdAt; }
            public OrderItem createdAt(long createdAt){ this.createdAt = createdAt; return this; }
          
            /**
            *



            **/
            public int createdBy ;
            public int getCreatedBy(){ return this.createdBy; }
            public void setCreatedBy(int createdBy){ this.createdBy = createdBy; }

            public int createdBy(){ return this.createdBy; }
            public OrderItem createdBy(int createdBy){ this.createdBy = createdBy; return this; }
          
            /**
            *

 更新时间

            **/
            public long updatedAt ;
            public long getUpdatedAt(){ return this.updatedAt; }
            public void setUpdatedAt(long updatedAt){ this.updatedAt = updatedAt; }

            public long updatedAt(){ return this.updatedAt; }
            public OrderItem updatedAt(long updatedAt){ this.updatedAt = updatedAt; return this; }
          
            /**
            *



            **/
            public int updatedBy ;
            public int getUpdatedBy(){ return this.updatedBy; }
            public void setUpdatedBy(int updatedBy){ this.updatedBy = updatedBy; }

            public int updatedBy(){ return this.updatedBy; }
            public OrderItem updatedBy(int updatedBy){ this.updatedBy = updatedBy; return this; }
          
            /**
            *



            **/
            public Optional<String> remark = Optional.empty();
            public Optional<String> getRemark(){ return this.remark; }
            public void setRemark(Optional<String> remark){ this.remark = remark; }

            public Optional<String> remark(){ return this.remark; }
            public OrderItem remark(Optional<String> remark){ this.remark = remark; return this; }
          
            /**
            *

 支付平台的唯一订单号

            **/
            public Optional<String> transactionId = Optional.empty();
            public Optional<String> getTransactionId(){ return this.transactionId; }
            public void setTransactionId(Optional<String> transactionId){ this.transactionId = transactionId; }

            public Optional<String> transactionId(){ return this.transactionId; }
            public OrderItem transactionId(Optional<String> transactionId){ this.transactionId = transactionId; return this; }
          
            /**
            *

 预约订单的唯一订单号

            **/
            public String orderNum ;
            public String getOrderNum(){ return this.orderNum; }
            public void setOrderNum(String orderNum){ this.orderNum = orderNum; }

            public String orderNum(){ return this.orderNum; }
            public OrderItem orderNum(String orderNum){ this.orderNum = orderNum; return this; }
          
            /**
            *

 支付类型,1:支付宝(alipay);2:微信(wechat);

            **/
            public com.isuwang.dapeng.json.demo.enums.TOrderPayType payType ;
            public com.isuwang.dapeng.json.demo.enums.TOrderPayType getPayType(){ return this.payType; }
            public void setPayType(com.isuwang.dapeng.json.demo.enums.TOrderPayType payType){ this.payType = payType; }

            public com.isuwang.dapeng.json.demo.enums.TOrderPayType payType(){ return this.payType; }
            public OrderItem payType(com.isuwang.dapeng.json.demo.enums.TOrderPayType payType){ this.payType = payType; return this; }
          
            /**
            *

  付款超时剩余秒数

            **/
            public Optional<Long> expireRemainSeconds = Optional.empty();
            public Optional<Long> getExpireRemainSeconds(){ return this.expireRemainSeconds; }
            public void setExpireRemainSeconds(Optional<Long> expireRemainSeconds){ this.expireRemainSeconds = expireRemainSeconds; }

            public Optional<Long> expireRemainSeconds(){ return this.expireRemainSeconds; }
            public OrderItem expireRemainSeconds(Optional<Long> expireRemainSeconds){ this.expireRemainSeconds = expireRemainSeconds; return this; }
          
            /**
            *

  预约类型

            **/
            public com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType ;
            public com.isuwang.dapeng.json.demo.enums.AppointmentType getAppointmentType(){ return this.appointmentType; }
            public void setAppointmentType(com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType){ this.appointmentType = appointmentType; }

            public com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType(){ return this.appointmentType; }
            public OrderItem appointmentType(com.isuwang.dapeng.json.demo.enums.AppointmentType appointmentType){ this.appointmentType = appointmentType; return this; }
          
            /**
            *

  医生信息

            **/
            public com.isuwang.dapeng.json.demo.domain.DoctorInfo doctorInfo ;
            public com.isuwang.dapeng.json.demo.domain.DoctorInfo getDoctorInfo(){ return this.doctorInfo; }
            public void setDoctorInfo(com.isuwang.dapeng.json.demo.domain.DoctorInfo doctorInfo){ this.doctorInfo = doctorInfo; }

            public com.isuwang.dapeng.json.demo.domain.DoctorInfo doctorInfo(){ return this.doctorInfo; }
            public OrderItem doctorInfo(com.isuwang.dapeng.json.demo.domain.DoctorInfo doctorInfo){ this.doctorInfo = doctorInfo; return this; }
          
            /**
            *

(已预约)患者信息

            **/
            public com.isuwang.dapeng.json.demo.domain.PatientInfo patientInfo ;
            public com.isuwang.dapeng.json.demo.domain.PatientInfo getPatientInfo(){ return this.patientInfo; }
            public void setPatientInfo(com.isuwang.dapeng.json.demo.domain.PatientInfo patientInfo){ this.patientInfo = patientInfo; }

            public com.isuwang.dapeng.json.demo.domain.PatientInfo patientInfo(){ return this.patientInfo; }
            public OrderItem patientInfo(com.isuwang.dapeng.json.demo.domain.PatientInfo patientInfo){ this.patientInfo = patientInfo; return this; }
          
            /**
            *

 父订单id;

            **/
            public Optional<Integer> parentId = Optional.empty();
            public Optional<Integer> getParentId(){ return this.parentId; }
            public void setParentId(Optional<Integer> parentId){ this.parentId = parentId; }

            public Optional<Integer> parentId(){ return this.parentId; }
            public OrderItem parentId(Optional<Integer> parentId){ this.parentId = parentId; return this; }
          
            /**
            *

 线下患者id;

            **/
            public Optional<Integer> offlinePatientId = Optional.empty();
            public Optional<Integer> getOfflinePatientId(){ return this.offlinePatientId; }
            public void setOfflinePatientId(Optional<Integer> offlinePatientId){ this.offlinePatientId = offlinePatientId; }

            public Optional<Integer> offlinePatientId(){ return this.offlinePatientId; }
            public OrderItem offlinePatientId(Optional<Integer> offlinePatientId){ this.offlinePatientId = offlinePatientId; return this; }
          
            /**
            *

诊疗方式

            **/
            public com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode therapyMode ;
            public com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode getTherapyMode(){ return this.therapyMode; }
            public void setTherapyMode(com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode therapyMode){ this.therapyMode = therapyMode; }

            public com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode therapyMode(){ return this.therapyMode; }
            public OrderItem therapyMode(com.isuwang.dapeng.json.demo.enums.TOrderTherapyMode therapyMode){ this.therapyMode = therapyMode; return this; }
          
            /**
            *

诊疗方式

            **/
            public Optional<String> uuid = Optional.empty();
            public Optional<String> getUuid(){ return this.uuid; }
            public void setUuid(Optional<String> uuid){ this.uuid = uuid; }

            public Optional<String> uuid(){ return this.uuid; }
            public OrderItem uuid(Optional<String> uuid){ this.uuid = uuid; return this; }
          
            /**
            *

 医生是否已查看患者新单

            **/
            public Optional<Boolean> read = Optional.empty();
            public Optional<Boolean> getRead(){ return this.read; }
            public void setRead(Optional<Boolean> read){ this.read = read; }

            public Optional<Boolean> read(){ return this.read; }
            public OrderItem read(Optional<Boolean> read){ this.read = read; return this; }
          
            /**
            *

 知心陪护套餐类型、天数

            **/
            public Optional<com.isuwang.dapeng.json.demo.enums.AccompanyPackEnum> accompanyPackDays = Optional.empty();
            public Optional<com.isuwang.dapeng.json.demo.enums.AccompanyPackEnum> getAccompanyPackDays(){ return this.accompanyPackDays; }
            public void setAccompanyPackDays(Optional<com.isuwang.dapeng.json.demo.enums.AccompanyPackEnum> accompanyPackDays){ this.accompanyPackDays = accompanyPackDays; }

            public Optional<com.isuwang.dapeng.json.demo.enums.AccompanyPackEnum> accompanyPackDays(){ return this.accompanyPackDays; }
            public OrderItem accompanyPackDays(Optional<com.isuwang.dapeng.json.demo.enums.AccompanyPackEnum> accompanyPackDays){ this.accompanyPackDays = accompanyPackDays; return this; }
          
            /**
            *

 知心陪护套餐类型、天数

            **/
            public double couponAmount ;
            public double getCouponAmount(){ return this.couponAmount; }
            public void setCouponAmount(double couponAmount){ this.couponAmount = couponAmount; }

            public double couponAmount(){ return this.couponAmount; }
            public OrderItem couponAmount(double couponAmount){ this.couponAmount = couponAmount; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("id").append("\":").append(this.id).append(",");
    stringBuilder.append("\"").append("doctorId").append("\":").append(this.doctorId).append(",");
    stringBuilder.append("\"").append("patientId").append("\":").append(this.patientId).append(",");
    stringBuilder.append("\"").append("patientInformationContent").append("\":\"").append(this.patientInformationContent.isPresent()?this.patientInformationContent.get():null).append("\",");
    stringBuilder.append("\"").append("diagnoseId").append("\":").append(this.diagnoseId.isPresent()?this.diagnoseId.get():null).append(",");
    stringBuilder.append("\"").append("appointmentId").append("\":").append(this.appointmentId).append(",");
    stringBuilder.append("\"").append("status").append("\":").append(this.status).append(",");
    stringBuilder.append("\"").append("therapyAmount").append("\":").append(this.therapyAmount).append(",");
    stringBuilder.append("\"").append("discountTherapyAmount").append("\":").append(this.discountTherapyAmount).append(",");
    stringBuilder.append("\"").append("registrationExpireTime").append("\":").append(this.registrationExpireTime).append(",");
    stringBuilder.append("\"").append("therapyBeginTime").append("\":").append(this.therapyBeginTime).append(",");
    stringBuilder.append("\"").append("therapyEndTime").append("\":").append(this.therapyEndTime).append(",");
    stringBuilder.append("\"").append("createdAt").append("\":").append(this.createdAt).append(",");
    stringBuilder.append("\"").append("createdBy").append("\":").append(this.createdBy).append(",");
    stringBuilder.append("\"").append("updatedAt").append("\":").append(this.updatedAt).append(",");
    stringBuilder.append("\"").append("updatedBy").append("\":").append(this.updatedBy).append(",");
    stringBuilder.append("\"").append("remark").append("\":\"").append(this.remark.isPresent()?this.remark.get():null).append("\",");
    stringBuilder.append("\"").append("transactionId").append("\":\"").append(this.transactionId.isPresent()?this.transactionId.get():null).append("\",");
    stringBuilder.append("\"").append("orderNum").append("\":\"").append(this.orderNum).append("\",");
    stringBuilder.append("\"").append("payType").append("\":").append(this.payType).append(",");
    stringBuilder.append("\"").append("expireRemainSeconds").append("\":").append(this.expireRemainSeconds.isPresent()?this.expireRemainSeconds.get():null).append(",");
    stringBuilder.append("\"").append("appointmentType").append("\":").append(this.appointmentType).append(",");
    stringBuilder.append("\"").append("doctorInfo").append("\":").append(this.doctorInfo.toString()).append(",");
    stringBuilder.append("\"").append("patientInfo").append("\":").append(this.patientInfo.toString()).append(",");
    stringBuilder.append("\"").append("parentId").append("\":").append(this.parentId.isPresent()?this.parentId.get():null).append(",");
    stringBuilder.append("\"").append("offlinePatientId").append("\":").append(this.offlinePatientId.isPresent()?this.offlinePatientId.get():null).append(",");
    stringBuilder.append("\"").append("therapyMode").append("\":").append(this.therapyMode).append(",");
    stringBuilder.append("\"").append("uuid").append("\":\"").append(this.uuid.isPresent()?this.uuid.get():null).append("\",");
    stringBuilder.append("\"").append("read").append("\":").append(this.read.isPresent()?this.read.get():null).append(",");
    stringBuilder.append("\"").append("accompanyPackDays").append("\":").append(this.accompanyPackDays.isPresent()?this.accompanyPackDays.get():null).append(",");
    stringBuilder.append("\"").append("couponAmount").append("\":").append(this.couponAmount).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      