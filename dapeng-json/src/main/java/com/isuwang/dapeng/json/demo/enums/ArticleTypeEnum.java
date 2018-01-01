package com.isuwang.dapeng.json.demo.enums;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 推荐文章类型

        **/
        public enum ArticleTypeEnum implements com.isuwang.org.apache.thrift.TEnum{
        
            /**
            *

 抑郁症

            **/
            AC_SDS(1),
          
            /**
            *

 焦虑症

            **/
            AC_SAS(2),
          
            /**
            *

 失眠症

            **/
            AC_AIS(3),
          
            /**
            *

 精神分裂症

            **/
            AC_PSQI(4),
          
            /**
            *

 强迫症

            **/
            AC_QP(5),
          
            /**
            *

 其他

            **/
            AC_OTHER(99);
          

        private final int value;

        private ArticleTypeEnum(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static ArticleTypeEnum findByValue(int value){
            switch(value){
            
                 case 1:
                    return AC_SDS;
               
                 case 2:
                    return AC_SAS;
               
                 case 3:
                    return AC_AIS;
               
                 case 4:
                    return AC_PSQI;
               
                 case 5:
                    return AC_QP;
               
                 case 99:
                    return AC_OTHER;
               
               default:
                   return null;
            }
        }
        }
      