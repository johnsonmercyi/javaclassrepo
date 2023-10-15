package com.soft.demos;

public class Parent {
  //set of variables is the state of an object
  private String name;
  private int age;

  public Parent() {
    name = "Parent";
    age = 50;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Parent{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  private static class SomeOtherParent {
    //implementation...
  }
}
