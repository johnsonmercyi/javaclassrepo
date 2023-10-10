package com.soft.example.data_structures.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
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

  public void addPersons(Person ...p) {
    if (p.length == 0) {
      return;
    }
    
    for (Person person : p) {
      if (person != null) {
        // System.out.println(person);
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
    
    //store filtered indexes here
    int indexHolder[] = new int[index.length];

    // filter indexes
    for(int i=0; i < index.length; i++){
      if((persons.size() - 1) >= index[i]){ // checks that the index falls within the valid range
        indexHolder[i] = index[i]; // A valid index is stored
      }else{
        indexHolder[i] = -1; // store -1 when index is invalid
      }
    }

    //valid persons list
    ArrayList<Person> holdPersons = new ArrayList<>();

    //fetch persons from list
    for(int i=0; i < indexHolder.length; i++){
      
      if(indexHolder[i] != -1){ // Checks that index isn't -1
        // if(persons.get(indexHolder[i]) != null){
          // Person p = persons.get(indexHolder[i]);
          //holdPersons.set(i, p);
          holdPersons.add(persons.get(indexHolder[i]));
          // System.out.println("index: "+ indexHolder[i]+ " - " + p);
        // }
      } else{
        // System.out.println(indexHolder[i]+" does not exits");
        holdPersons.add(null);
      } 
    }
    return holdPersons;
  }

  //converting person's arraylist to person array
  public static Person[] arrayListToArray(ArrayList<Person> p){
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

    demo.addPersons(john, jane, mary, null);
    //demo.getPersons(1,2,3,4,0,5,6,0);

    Person personsArray[] = arrayListToArray(demo.getPersons(1,2,3,4,0,5,6,0));
    System.out.println(Arrays.toString(personsArray));
  }
}
