package dsabootcamp.opps.abstractDemo;

// a class can extend abstract method
public class Daughter extends Parents {
    int age=23;
    Daughter(int age) {
        super(age);
    }
    // here the idea is that only abstract method from super class is mandatory to declare in subclass
    // not need to or not mandatory to declare normal and static method in subclasses and parent class constructor

    public void carrier()
    {
        System.out.println("I will choose Doctor");
    }
    public void partner()
    {
        System.out.println("I will choose paper pet");
    }
    void normal()
    {
        super.Hello();  // super call the super class Method and take details from Hello for Normal method;
    }
}
