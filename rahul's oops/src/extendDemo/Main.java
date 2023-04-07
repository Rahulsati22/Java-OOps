package extendDemo;

public class Main  implements A,B{

    @Override
    public void greet() {
        System.out.println("hello i am greet method");
    }

    @Override
    public void fun() {
        System.out.println("hello i am fun method");
    }

    public static void main(String[] args) {
        Main ab = new Main();
        A.Greet();
    }
}
/*
* static methods cannot be override so inside interfaces we have to provide the content to the static methods
* in short static interface methods should always have a body
* access modifier for the overriden meethods should be same or better
* */