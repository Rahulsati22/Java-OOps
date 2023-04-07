package com.company;

abstract public class Parent {
//    can initialize this using super() only
    final int value;
    static int val;
    public Parent(){
        System.out.println();
        System.out.println("Hello i am constructor of parent class");
        System.out.println();
        value=1000;
     }

    int age;
    abstract void career(String name);
    abstract void partner(String name, int age);

    public void exampleMethod(){
        System.out.println("Hello i am example method of parent class");
    }

    static void exampleMethod2(){
        System.out.println("Hello i am example static method of parent class");
    }
}
