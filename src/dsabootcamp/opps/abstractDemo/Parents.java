package dsabootcamp.opps.abstractDemo;

public abstract class Parents {
    //  creating two abstract method(abstract is mandatory because if any class consider one or more abstract method,so that class must declare as abstract keyword )
    public abstract void carrier();  // abstract method did not have anybody
    abstract void partner();


    // we can not create abstract constructor;
//    abstract Parents()
//    {
//
//    }
    // normal constructor
    int age ;// instance variable
    final int finalVariable = 3;   //  final, can not pass final variable is constructor , be its constants(can't assign again)
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
