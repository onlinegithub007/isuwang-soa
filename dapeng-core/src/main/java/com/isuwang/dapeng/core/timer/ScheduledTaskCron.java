package com.isuwang.dapeng.core.timer;

import java.lang.annotation.*;

/**
 * Created by tangliu on 2016/8/17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ScheduledTaskCron {

    String cron() default "";

}
