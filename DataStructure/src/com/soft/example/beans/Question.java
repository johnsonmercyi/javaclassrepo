package com.soft.example.beans;

import java.util.Map;
import java.util.UUID;

public class Question {

  private UUID id;
  private String question;
  private Map<Character, String> options;
  private char answer;
  private double mark;

  //the rest of the code implementation...

  public UUID getId() {
    return id;
  }
}
