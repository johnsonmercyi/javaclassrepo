package com.soft.nestedclasses;


class OuterClass {
  private int x, y;

  public OuterClass(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int calc(String operation) {
    if (operation.equals("sum")) {
      return x + y;
    } else if (operation.equals("minus")) {
      return x - y;
    }
    return 0;
  }

  static class InnerClass {
    public static String someHelperMethod() {
      return InnerClass.class.getSimpleName();
    }

    //other helper static methods here...
  }
}
public class NestedClassDemo {
  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass(5, 6);
    System.out.println("This class can do some calc like:\n" + outerClass.calc("sum") + "\n also has an inner class called: " + OuterClass.InnerClass.someHelperMethod());
  } 
}
