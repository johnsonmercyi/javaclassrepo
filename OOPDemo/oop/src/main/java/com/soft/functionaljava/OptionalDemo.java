package com.soft.functionaljava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
  
  static List<Person> persons = new ArrayList<>();
  static Map<Integer, String> fruits = new HashMap<>();

  static void addFruits(int key, String fruit) {
    fruits.put(key, fruit);
  }

  static void filterFruits() {
    List<Map.Entry<Integer, String>> filteredFruits = fruits.entrySet().stream()
    .filter(entry -> entry.getKey() < 5)
    .collect(Collectors.toList());
    // System.out.println(filteredFruits);
    
    List<String> mappedFruits = filteredFruits.stream()
    .map(p -> p.getValue() + " is mapped to " + p.getKey())
    .collect(Collectors.toList());
    System.out.println(mappedFruits);

    //⚠️ See if you can filter and map to strings through stream chaining
    List<String> filterMapFruits = fruits.entrySet().stream()
      .filter(entry -> entry.getKey() < 4)
      .map(p -> p.getValue() + " is mapped to " + p.getKey())
      .collect(Collectors.toList());
      System.out.println(filterMapFruits);
    
  }

  static void addPerson(Person person) {
    persons.add(person);
  }

  static Optional<Person> fetchPersonByName(String name) {
    return persons.stream()
    .filter(p->p.getName().equals(name))
    .findFirst();
  }

  public static void main(String[] args) {
    // addPerson(new Person("John", 30));
    // addPerson(new Person("Mary", 20));
    // addPerson(new Person("Mark", 25));

    // Optional<Person> optionalPerson = fetchPersonByName("Mac");

    // Person p = optionalPerson
    //            .orElse(new Person()); // prepare for when optional is empty or null or has no such element

    // System.out.println(p);

    addFruits(1, "Orange");
    addFruits(2, "Mango");
    addFruits(3, "Pineapple");
    addFruits(4, "Tangerine");
    addFruits(7, "Grapes");
    addFruits(10, "Apple");

    filterFruits();
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

    public Person() {
      this("No Person found!", 0);
    }

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public Person getPerson() {
      return this;
    }

    @Override
    public String toString() {
      return name + " - " + age;
    }
  }
}
