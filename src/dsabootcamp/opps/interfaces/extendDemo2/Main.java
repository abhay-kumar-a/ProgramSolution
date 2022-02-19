package dsabootcamp.opps.interfaces.extendDemo2;

public class Main {
    public static void main(String[] args) {
        NewOne newOne = new NewOne();
        newOne.newDefaults();
        newOne.newDefaults1();
        newOne.fun();
        A.greeting();  // static method so use class name from where its define
    }
}
