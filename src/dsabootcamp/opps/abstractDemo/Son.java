package dsabootcamp.opps.abstractDemo;

public class Son extends Parents{
    Son(int age) {
        super(age);
    }

    @Override
    public void carrier() {  //  here need to define public if you make method in parent class as public
        //  means always  attempt to assign higher to lower access privileges ('package-private'); was 'public'
        System.out.println("I will choose Engineer :");
    }

    @Override
    void partner() {
        System.out.println("I will  choose Iran Man");
    }
}
