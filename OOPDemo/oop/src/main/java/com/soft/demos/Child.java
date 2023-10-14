package com.soft.demos;

public class Child extends Parent {

  private String name;

  public void setName(String name) {
    name = name.trim();
    if (name == null || name.isEmpty())  {
      this.name = "Name is empty!";
    } else {
      this.name = name;
    }
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Child {" +
        "name='" + this.name + '\'' +
        ", age=" + this.getAge() +
        '}';
  }
}
