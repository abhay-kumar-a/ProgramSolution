package dsabootcamp.recursion;

public class Message {
    //let's print message 5 times without using and loops
    public static void main(String[] args) {
        message1();
    }
    // by using function
    static void message1()
    {
        System.out.println("message1");
        message2();
        System.out.println("1");
    }
    static void message2()
    {
        System.out.println("message2");
        message3();
        System.out.println("2");
    }
    static void message3()
    {
        System.out.println("message3");
        message4();
        System.out.println("3");
    }
    static void message4()
    {
        System.out.println("message4");
        message5();
        System.out.println("4");
    }
    static void message5()
    {
        System.out.println("message5");
        System.out.println("5");
    }
}
