package dsabootcamp.multithrading;

import jdk.swing.interop.DispatcherWrapper;

import javax.print.attribute.standard.RequestingUserName;
import java.nio.charset.MalformedInputException;
import java.util.MissingFormatArgumentException;
import java.util.NavigableMap;

public class Example2 {
    public static void main(String[] args) {
//        System.out.println("call first:  Abhay is typing");
////        Hello h = new Hello();
////        h.start();
////        h.start();
////        System.out.println("Vineet is seeing Mobile phone");
////        System.out.println("Hello Man");
//        Thread t = new Hello();
//        t.start();
//        System.out.println("call second: This is multiThreading");
//        Thread m = new Multithreading();
//        m.start();
//        // getName Method
//        Thread t2 = new Thread("Abhay");
////        System.out.println(t2.getName());
//        System.out.println("Thread name is : "+ t2.getName());
//        Multithreading m1 =new Multithreading("Abhay is Here");
//        System.out.println(m1.getName());

        // Runnable interface
        Interface1 i = new Interface1();
        Hello h = new Hello();
        Name n = new Name("Hello Abhay");
        Thread m2  = new Thread(i);
        Multithreading m3= new Multithreading(i);
        m3.start();
        m2.start();

        Runnable r = new Interface1();
        Thread m4 = new Thread(r, "Organisation"); // always use thread class
        System.out.println(m4.getName());
        m4.start();


//        Runnable r = new Hello();  //  it's also possible
//        r.run();

//        Multithreading m = new Interface1();  // it's not possible




    }
}
class Name {
    String name ;
    Name(String name)
    {
        this.name = name;
    }
}
class Hello extends Thread{
    public void run()
    {
        System.out.println("Thread is running..........");
    }
}
class Multithreading extends Thread{
    Multithreading()
    {}
    String name;
    Multithreading(String name)
    {
//        super(name);
   this.name = name;
    }

    Multithreading(Runnable r)
    {
        super(r);
    }
    Multithreading(Runnable r , String s)
    {
        super(r,s);
    }
    public void run()
    {
        System.out.println("Hello i am in Multithreading ");
    }

}
class Interface1 implements Runnable
{
    public void run() {
        System.out.println("Runnable thread is running....");
    }
}
