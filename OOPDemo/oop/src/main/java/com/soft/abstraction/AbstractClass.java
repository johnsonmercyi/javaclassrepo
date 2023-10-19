package com.soft.abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.soft.model.Person;

abstract class DataRepoContract {

  protected Person newPerson() {
    System.out.println("New person returned!");
    return new Person("John Doe", 20, 'M');
  }

  public abstract Person getPerson(UUID id);
  public abstract List<Person> persons();
  public abstract Person savePerson(Person person);

}

abstract class DataRepoService extends DataRepoContract {

  @Override
  public Person getPerson(UUID id) {
    return newPerson();
  }

  @Override
  public List<Person> persons() {
    return new ArrayList<Person>();
  }

}

class ChildDataRepoService extends DataRepoService {

  @Override
  public Person savePerson(Person person) {
    return person;
  }
  
}

class MySQLDataRepoService extends DataRepoContract {

  @Override
  public Person getPerson(UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPerson'");
  }

  @Override
  public List<Person> persons() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'persons'");
  }

  @Override
  public Person savePerson(Person person) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'savePerson'");
  }
  
}

class PostgresDataRepoService extends DataRepoContract {

  @Override
  public Person getPerson(UUID id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPerson'");
  }

  @Override
  public List<Person> persons() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'persons'");
  }

  @Override
  public Person savePerson(Person person) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'savePerson'");
  }

}

public class AbstractClass {
  public static void main(String[] args) {
    DataRepoContract repoService = new PostgresDataRepoService();
    repoService.newPerson();
  }
}


