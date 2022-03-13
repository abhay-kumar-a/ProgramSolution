package dsabootcamp.multithrading;

import jdk.swing.interop.DispatcherWrapper;
import practice.New;

import javax.print.attribute.standard.RequestingUserName;

public class ImpExample3 {
    public static void main(String[] args) {
        // job 1
        System.out.println("Execution start over here ");
        // Thread class is execute over here
        // job 4
        MyTask t= new MyTask();
        t.start();

        //job 2
        for (int print = 1;print<=10;print++) {
            System.out.println("^^ Print Pages : #" + print);
        }
        // job 3
        System.out.println("Execution end over here: ");
//        System.out.println("All jobs execute linearly");

        // why we need Thread
        // here observe that J0b 3 waiting for execute until job 2 did not finish his execution....when job 2 finish execution then control flow move to job3;
        // idea is that , some time we need to execute two or more job parallel > show here we need to use of thread.........
        // if Thread two are more jobs not run linearly they run parallel(means execution of jobs is decided by JVM) ...


        /// Runnable interface
// use with Interface and
        // do like this for call interface runMethod
        Runnable r = new Interface1(); // 1  // we can write these type of polymorphism statements
        Thread r1= new Thread(r);
        r1.start();
        // or in shortcut use this
        new Thread(new Interface1()).start();  // 2  > both 1 and two are same // or we concluded in a single statements

        // use with NewTask Class because it is also interface....
        new Thread(new NewTask()).start();  // are we can extend and implement class and interface both at one time..............
        // upper thread object is created and pass an  interface and the call start method....
        new NewTask().start();



    }
}
// using thread class
class MyTask extends Thread{
    public void run()
    {
        for(int  i =1;i<=10;i++)
        {
            System.out.println("@@ Printing Page: #"+ i);
        }
    }
    MyTask(){}
    MyTask(Runnable r)
    {
        super(r);
    }
}
class NewTask extends Thread implements Runnable{  // here we extend thread class and implement Runnable interface ,  we can inherit multiple class in one class , but inheritance is possible

    @Override
    public void run() {
        System.out.println("Runnable is Running...........");
    }
}
class InterfaceExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread is running ....................");
    }
}

// job 4 is run parallel  it's decided by jVm
//output
/* Execution start over here
^^ Print Pages : #1
        ^^ Print Pages : #2
        ^^ Print Pages : #3
        ^^ Print Pages : #4
@@ Printing Page: #1
        ^^ Print Pages : #5
        ^^ Print Pages : #6
        ^^ Print Pages : #7
        ^^ Print Pages : #8
@@ Printing Page: #2
@@ Printing Page: #3
@@ Printing Page: #4
@@ Printing Page: #5
        ^^ Print Pages : #9
        ^^ Print Pages : #10
        Execution end over here:
@@ Printing Page: #6
@@ Printing Page: #7
@@ Printing Page: #8
@@ Printing Page: #9
@@ Printing Page: #10 */
//
//Interface call
//Runnable thread is running....
//        Runnable thread is running..

