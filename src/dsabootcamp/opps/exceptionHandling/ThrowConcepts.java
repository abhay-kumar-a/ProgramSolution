package dsabootcamp.opps.exceptionHandling;

import java.io.IOException;
import java.security.spec.ECField;

public class ThrowConcepts {

    public static void validate(int age)
    {
        if(age<18)
        {
            throw  new ArithmeticException("Person is not eligible to work");
        }
        else {
            System.out.println("Person id Eligible to vote");
        }
    }

    void method() throws IOException{
        System.out.println("Device");
    }

    void method2() throws  IOException{
        throw new IOException("Exception Occur");
    }



    public static void main(String[] args) throws IOException {

////        validate(12);
//        try{
//            int a = 23/0;
//            System.out.println(a);
//        }
//        catch (Exception r)
//        {
//            System.out.println(r);
////            System.out.println(r.getMessage());
////            System.out.println(r.printStackTrace());
//        }
        ThrowConcepts t = new ThrowConcepts();
        t.method();
        t.method2();
        System.out.println("Normal flow");

    }
}
