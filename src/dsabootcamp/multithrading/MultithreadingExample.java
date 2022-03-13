package dsabootcamp.multithrading;

import javax.print.attribute.standard.RequestingUserName;

public class MultithreadingExample {
    public static void main(String[] args) {
//                System.out.println("\n\n\n Interface Example : ");

        // First cons is invoked .......................................................
        ThreadClassExample t1 = new
                ThreadClassExample();
        t1.start(); // here start method is called... it activates the thread state//  but there is no thread execution
                  // and it calls the run method by which thread is executed
//        Thread ex1 = new Thread("Hello man");   // get name using thread class
        // or
        // second cons is invoked ......................................................
//        ThreadClassExample ex2 = new ThreadClassExample(" ")  ;     // get name using own class if that class extend Thread class
//        String s = ex2.getName();     ///getName is the method of thread class to get thread name
//        System.out.println("Thread  name is : "+ s);

      // third class is invoked............................................................
        // pass interface over here
//        Runnable r1 = new RunnableInterfaceExample();       // parent interface reference and child class object
//        ThreadClassExample ex3= new ThreadClassExample(r1);
//        ex3.start();

        
//
//
        System.out.println("\n\n\n Interface Example : ");
        RunnableInterfaceExample t2 = new RunnableInterfaceExample(); // interface did not have start method
//        // also ,can create like  this
////        Runnable n = new RunnableInterfaceExample(t2);
        Thread thread = new Thread(t2);    /// Runnable interface did not have start methods to activate thread so use Thread Class and pass interface in constructor
//        ThreadClassExample thread1= new ThreadClassExample(t2)  ;
        System.out.println("What it will run :: ");
       thread .start();
//

    }
}
class ThreadClassExample extends Thread{   // achieve thread using thread class
public void run()
{
    System.out.println("Thread is running using Thread class......");
}

/// thread class have multiple constructor
//Thread();
//Thread(String name)
//Thread(Runnable r)
//Thread(Runnable r , String name)


String name;
ThreadClassExample ()    // empty argument pass
{

}
ThreadClassExample (String name)         // String pass
{
    super(name);
}
ThreadClassExample(Runnable r)    //  interface pass
{
 super(r);
}
ThreadClassExample(Runnable r , String name)   // interface and string pass
{
       super(r,name);
}

}
// another way to achieve to thread in java by runnable interface
class RunnableInterfaceExample implements Runnable{
    public void run()
    {
        System.out.println("Thread is running using runnable interface....");
    }
} 