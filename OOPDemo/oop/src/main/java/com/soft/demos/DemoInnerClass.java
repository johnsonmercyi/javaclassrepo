package com.soft.demos;

public class DemoInnerClass {
  
  class Inner {
    public void innerMethod() {
      System.out.println("innerMethod");
    }
  }

  public static void main(String[] args) {
    DemoInnerClass demo = new DemoInnerClass();
    // one way when it is not static inner class
    Inner inner = demo.new Inner();
    inner.innerMethod();

    // another way when it is static inner class
    // DemoInnerClass.Inner inner = new Inner();

    // another way when it is static inner class
    // DemoInnerClass.Inner.innerMethod();
  }
}
