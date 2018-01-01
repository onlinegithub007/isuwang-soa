package com.isuwang.dapeng.json.demo.domain;

        import java.util.Optional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        *

 订单列表响应

        **/
        public class ListOrderResponse{
        
            /**
            *

  订单列表

            **/
            public java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> orders = new java.util.ArrayList();
            public java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> getOrders(){ return this.orders; }
            public void setOrders(java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> orders){ this.orders = orders; }

            public java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> orders(){ return this.orders; }
            public ListOrderResponse orders(java.util.List<com.isuwang.dapeng.json.demo.domain.OrderItem> orders){ this.orders = orders; return this; }
          
            /**
            *

  分页查询响应

            **/
            public com.isuwang.dapeng.json.demo.domain.PageResponse pageResponse ;
            public com.isuwang.dapeng.json.demo.domain.PageResponse getPageResponse(){ return this.pageResponse; }
            public void setPageResponse(com.isuwang.dapeng.json.demo.domain.PageResponse pageResponse){ this.pageResponse = pageResponse; }

            public com.isuwang.dapeng.json.demo.domain.PageResponse pageResponse(){ return this.pageResponse; }
            public ListOrderResponse pageResponse(com.isuwang.dapeng.json.demo.domain.PageResponse pageResponse){ this.pageResponse = pageResponse; return this; }
          
            /**
            *

 合计线上有效预约金额

            **/
            public double sumAmount ;
            public double getSumAmount(){ return this.sumAmount; }
            public void setSumAmount(double sumAmount){ this.sumAmount = sumAmount; }

            public double sumAmount(){ return this.sumAmount; }
            public ListOrderResponse sumAmount(double sumAmount){ this.sumAmount = sumAmount; return this; }
          
            /**
            *

 合计线下有效预约金额

            **/
            public double sumOffLineAmount ;
            public double getSumOffLineAmount(){ return this.sumOffLineAmount; }
            public void setSumOffLineAmount(double sumOffLineAmount){ this.sumOffLineAmount = sumOffLineAmount; }

            public double sumOffLineAmount(){ return this.sumOffLineAmount; }
            public ListOrderResponse sumOffLineAmount(double sumOffLineAmount){ this.sumOffLineAmount = sumOffLineAmount; return this; }
          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("orders").append("\":").append(this.orders).append(",");
    stringBuilder.append("\"").append("pageResponse").append("\":").append(this.pageResponse.toString()).append(",");
    stringBuilder.append("\"").append("sumAmount").append("\":").append(this.sumAmount).append(",");
    stringBuilder.append("\"").append("sumOffLineAmount").append("\":").append(this.sumOffLineAmount).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      