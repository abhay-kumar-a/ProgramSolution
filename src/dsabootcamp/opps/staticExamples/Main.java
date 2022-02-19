package dsabootcamp.opps.staticExamples;
//static keyword use in java for memory management mainly. we can apply static keyword with variables,methods,blocks,nested classes.
public class Main {
    int a =5; // instance variable
    static  int num = 6;
    public static void main(String[] args) {
        System.out.println("Hello Abhay");

        // creating instance of Human class
        Human m = new Human("Abhay Kuma",25);
        Human m1 = new Human("Vineet Kumar" , 23 );
//        Human m2 = new Human("Vivek Kushawaha" , 23 , 100000, false);
//        Human m3 = new Human("Vinay Kumar" , 23 , 100000, false);
        m.allInformation();

        System.out.println(Human.population);   //  return 2
        System.out.println(Human.population);  //  return 2  because , we have two members
        System.out.println("Num : "+num);  // statics variable
        Main main = new Main();
        System.out.println("a : "+ main.a); // non-static variable
//        m1.allInformation();
//        m2.allInformation();
//        m3.allInformation();

        fun();
    }
    // creating static method
  static   void fun()
    {
       // fun();  // go in infinite conditions

        System.out.println("Hello man");

        // in static method only static var,method can be calls;
        // for calling non-statics method , it's needed to create  that's objects(instance) via this , can access easily;
        Main m2 = new Main();
        m2.fun2();
    }

    // non-static methods
    void fun2()
    {
        message();
    }
    void message()
    {
        System.out.println("Hen,Flower,finger, human, vacuum , hesitation");
    }
}
