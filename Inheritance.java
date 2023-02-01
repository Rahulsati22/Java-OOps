package OOpsfinal.a;

public class Inheritance {
    public static void main(String[] args) {
        Box ab = new Box();

        System.out.println(ab.length + " " + ab.width + " " + ab.height);

        Box bc = new Box(4);
        System.out.println(bc.length + " " + bc.width + " " + bc.height);

        //this is allowed
        Box c3 = new BoxWeight(2,3,4,8);
    }
}
class Box{
    int height;
    int length;
    int width;
    //Box while initializing
    Box(){
        //not giving error because every class is derived from object class
        super();
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }
    //Cube
    Box(int side){
        this.height = side;
        this.length = side;
        this.width = side;
    }
    //Cuboid
    Box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //copying a box
    Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }

    public void info(){
        System.out.println("running the box");
    }
}

class BoxWeight extends Box{
    int weight;
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(int length, int width, int height, int weight){
        super(length,width,height);
        super.width = 200;
        this.weight = weight;
    }

    BoxWeight(BoxWeight obj){
        //It is working because this case is similar to when a base class reference is refering to child class object where it can
        //access only its members .This is the another use case of super keyword
        super(obj);
        this.weight = obj.weight;
    }
}
/*
* 1.Inheritance
* There are two classes one is known as child class and other is known as base class . The class which inheriting the property is known as
* child class and the class whose property is being inherited is called base class.
*In child class we can use the properties of base class but in base class we cannot access the properties of the child class.
*Using extends keyword a child class can inherit the properties of the base class
*Child class will have all the properties of base class + its own properties
*You cannot access the private members of the base class
*
*
* what is super constructor?
* It just says call the parent class constructor with the following parameters.
* It is used to initialize values present in parent class.
* If we do not use super in base class constructor then base class default constructor will be called
*
*
* Use of super
* 1)To call the constructor
* 2)using super.(variable) you can access the member of the parent class
*
*
* It is the type of reference variable and not the object that will decide which variables can be accessed
*
*
*
* this is not allowed .we know reference variable decides what variables we can access or what variables we cannot access
  reference variable is of type child class so we can access the members of base class as well as child class but
  we cannot initialize the child class members as the constructor is of typee base class therefore this is not allowed
  "BoxWeight ab2 = new Box(2,3,4);"
*
*
*
*
* Object class is the main class from which every other class is derived it is the main parent class
* every single class inherits the object class
*
*
* superclass has no idea about what child class contains
* */
