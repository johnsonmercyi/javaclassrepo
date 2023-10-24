package com.soft.functionaljava;
//Fuctional Java Programming

//First class functions
//It can be passed as a param to a function
//It can be assigned to a variable
//It can be returned from a function

//Lambda
//Functional Interface

@FunctionalInterface
interface Calculator<X, Y> {
  public X compute(X x, Y y);
}

public class FunctionalJava {
  public static void main(String[] args) {
    
    // It can be assigned to a variable
    Calculator<Integer, Integer> calc1 = (a, b) -> a + b;
    System.out.println(calc1.compute(2, 3));

    // It can be passed as a param to a function
    Calculator<Double, Double> calc2 = (a, b) -> a - b;
    System.out.println(doSubtraction(calc2));

    // It can be returned from a function
    Calculator<Long, Long> calc3 = doMultiplication();
    System.out.println(calc3.compute(2L, 3L));
  }

  public static double doSubtraction(Calculator<Double, Double> calc){
    return calc.compute(5.0, 3.0);
  }
  public static Calculator<Long, Long> doMultiplication() {
    Calculator<Long, Long> calc = (a, b) -> a * b;
    return calc;
  }
}
