package com.company;

public class Son extends Parent{

    @Override
    void career(String name) {
        System.out.println("I want to become a " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("The name of my partner is " + name + " and her age is " + age);
    }
}
