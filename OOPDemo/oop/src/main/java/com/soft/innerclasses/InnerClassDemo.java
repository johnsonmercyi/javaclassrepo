package com.soft.innerclasses;

class OuterClass {
  private String member1;
  private String member2;

  public OuterClass(String member1, String member2) {
    this.member1 = member1;
    this.member2 = member2;
  }

  public String getMembers() {
    return member1 + " " + member2;
  }

  class InnerClass {
    public void innerClassMethod(String content) {
      if (getMembers().contains(content)) {
        System.out.println(content + " is part of the outer class members!");
      }
    }
  }
}

class SubOuterClass extends OuterClass {
  public SubOuterClass(String member1, String member2) {
    super(member1, member2);
  }
}

public class InnerClassDemo {
  public static void main(String[] args) {
    OuterClass oc = new SubOuterClass("Johnson", "Mikel");
    OuterClass.InnerClass ic = oc.new InnerClass();
    ic.innerClassMethod("John");
  }
}
