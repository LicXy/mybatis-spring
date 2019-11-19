package com.lic.test;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeAnn {

  String name() default "dafaultName";

  String age() default "15";

}


