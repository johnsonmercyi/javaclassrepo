package com.soft.inheritance;

public class Dog extends Animal {

  public Dog() {
    super();
    this.name = Dog.class.getSimpleName();
  }

}
