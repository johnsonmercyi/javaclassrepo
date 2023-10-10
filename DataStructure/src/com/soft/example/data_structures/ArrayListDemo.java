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

  // public void addPerson(Person[] p) {
  //   if (p.length == 0) {
  //     return;
  //   }

  //   for (Person person : p) {
  //     if (person != null) {
  //       System.out.println(person);
  //       persons.add(person);
  //     }
  //   }
  // }

  public Person getPerson(int index) {
    return persons.get(index);
  }

  //get many persons from the list = getPersons()
  /**
   * @param index
   * @return
   */
  public ArrayList<Person> getPersons(int ...index){
    if(index.length == 0){
      return null;
    }
    int indexHolder[] = new int[index.length];
    for(int i=0; i < index.length; i++){
      if(persons.size() - 1 >= index[i]){
        indexHolder[i] = index[i];
      }else{
        indexHolder[i] = -1;
      }
    }

    ArrayList<Person> holdPersons = new ArrayList<>();
    for(int i=0; i < indexHolder.length; i++){
      if(indexHolder.length-1 > indexHolder[i] && indexHolder[i] != -1){ 
        
        if(persons.get(indexHolder[i]) != null){
          Person p = persons.get(indexHolder[i]);
          //holdPersons.set(i, p);
          holdPersons.add(p);
          System.out.println("index: "+ indexHolder[i]+ " - " + p);
        }
      } else{
        System.out.println(indexHolder[i]+" does not exits");
      } 
    }
    return holdPersons;
  }

  //converting person's arraylist to person array
  public Person[] arrayListToArray(ArrayList<Person> p){
    Person personsArray[] = new Person[p.size()];
    for(int i = 0; i < p.size(); i++){
      personsArray[i] = p.get(i);
    }
    return personsArray;
  }

  //Method to return length of an arraylist
  public int getPersonLength(ArrayList<Person> p){
    return p.size();
  }

  //method to set arraylist using index number
  public Person setPerson(int index, Person p){
    return persons.set(index, p);
  }

  //method to remove all elements in the arraylist
  public void clearPersonlist(ArrayList<Person> p){
    p.clear();
  }

  public static void main(String[] args) {
    ArrayListDemo demo = new ArrayListDemo();

    // Testing addPerson
    Person john = new Person("John Doe", "123456789", 'M', new Date());
    Person jane = new Person("Jane Doe", "123456789", 'F', new Date());
    Person mary = new Person("Mary Lee", "123456789", 'F', new Date());

    demo.addPerson(john, jane, mary, null);
    demo.getPersons(1,2,3,4,0,5,6,0);
                              

  }
}
