package com.soft.anonymousclasses;

interface Animal {
  public String getSound();
  public void setSound(String sound);
}

public class AnonymousClassDemo {

  public Animal getAnimal() {
    return new Animal() {
      private String sound;

      @Override
      public String getSound() {
        return sound;
      }

      @Override
      public void setSound(String sound) {
        this.sound = sound;
      }
    };
  }

  

  public static void main(String[] args) {
    AnonymousClassDemo demo = new AnonymousClassDemo();
    
    Animal goat = demo.getAnimal();
    goat.setSound("meeeh...");
    System.out.println("\nGoats make " + goat.getSound() + " sound");

    Animal dog = demo.getAnimal();
    dog.setSound("wooof woof...");
    System.out.println("Dogs make " + dog.getSound() + " sound");
  }
}
