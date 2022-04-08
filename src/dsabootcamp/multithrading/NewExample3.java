package dsabootcamp.multithrading;
// achieve thread by Runnable interface....
class A3 implements Runnable
{
    public void run()
    {
        for(int i =1 ;i<=5;i++)
        {
            System.out.println("!!!! Printing doc "+ i+ " for A3");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
class B3 implements Runnable
{
    public void run()
    {
        for(int i =1 ;i<=5;i++)
        {
            System.out.println("@@@@ Printing doc "+ i+ " for B3");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
public class NewExample3 {
    public static void main(String[] args) {
        // runnable have only run method .
        // and for start any thread we use start() method which is provided by only thread class.
        // so for Achieve thread by using Runnable interface ., we also need to create Thread class

        // by using the class like A3
        A3 a3= new A3();

        // by using Anonymous class
        Runnable r = new Runnable() { // by using anonymous class ( means data members or method which did not have any class name called anonymous class )
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("!!!! Printing doc " + i + " for A3");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };

        /// by using lambda expressing. we can use lambda function here because Runnable is functionalInterface
        Runnable r1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("!!!! Printing doc " + i + " for A3");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };

        // or we also pass Runnable in Thread class constructor...
        // lots of code reduce over here....
        Thread t3 = new Thread( /* use lambda expression */  () ->  {for (int i=1 ;i<=5;i++) {
            System.out.println("!!!!! Printing doc " + i+ " of  lambdaExpression in thread constructor");
         try{Thread.sleep(1000);} catch (Exception e){}  }
        } );
        t3.start();

        // here reference of runnable class passed in Thread class  constructor..
        Thread t= new Thread(r1);
        t.start();
        try{Thread.sleep(100);}catch (Exception e){}
        B3 b = new B3();
        Thread t2 = new Thread(b);
        t2.start();


    }
}
/* out put like this..
!!!!! Printing doc 1 of  lambdaExpression in thread constructor
!!!! Printing doc 1 for A3
@@@@ Printing doc 1 for B3
!!!!! Printing doc 2 of  lambdaExpression in thread constructor
!!!! Printing doc 2 for A3
@@@@ Printing doc 2 for B3
!!!!! Printing doc 3 of  lambdaExpression in thread constructor
!!!! Printing doc 3 for A3
@@@@ Printing doc 3 for B3
!!!!! Printing doc 4 of  lambdaExpression in thread constructor
!!!! Printing doc 4 for A3
@@@@ Printing doc 4 for B3
!!!!! Printing doc 5 of  lambdaExpression in thread constructor
!!!! Printing doc 5 for A3
@@@@ Printing doc 5 for B3

*/
