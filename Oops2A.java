public class Lecture2 {
    public static void main(String[] args) {
        Human rahul = new Human(20, 6, "rahul", 100000000);
        Human ayush = new Human(17, 6, "ayush", 1000000000);
        Human arpit = new Human(17, 6, "ayush", 1000000000);
        System.out.println(Human.population);
//        System.out.println(ayush.population); --> dont do like this
        Lecture2 obj = new Lecture2();
        obj.greeting2();
    }

    //this is not a static method and  dependent on objects

    public void greeting() {
        System.out.println("hello i am rahul sati");
    }

    //this is a static method and not dependent on objects
    public static void fun() {
        //greeting(); --> not possible because we cannot call non static methods inside static methods


        //way to access this greeting method
        Lecture2 obj = new Lecture2();
        obj.greeting();
    }

    //this is allowed because at last it will called in the main function where object will be provided for greeting2 and
    //greeting2 contains greeting() so it becomes the part of the greeting2 and greeting can be run via the obj created for greeting2
    public void greeting2() {
        greeting();
    }
}

class Human {
    int age;
    String name;
    int height;
    int salary;
    static long population;

    static void message() {
//        cannot do this, this will give an error
//        System.out.println(this.population);
    }

    Human(int age, int height, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.height = height;
//      this.population += 1;->dont do like this
        Human.population += 1;
    }
}
/*
 * what is static keyword?
 * let us take a case
 * suppose we have a human class consisting age , name salary , height. These all
 * the properties are dependent on individual objects
 *static means those properties which are common for all objects and does not depend on a single object
 * this can be accessed via reference variable but we should not do that
 * we should do this via class name
 * without creating object you can access the static variables via class name because these does not dependent on the
 * objects
 * you can create static methods as well as static variables
 *
 *
 *
 *
 *
 * question->why main function is static function.
 * to run any method of the class we need to make object of the class but when main is the first thing that will run
 * so how can we make the object of the class to run this therefore the main function is static therefore we can
 * run it without creating the object of the class
 *
 *
 *
 *
 *
 * question->why we cannot call non-static function inside static function
 *without telling to which object non static method belongs to we cannot use non static method inside static method
 *i simple terms how can you use a method which depends on object inside the methods which does not depends on objects
 * we can use it by making a object of the class in which it is present and then accessing it by the help of that object
 *
 *
 *
 *
 *
 * you can use non static method inside a non static method because at last it will be called inside the main method where a
 * object will be created for this
 * you cannot use this inside static method
 * */
