package com.soft.example.data_structures.array;

public class ArrayDemo {

  String[] names = new String[2];

  public boolean add(int index, String name) {
    if (index >= names.length || index < 0 || names.length <= 0) {
      return false;
    }

    if (name.isEmpty()) {
      return false;
    }

    names[index] = name; // assign name to the specified index
    return names[index] == name; // assert that the element contains the name
  }

  private int index = 0;
  public boolean add(String item) {
    if (item.isEmpty()) {
      return false;
    }

    String[] tempArray;//create an array variable without a size

    if (index < names.length) {
      names[index++] = item;
      // System.out.println(Arrays.toString(names));
      return true;
    } else if (index >= names.length) {
      tempArray = new String[names.length + 2];//initialize the new array variable with a bigger size
      System.arraycopy(names, 0, tempArray, 0, names.length);//copies the content of the old array into the new one
      tempArray[index++] = item;//assign the item
      names = tempArray;// discard the old array by assigning the new array object
      // System.out.println(Arrays.toString(names));
      return true;
    }

    return false;
  }

  public boolean remove(int index) {
    if (index >= names.length || index < 0 || names.length <= 0) {
      return false;
    }

    names[index] = null;//repalce the item at the specified index int the array with the default array type value
    return names[index] == null;//return the removed item
  }

  public String get(int index) {
    if (index >= names.length || index < 0 || names.length <= 0) {
      return null;
    }
    return names[index];
  }

  public String join() {
    String holdString = "";

    for (String name : names) {
      if (name != null) {
        holdString += name + " ";
      }
    }

    return holdString;
  }

  public int size() {
    return names.length;
  }

  public boolean isEmpty() {
    return names.length == 0;
  }



  public static void main(String[] args) {
    ArrayDemo demo = new ArrayDemo();

    //Testing the add method
    // demo.add(0, "Johnson");
    // demo.add(1, "Jane Doe");
    // demo.add(2, "Mary Lee");

    // Testing the add 2 method
    demo.add("Johnson");
    demo.add("Jane Doe");
    demo.add("Mary Lee");
    // demo.add("John Lee");
    // demo.add("John Doe");
    // demo.add("Another name");
    // demo.add("Last name");

    // Testing the remove method
    // int index = 0;
    // if (demo.remove(index)) {
    //   System.out.println("Name has been deleted!");
    // } else {
    //   System.out.println("Something went wrong :-(");
    // }

    // // Testing the join method
    // System.out.println("Text:\n" + demo.join());

    // //Testing the get method
    // index = 2;
    // System.out.println("I got: " + demo.get(index));
  }
}
