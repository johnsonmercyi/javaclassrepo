package com.soft;

import com.soft.demos.Child;
import com.soft.demos.Parent;

public class App {
  public static void main(String[] args) {
    Parent c = new Child();

    c.setName(" ");
    c.setAge(10);

    System.out.println(c);
  }
}
