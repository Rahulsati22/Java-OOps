package OOpsfinal.a;
// singleton class is that class which allow us to create only one object of the class and if we create more than one one reference variable they will point to the same object
public class Singleton {
    public static Singleton instance;
    public static Singleton returnInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    private Singleton(){
    }
}
