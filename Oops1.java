import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class lecture1 {
   static void swap(Integer a, Integer b){
      /*
       !it will not swap the original values because scope of the variables are only inside this function
       int temp = a;
       a = b;
       b = temp;
      */
       /*
       !it will not swap the original values because Integer is a final class
         Integer temp = a;
         a = b;
         b = temp;
       */
   }
    public static void main(String[] args) {
        /*
          ! suppose we have to store roll number of 5 students
         * int arr[] = new int[5];
          
          ! suppose we have to store name of 5 students
         * String arr[] = String[5];
          
          ! suppose we have to store the data of the students
         * so we cannot do it with the knowledge we have till this point of time
         * so to solve this problem we use the concept of object oriented programming
         
          ?->what are classes?
          /->classes are named group of properties and functions and class always
         * starts with capital letter and always starts with capital letter and it is a
         * user defined datatype.
         */

        /*
           *object is physical reality and class is just a logical construct 
           *memory is allocated to the objects and not to class
           *here below rahul is the reference variable , means reference to an object of type Student and residing in stack memory
        */ 
         Student rahul;

         /*
         !new keyword allocates the memory at run time(dynamically) in heap and return reference to it and this reference is stored in the instance variable
         
         ? new Student()--> what is this student 
         /ans-> this is a constructor


         ?what is constructor overloading
         *creation of more than one constructor which have different parameters is known as constructor overloading
         */
        
         rahul =  new Student();

         //*setting  properties of the instance variables
            rahul.name = "rahul";
            rahul.marks = 99.8f;
            rahul.rollNo = 10;

            /*
            !rahul.salary
            *cannot do this because salary is not a instance variable
            */ 

            //!printing the reference variables
            System.out.println(rahul.rollNo);
            System.out.println(rahul.name);
            System.out.println(rahul.marks);
            rahul.greet();

            //!calling  constructor with parameters
            Student ayush = new Student("ayush", 53, 100);
            System.out.println(ayush.rollNo);
            System.out.println(ayush.name);
            System.out.println(ayush.marks);
            ayush.greet();


            //!calling constructor with parameter as object
            Student std3 = new Student(ayush);
            System.out.println(std3.rollNo);
            System.out.println(std3.name);
            System.out.println(std3.marks);
            std3.greet();



            //!new concept
            /*
             * below one and two are referring to same object and any change via one of the reference variable will result in the change in original object
             */
            Student one = new Student();
            Student two = one;

            one.marks = 10;
            System.out.println(one.marks);
            two.marks = 20;
            System.out.println(one.marks);



            /*
             ?what is a wrapper class.
             *it is used to convert a primitive data type into an object.


             /here num is an object and this have many properties and known as {wrapper class}
             Integer num = 10;

             /here num is a primitive data type
             int num = 5;
             */


             int a = 10;
             int b = 20;
             System.out.println(a + " " + b);
             swap(a, b);
             System.out.println(a + " " + b);


             Integer c = 10;
             Integer d = 20;
             System.out.println(c + " " + d);
             swap(c,d);
             System.out.println(c + " " + d);




              /*
              !here we will study about final keyword
              *by using final keyword we can prevent our content from being modified
              *we have to initialize the final variable at the time of declaration otherwise it will give us error
              *it can prevent only primitive data types from changing there value and in the case of non-primitive data types it cannot prevent the datatype from changing value
              */

              final int k = 20;
              //k = 30; --> not possible because k is final variable which cannot be modified
              System.out.println(k);
              final Student Kunal = new Student();
              Student aki = new Student();
            // Kunal = aki; --> not possible because Kunal is already instantiated and allocated memory in the heap and pointing to an object already
            //!in short when a non primitive is final it can assigned only one time and cannot resign it again and again






            //!now we will study about garbage collector
            /*
             * In java you cannot destroy the objects manually but you can tell what to do when the object is destroyed
             * At one time a reference variable cannot point to more than one object in heap
             */

             Student helper;
             for (int i = 0; i <= 1000000000; i++){
               helper = new Student();
             }


              
    }
}
/*
     !syntax for creating a class
       
     * class(keyword) name_of_the_class {
      / members and functions can be written inside the class
     * }
*/
class Student {
    //! using dot operator these properties can be accessed easily via objects and these below are known as instance variables

    String name;
    int rollNo;
    float marks;

    void greet(){
        System.out.println("Hello " + this.name);
    }

    void changeName(String name){
        /*
         * in the below condition the compiler will get confused because the name of the parameter and the name of the instance variable inside the class is same and to avoid this confusion we will use this keyword
        */
         //!name = name; --> this is not allowed

         //*this problem can be solved in this manner
         this.name = name;
    }
    /*
     ?What is a constructor
     *a constructor is a function of type class which will tell what will happen when an object will be created
     *if you have not created a constructor java will create its own constructor which is known as default constructor
     *a class can have more than one constructor


     !syntax of the constructor
     *name_of_the_class(params){
        /action that will occur inside the constructor
     }
     */


     //!constructor number1
     Student(String name, int rollNo, float marks){

        /*
         ?what is the work of this keyword
         !ans-> this is replaced with the name of the reference variable
         *suppose name of the reference variable is rahul then here this will be replaced with "rahul"
        */

        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
     }


     //!constructor number2
     Student(){
        //here we will call another constructor from this constructor using this keyword

        //*in this case this will be replaced with the name of the class and not with the name of the instance variable
        this("akshay", 1, 1);
     }


     //!constructor number3
     Student(Student st){
        this.name = st.name;
        this.rollNo = st.rollNo;
        this.marks = st.marks;
     }

     //!creating a destructor
     @Override
     protected void finalize() throws Throwable {
         System.out.println("object destroyed");
     }
     
}
