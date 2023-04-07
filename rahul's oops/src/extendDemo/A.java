package extendDemo;

public interface A {
    void greet();

//    no need to use this method
    default void greet2(){}

    static void Greet(){
        System.out.println("I am static greet method");
    }
}
