package com.isuwang.dapeng.json.demo.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

诊疗方式

        **/
        public enum TOrderTherapyMode implements com.isuwang.org.apache.thrift.TEnum{
        
            /**
            *

APP

            **/
            APP(1),
          
            /**
            *

电话

            **/
            PHONE(2),
          
            /**
            *

面对面

            **/
            FACE2FACE(3);
          

        private final int value;

        private TOrderTherapyMode(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static TOrderTherapyMode findByValue(int value){
            switch(value){
            
                 case 1:
                    return APP;
               
                 case 2:
                    return PHONE;
               
                 case 3:
                    return FACE2FACE;
               
               default:
                   return null;
            }
        }
        }
      