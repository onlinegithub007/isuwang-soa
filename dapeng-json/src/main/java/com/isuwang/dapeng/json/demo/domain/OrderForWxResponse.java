package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *
        **/
        public class OrderForWxResponse{
        
            /**
            *
            **/
            public String appid ;
            public String getAppid(){ return this.appid; }
            public void setAppid(String appid){ this.appid = appid; }

            public String appid(){ return this.appid; }
            public OrderForWxResponse appid(String appid){ this.appid = appid; return this; }
          
            /**
            *
            **/
            public String partnerid ;
            public String getPartnerid(){ return this.partnerid; }
            public void setPartnerid(String partnerid){ this.partnerid = partnerid; }

            public String partnerid(){ return this.partnerid; }
            public OrderForWxResponse partnerid(String partnerid){ this.partnerid = partnerid; return this; }
          
            /**
            *
            **/
            public String prepayid ;
            public String getPrepayid(){ return this.prepayid; }
            public void setPrepayid(String prepayid){ this.prepayid = prepayid; }

            public String prepayid(){ return this.prepayid; }
            public OrderForWxResponse prepayid(String prepayid){ this.prepayid = prepayid; return this; }
          
            /**
            *
            **/
            public String _package ;
            public String get_package(){ return this._package; }
            public void set_package(String _package){ this._package = _package; }

            public String _package(){ return this._package; }
            public OrderForWxResponse _package(String _package){ this._package = _package; return this; }
          
            /**
            *
            **/
            public String noncestr ;
            public String getNoncestr(){ return this.noncestr; }
            public void setNoncestr(String noncestr){ this.noncestr = noncestr; }

            public String noncestr(){ return this.noncestr; }
            public OrderForWxResponse noncestr(String noncestr){ this.noncestr = noncestr; return this; }
          
            /**
            *
            **/
            public String timestamp ;
            public String getTimestamp(){ return this.timestamp; }
            public void setTimestamp(String timestamp){ this.timestamp = timestamp; }

            public String timestamp(){ return this.timestamp; }
            public OrderForWxResponse timestamp(String timestamp){ this.timestamp = timestamp; return this; }
          
            /**
            *
            **/
            public String sign ;
            public String getSign(){ return this.sign; }
            public void setSign(String sign){ this.sign = sign; }

            public String sign(){ return this.sign; }
            public OrderForWxResponse sign(String sign){ this.sign = sign; return this; }
          
            /**
            * 微信下单是否成功 
            **/
            public boolean returnCode ;
            public boolean getReturnCode(){ return this.returnCode; }
            public void setReturnCode(boolean returnCode){ this.returnCode = returnCode; }

            public boolean returnCode(){ return this.returnCode; }
            public OrderForWxResponse returnCode(boolean returnCode){ this.returnCode = returnCode; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("appid").append("\":\"").append(this.appid).append("\",");
    stringBuilder.append("\"").append("partnerid").append("\":\"").append(this.partnerid).append("\",");
    stringBuilder.append("\"").append("prepayid").append("\":\"").append(this.prepayid).append("\",");
    stringBuilder.append("\"").append("_package").append("\":\"").append(this._package).append("\",");
    stringBuilder.append("\"").append("noncestr").append("\":\"").append(this.noncestr).append("\",");
    stringBuilder.append("\"").append("timestamp").append("\":\"").append(this.timestamp).append("\",");
    stringBuilder.append("\"").append("sign").append("\":\"").append(this.sign).append("\",");
    stringBuilder.append("\"").append("returnCode").append("\":").append(this.returnCode).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      