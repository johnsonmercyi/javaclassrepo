package com.soft.another_package;

import com.soft.demos.AccessModifier;

public class RunAccessModifier {

  private final AccessModifier am;

  public RunAccessModifier(AccessModifier am) {
    this.am = am;
  }

  public void doSomething() {
    // am.iAmDoingSomething();
  }
  
  public static void main(String[] args) {
    //entry point that should run first
    RunAccessModifier demo = new RunAccessModifier(new AccessModifier());
  }
}
