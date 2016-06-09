package com.demo.annotation;

import java.lang.annotation.*;

/**
 * Created by raist on 2016/4/11.
 *
 */

@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Demo {
    String Author();
    String Description();
    String Type();
}
