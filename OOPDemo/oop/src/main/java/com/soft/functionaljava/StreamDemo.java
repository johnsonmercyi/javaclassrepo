package com.soft.functionaljava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
  
  public static void testStream() {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Doe", 40));
    persons.add(new Person("Micheal Scofield", 55));
    persons.add(new Person("Don Mac", 24));
    persons.add(new Person("Little Jnr", 10));

    //filter by age
    // List<Person> filteredPersons = persons.stream()
    // .filter(person -> person.getAge() > 24)
    // .collect(Collectors.toList());

    // System.out.println(filteredPersons);

    //sort alphabetically
    // List<Person> sortedPersons = filteredPersons.stream()
    // .sorted(Comparator.comparing(Person::getName))
    // .collect(Collectors.toList());

    // System.out.println(sortedPersons);


    //do a map
    // List<String> mapPersons = sortedPersons.stream()
    // .map(person -> person.name + " is " + person.getAge() + " years old!")
    // .collect(Collectors.toList());

    // System.out.println(mapPersons);

    List<String> mappedFilteredSortedPersons = persons.stream()
    .filter(p -> p.getAge() > 20)
    .sorted(Comparator.comparing(Person::getName))
    .map(p -> p.getName() + " is " + p.getAge() + " years old!")
    .collect(Collectors.toList());

    System.out.println(mappedFilteredSortedPersons);
  }

  public static void main(String[] args) {
    testStream();
  }


  static class Person {
    private String name;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
      return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
      this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
      return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
      this.age = age;
    }

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name;
    }
  }
}
