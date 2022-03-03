package dsabootcamp.opps.abstractDemo;
//abstraction : Hiding the unnecessary data and show the valuable data means essential data; it achieved by interface and abstraction
public abstract class Parents {
    //  creating two abstract method(abstract is mandatory because if any class consider one or more abstract method,so that class must declare as abstract keyword )
    public abstract void carrier();  // abstract method did not have anybody
    abstract void partner();


    // we can not create abstract keyword type constructor;
//    abstract Parents()
//    {
//
//    }
    // normal constructor
    int age ;// instance variable
    final int finalVariable = 3;   //  final, can  pass final variable in constructor, but we can not assign it again , because  its constants(can't assign again)
    static  int staticVariable= 45;  // static , also static variable can't use is constructors
    final static int fsVariable= 456; //  final and static

    Parents(int age )
    {
        this
                .age= age;
    }
    // normal method
    void Hello()
    {
        System.out.println("Hey I am Hello of parent class(super class)");
    }

    // static method
    public static int sum(int a,int b)
    {
        return a+b;
    }

}
