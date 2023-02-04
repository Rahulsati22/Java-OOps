package OOpsfinal.poly;
public class Main{
    public static void main(String[] args) {
        Shapes obj = new Shapes();
        Triangle obj1 = new Triangle();
        Circle obj2 = new Circle();
        Square obj3 = new Square();
        obj.area();
        obj1.area();
        obj2.area();
        obj3.area();

        Sum a = new Sum();
        System.out.println(a.sum(1.2f,1.0f,3.1f));

        //integer is being converted to double but double can be converted to an integer because memory loss will take place
        //study type casting to know all the rules
        System.out.println(a.sum(1, 1));
    }
}
class Sum{
    int sum(){
        return 0;
    }
    double sum(double a, double b){
        return  a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    float sum(float a, float b, float c){
        return a + b + c;
    }
    
    //also a type of compile time polymorphism
    Sum(){
        System.out.println("i am sum with no arguments");
    }
    Sum(int a, int b){
        System.out.println("i am sum with two arguments");
    }
    Sum(int a, int b, int c){
        System.out.println("i am sum with three arguments");
    }
}

class Shapes{
     void area() {
         System.out.println("I am in shapes");
     }
}
class Triangle extends Shapes{
    void area(){
        System.out.println("I am in Triangle");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("I am in square");
    }
}
class Circle extends Shapes{
    void area(){
        System.out.println("I am in circle");
    }
}
/*
 *What do you mean by polymorphism ?
 * ans-> Poly means many and morphism means many ways to represent. In simple terms it means many ways to represent a single entity or item.
 * All object oriented language supports polymorphism, if it does not do so then the language is not object oriented language.
 *
 *
 * Types of polymorphism
 * A. Compile time polymorphism
 * Compile time polymorphism is achiever via method overloading.
 * Method overloading -> When a class have mulitple methods with same name but the number, type, order of parameters are different
 * or return type is different then this is known as method overloading
 * Example -> Multiple constructors
 *
 *
 * Why it is known as compile time polymorphism?
 * Because java decides at compile time which constructor will be called at compile time
 */

