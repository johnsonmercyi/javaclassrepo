package com.soft.inheritance;

public class Cat extends Animal {
  private static final String CAT_NAME = Cat.class.getSimpleName();

  public Cat() {
    this.name = CAT_NAME;
  }
}
