package com.soft.example.data_structures.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.soft.example.beans.Person;

public class MapDemo {
  private Map<UUID, Person> persons; 

  public MapDemo() {
    persons = new HashMap<>();
  }

  public Person addPerson(Person person) {
    if (person == null) {
      return null;
    }
    persons.put(person.getId(), person); // add the person
    return getPerson(person.getId()); //return the person we just added
  }

  public Person getPerson(UUID id) {
    if (id == null || !persons.containsKey(id)) {
      return null;
    }
    return persons.get(id);
  }

  public static void main(String[] args) {
    MapDemo demo = new MapDemo();

    // Testing add method
    Person john = demo.addPerson(new Person("John Doe", "123456789", 'M', new Date()));
    Person jane = demo.addPerson(new Person("Jane Doe", "123456789", 'F', new Date()));

    // Testing getPerson method
    System.out.println("\n" + demo.getPerson(john.getId()));
  }
}
