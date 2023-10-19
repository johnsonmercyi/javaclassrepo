package com.soft.recursion;

public class Recursion {

  static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    
    int outcome = factorial(n - 1);
    System.out.println(n + " x " + outcome);
    return n * outcome;

    //5 * ...24 = 120
    //4 * ...6
    //3 * ...2
    //2 * ...1
    //1 * 1 // last recursion returns 1

    //⚠️dot dot dot (...) means waited for
  
  }
  
  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
