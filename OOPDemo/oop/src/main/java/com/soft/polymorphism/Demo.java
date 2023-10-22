package com.soft.polymorphism;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Language {
  public String displayLanguage() {
    return this.getClass().getSimpleName() + " is the default language!";
  }
}

class English extends Language {
  @Override
  public String displayLanguage() {
    return this.getClass().getSimpleName() + " is your chosen language!";
  }
}

class Java extends Language {
  @Override
  public String displayLanguage() {
    return this.getClass().getSimpleName() + " is your preffered language for coding!";
  }
}

public class Demo {

  //Polymorphic methods through overloading
  public int calculate(int num1, int num2) {
    return num1 + num2;
  }

  public int calculate(int num1) {
    return num1 + num1;
  }

  public int calculate() {
    return 0;
  }

  public String calculate(String txt1, String txt2) {
    return txt1 + txt2;
  }

  public String calculate(int num1, String txt2) {
    return num1 + txt2;
  }

  public static void main(String[] args) {
    Language lang = new Language();
    System.out.println();//empty line
    System.out.println(lang.displayLanguage());

    lang = new English();
    System.out.println(lang.displayLanguage());

    lang = new Java();
    System.out.println(lang.displayLanguage());

    Map<String, String> maps = new LinkedHashMap<>();
    maps.put(null, null);

    maps = new HashMap<>();
    maps.put(null, null);
  }
}
