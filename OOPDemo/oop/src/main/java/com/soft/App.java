package com.soft;

import com.soft.inheritance.Animal;
import com.soft.inheritance.Cat;
import com.soft.inheritance.Dog;
import com.soft.inheritance.GermanShepherd;

public class App {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal gs = new GermanShepherd();

    // animal.setName("Animal");
    // animal.setSound("Moooo...");

    // System.out.println(cat.getName());
    // System.out.println(dog.getName());
    System.out.println(animal);
  }
}
