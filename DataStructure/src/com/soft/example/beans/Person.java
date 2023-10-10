package com.soft.example.beans;

import java.util.Date;
import java.util.UUID;

public class Person {
  private UUID id;
  private String name;
  private String phone;
  private char gender;
  private Date birthDate;

  public Person(String name, String phone, char gender, Date birthDate) {
    id = UUID.randomUUID();
    this.name = name;
    this.phone = phone;
    this.gender = gender;
    this.birthDate = birthDate;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public char getGender() {
    return gender;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }

  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Person {name:" + name + ", phone:" + phone + ", gender:" + gender + ", birthDate:" + birthDate + "}";
  }
}
