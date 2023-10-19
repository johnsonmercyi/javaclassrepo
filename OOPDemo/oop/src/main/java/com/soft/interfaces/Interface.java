package com.soft.interfaces;

import com.soft.model.Person;

public interface Interface {
  public static final int LIMIT = 10;

  public Person getPerson(String id);
  // default void setPerson(Person p) {
  //   //
  // }
}
