package nestedInterfaces;

public class A {
//    this can be declared as public, private, proteted or default
    public interface nestedInterface{
        boolean isEven(int num);
    }
}

class B implements A.nestedInterface{
    @Override
    public boolean isEven(int num){
        return num % 2 == 0 ? true : false;
    }
}

class Main{
    public static void main(String[] args) {
        B ab = new B();
        boolean val = ab.isEven(10);
        System.out.println(val);
    }
}