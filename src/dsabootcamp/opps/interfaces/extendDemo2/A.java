package dsabootcamp.opps.interfaces.extendDemo2;

public interface A {
    static void greeting()
    {
        System.out.println("Hello I am static method of interface A");
    }
    default  void newDefaults()
    {
        System.out.println("Hello I am default method of interface A");
    }
}
