package dsabootcamp.recursion;

public class Message {
    //let's print message 5 times without using and loops
    public static void main(String[] args) {
        message();
    }
    // by using function
    static void message()
    {
        System.out.println("message");
        message2();
    }
    static void message2()
    {
        System.out.println("message");
        message3();
    }
    static void message3()
    {
        System.out.println("message");
        message4();
    }
    static void message4()
    {
        System.out.println("message");
        message5();
    }
    static void message5()
    {
        System.out.println("message");
    }
}
