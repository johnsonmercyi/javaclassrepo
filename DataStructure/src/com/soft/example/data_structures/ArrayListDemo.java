package com.soft.example.data_structures;

import java.util.ArrayList;
import java.util.Date;

import com.soft.example.beans.Person;

public class ArrayListDemo {

  ArrayList<Person> persons;

  //initialization
  public ArrayListDemo() {
    persons = new ArrayList<>();
  }

  public boolean addPerson(Person person) {
    if (person == null) {
      return false;
    }
    return persons.add(person);
  }

  public void addPerson(Person ...p) {
    if (p.length == 0) {
      return;
    }
    
    for (Person person : p) {
      if (person != null) {
        System.out.println(person);
        persons.add(person);
      }
    }
  }

  // public boolean addPerson(Person[] persons) {
  //   if (persons == null || persons.length == 0) {
  //     return false;
  //   }
  //   return persons.add(person);
  // }

  public Person getPerson(int index) {
    return persons.get(index);
  }

  public static void main(String[] args) {
    ArrayListDemo demo = new ArrayListDemo();

    // Testing addPerson
    Person john = new Person("John Doe", "123456789", 'M', new Date());
    Person jane = new Person("Jane Doe", "123456789", 'F', new Date());
    Person mary = new Person("Mary Lee", "123456789", 'F', new Date());

    demo.addPerson(john, jane, mary, null);

  }
}
