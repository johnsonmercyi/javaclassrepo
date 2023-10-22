package com.soft.model;

public class Person {
  private String name;
  private int age;
  private char gender;

  public Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return the age
   */
  public int getAge() {
    return age;
  }
  /**
   * @param age the age to set
   */
  public void setAge(int age) {
    this.age = age;
  }
  /**
   * @return the gender
   */
  public char getGender() {
    return gender;
  }
  /**
   * @param gender the gender to set
   */
  public void setGender(char gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
  }

  
}
