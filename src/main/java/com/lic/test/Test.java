package com.lic.test;

import java.lang.reflect.Field;

public class Test {

  public static void main(String[] args) throws NoSuchFieldException {
    AnnTest annTest = new AnnTest();
    TypeAnn typeAnn = annTest.getClass().getAnnotation(TypeAnn.class);  //通过类对象获取到注解对象
    System.out.println(typeAnn.age());
    System.out.println(typeAnn.name());

    Field userName = annTest.getClass().getDeclaredField("userName");  //获取声明的属性
    FieldAnn annotation = userName.getAnnotation(FieldAnn.class);  //通过属性对象获取到注解对象
    System.out.println(annotation.value());

  }
}
