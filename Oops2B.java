package OOpsfinal.a;

public class LLL {
    static int a = 20, b;

    static {
        b = a * 5;
        System.out.println(b);
    }

    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        cannot do the below thing because inner class dependent on the outer class object and compiler is asking to the inner
//        class that where is your object and to solve this problem we have to use static keyword in starting of the class
//        Test ab = new Test();

        //now it is working fine now it is dependent on class and not on its object
        Test ab = new Test("rahul");
        Test abb = new Test("ayush");
        System.out.println(ab.name);
        System.out.println(abb.name);
    }
}

/*
 *static block only run once when the class is being loaded or first object of the class is created
 * outside classes cannot be static but inner classes can be static because it does not dependent on any class but
 * inner classes are dependent on the outside classes
 * static variables are resolved during compile time as they do not dependent on objects
 *
 *
 *
 * what is system.out.println
 * System is a class and out is its instance which is of type print stream and inside print stram we have a method println
 * which is used to print whatever we write inside it 
 * */
