package dsabootcamp.practice;

public class InnerClassExample {
    static int data  =8;

     static class Hello{
         void method()
        {
            System.out.println("method call :InnerClassExample.Hello is used :  "+data);
        }
    }

    public static void main(String[] args) {
         InnerClassExample n = new InnerClassExample(); // parent class object
        InnerClassExample.Hello  h = new Hello(); // inner class object
        h.method();
        //or
        h.method();
        System.out.println("data calls : "+ n.data);
    }

}
