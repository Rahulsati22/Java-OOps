package OOpsfinal;
class Shapes{

    void area(){
        System.out.println("i am area inside the shaper");
    }
    static void show(){
        System.out.println("i am show from the class shapes");
    }
}
class Circle extends Shapes{

    @Override//this is called annotation
    void area(){
        System.out.println("i am area inside the circle");
    }

    //cannot do this because you cannot override static methods as they are dependent on classes and not on objects
//    void  show(){
//
//    }
    static void show(){
        System.out.println("hello i am show from base class");
    }
}
final class Human{
    String name;
}
//cannot do that because Human class is final
//class Superhero extends Human{
//
//}

public class Dynamic {
    public static void main(String[] args) {
        Shapes ab = new Shapes();
        ab.area();
        Shapes bc = new Circle();
        bc.area();
        Circle cd = new Circle();
        cd.area();
        //this will call the parent class show method because it is static and dependent on the class only
        bc.show();
    }
}
/*
* runtime or dynamic polymorphism achieved by method overriding.
* when both the parent class and child class have same name of function , same parameter only body is different than this concept is called
* overriding
* if you want to check whether a method is being overriden or not use the keyword overriding
*
*
*
*
* in case of overriding the method called will be dependent on right hand side
* why it is happening?
* ans->because function of base class is actually overriding the function of parent class constructor
* which method will be called is based on the object in the case of overriding which is known as upcasting
*
*
*
* question-> how java detemines through object which version of method to be called?
* ans->this is known as dynamic method dispatch
* this means a call to an overriden method is resolved at run time rather than compile time
* this is known as lete binding because decision is being made at run time
*
*
* you can use final keyword to prevent overriding.
* you cannot override a method that is final
* when we use final keyword java keyword decides at compile time that this method will run
* as it is declared final this is known as early binding
*
*
*
* final keyword can also be used to prevent inheritance and all the methods of final class are also final
* you cannot override static methods because they are dependent on class and not on object
* static methods can be inherited but cannot be overriden
* in short overriding depends on objects and static methods are not object dependent hence you cannot override static methods
* this concept of overloading and overriding are only for methods and not for instance variables
* */
