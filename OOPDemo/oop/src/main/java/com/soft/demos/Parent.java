package com.soft.demos;

public class Parent {
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
}
