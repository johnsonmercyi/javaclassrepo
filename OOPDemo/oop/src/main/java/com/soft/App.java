package com.soft;

import com.soft.inheritance.Animal;
import com.soft.inheritance.Cat;
import com.soft.inheritance.Dog;
import com.soft.inheritance.GermanShepherd;

public class App {

  static class FibonacciCalculator {
  
    public static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1.
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
  }

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

    System.out.println("\nRecursion Asignment\n");
    int n = 10; // Calculate the 10th Fibonacci number
    long result = App.FibonacciCalculator.calculateFibonacci(n);
    System.out.println("The " + n + "th Fibonacci number is: " + result);
    
  }
}
