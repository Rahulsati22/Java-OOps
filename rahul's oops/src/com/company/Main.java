package com.company;

public class Main {
    public static void main(String[] args) {
        Son rahul = new Son();
        rahul.career("Engineer");
        rahul.partner("khushi", 20);
        rahul.age = 20;
        System.out.println("the age of the rahul is " + rahul.age);
        rahul.exampleMethod();



        Daughter khushi = new Daughter();
        khushi.career("Doctor");
        khushi.partner("rahul", 20);
        khushi.age = 20;
        System.out.println("the age of the khushi is " + khushi.age);
        khushi.exampleMethod();

        Parent.exampleMethod2();

        //method of the child class will run that are overriden
        Parent daughter = new Daughter();
        daughter.career("doctor");

        Parent.val = 20;
        System.out.println("The value of the variable 'val' inside the parent is "+Parent.val);
    }
}

       /* trying to create object of the parent class
          Parent obj = new Parent();
          not possible you cannot create object of parent class

          We cannot create abstract constructors

          question->Why cannot you create the object of the abstract classes
          ans->Because we cannot access the abstract methods inside it and for the same reason abstract constructors
          cannot be created

          question->Why cannot abstract static methods cannot be created
          ans->static methods cannot be overriden but abstract methods can be overriden that's why abstract static methods cannot be created

          abstract classes can have static methods
          abstract classes can have normal methods

          q->Why abstract classes cannot be final
          ans->because we want it to be inherited and final classes cannot be inherited

          q->It will not support multiple inheritance
           */


           /*
           *interfaces focuses on what the class is doing and not how it is doing
           * variables in interfaces are static and final(by default)
           */