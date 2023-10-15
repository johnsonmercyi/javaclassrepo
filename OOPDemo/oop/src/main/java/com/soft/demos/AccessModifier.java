package com.soft.demos;

import javafx.beans.binding.IntegerBinding;

public class AccessModifier {
  // private int num; // private variable
  // public String name; // public variable
  // protected String limited; // protected variable
  // String description; // default variable

  private String name;
  private int age;
  private static final int DEFAULT_AGE = 10;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getDetails() {
    return "Name: " + name + " Age: " + age;
  }

  //METHOD OVERLOADING

  /**
   * Set the details of this object
   * with a default `age` = `10`
   * @param name The name of this object
   */
  public void setDetails(String name) {
    this.setName(name);
    this.age = DEFAULT_AGE;
  }

  public void setDetails(int age) {
    this.setAge(age);
    this.name = "N/A";
  }

  public void setDetails(String name, int age) {
    this.setName(name);
    this.setAge(age);
  }

  public static void main(String[] args) {
    Parent p1 = new Parent();
    Number n1 = 0;
    Integer n2 = 10;
    boolean b1 = false;

    System.out.println(Boolean.valueOf(b1) instanceof Boolean);
    
  }
}
