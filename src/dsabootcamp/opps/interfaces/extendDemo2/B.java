package dsabootcamp.opps.interfaces.extendDemo2;

public interface B {
    void fun();

    default  void newDefaults1()
    {
        System.out.println("I am default method  from interface B ");
    }
}
