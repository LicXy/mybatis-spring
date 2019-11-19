package com.lic.test;

@TypeAnn(name = "lic",age = "18")
public class AnnTest {

  @FieldAnn
  private String userName;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
