package dsabootcamp.opps.objectAndClasses;

import java.util.Scanner;

public class ObjectsAndClasses {
    public static void main(String[] args) {
        // why (Object-Oriented Programming Language)
        // lets discuss

        // store student names
        // usually we use Arrays
        // create and array
        Scanner sc = new Scanner(System.in);
        String[] student = new String[5];

        // store student roll no
        int[] rollNumber = new int[5];

        // store student marks
        float[] marks = new float[5];

        // why use Oops (Object oriented programming language)

        // creating object(instance of the class)
        Student v = new Student();  // object are created using new keyword // here constructor return reference of object and there reference are store in reference variable;
         ///  v -- called as "Reference Variable"
        System.out.println("---  "+v); // print hexadecimal values
        System.out.println(v.names); // class instance variable(reference type) store by default "Null" value
        System.out.println(v.name);
        System.out.println(v.a);// a reference type variable
        System.out.println(v.rollNumber); // and primitive instance are store his unique value by default;
        System.out.println(v.marks);
        // change values of instances variables by reference variable
//        v.name = "Vineet";
//        v.rollNumber = 45;
//        v.marks = 45.6f;
//        System.out.println(v.name);
//        System.out.println(v.rollNumber);
//        System.out.println(v.marks);

        //
//        v = new Student(349,"abhay");
//        v.name= "Vineet";  // here .(dot) operator used to make connection b/w ref and inst var;
        v.nameChange();

        // creating another object
        Student s = new Student(v); // in object , i passed reference variable v
        System.out.println(s.name);
    }
}
 class Student
{
    String names;
    String name = "Abhay"; // these are instance variable
    int rollNumber= 34;
    float marks = 56.8f;
    Integer a ;
    void nameChange()
        {
            System.out.println("Your name is : "+ name);
            System.out.println("name : " + name + " " + " rollNumber : " + rollNumber);
        }
        // constructor with 0 argument
    Student ()
    {
//        super(); // cont use super over here
        this(45,"vivek"); // call another constructor using this keyword, and change actual values or default values of instances variables of the class
        System.out.println("Hello man");
    }
    // constructor with two argument

    Student(int rollNumber,String name)
    { this.rollNumber = rollNumber;
        this. name = name;
    }

    Student(Student other )  // created constructor with (Other reference variable)
            // means here as argument pass a reference variable
    {
        this.name = other.name;    // here this work like this :-  s.name = v.name (upper side) // means ,a reference variable which we give , this will consider that..
        this.rollNumber = other.rollNumber;
       this.marks = other.marks;
    }
}
