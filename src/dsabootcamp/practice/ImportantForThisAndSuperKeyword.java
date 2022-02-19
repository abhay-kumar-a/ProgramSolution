package dsabootcamp.practice;

class SuperClass{
    int variable  =56;
    int a =67;
    int b =7;
// constructors
    SuperClass(int a , int b)
    {
        System.out.println(a+b);
    }
    String name="Abhay";
    int age=23;
    long PhoneNumber= 7459946676L;
    SuperClass(String name, int age, long PhoneNumber)
    {
        this.name = name;
        this.age = age;
        this.PhoneNumber = PhoneNumber;
    }

 //  Method
    void method()
    {
        System.out.println("Hello I am in Super class Method");
    }
}
class CheckThisAnsSuperKeyword extends SuperClass{
    int a =5;
    int b = 8;
    String name = "Vivek";
    int age = 23;
    long PhoneNumber = 9876543210L;
    CheckThisAnsSuperKeyword(int a, int b) {
        super(a,b);
    }
    CheckThisAnsSuperKeyword(String name, int age, long PhoneNumber) {
        super(name, age, PhoneNumber);
    }

    // method
    void method()
    {
        System.out.println("I am method of subclass(checkThisAndSuperKeyword)");
    }
    // Method
    void newMethod()
    {
        System.out.println("Child class variable call : "+ this.a);    // invoke subclass class variable
        System.out.println("Parent class variable call : "+ super.a);  // invoke parent class variable
        this.method();  //  child class method call means inside class   invoke subclass class variable
        super.method();  //  super class method call means parent class  invoke parent class variable
        CheckThisAnsSuperKeyword sa = new CheckThisAnsSuperKeyword("Vineet",25, 7071045673L);

        System.out.println("Name is : "+name+ " age : "+ age+ " PhoneNumber is : "+ PhoneNumber);
    }
}


class Hello
{
    int variable =67;
    void method()
    {
        System.out.println("hello I am in Hello class Method");
    }
}

public class ImportantForThisAndSuperKeyword extends CheckThisAnsSuperKeyword {
    ImportantForThisAndSuperKeyword(int a, int b) {
        super(a, b);
    }

    public static void main(String[] args) {
        // access Super class data members and method  without using reference variables
        System.out.println(new ImportantForThisAndSuperKeyword(4,5).variable);
        new ImportantForThisAndSuperKeyword(5,6).method();
        // Hello class access
        System.out.println(new Hello().variable);
        new Hello().method();       // call method without reference variables
        new SuperClass(4,6);

       /// now check idea about this and super keyword
        System.out.println(" ");
        System.out.println("now check idea about this and super keyword");
        new ImportantForThisAndSuperKeyword(3,4).newMethod();



    }
}
