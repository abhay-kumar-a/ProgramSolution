package dsabootcamp.multithrading;

/// understand problem without synchronization
class  Count
{
    int count=0;
    public synchronized void countNumber()
    {
        count++;
    }
    int sum = 0;
    public synchronized void Hello( int i)
    {
        System.out.println("Hello I am in Count... : "+ i);
        try{Thread.sleep(1000);}catch (Exception e){ e.printStackTrace();}
        sum = sum+i;
    }
}
// let's make to Thread using Runnable interface , where in run method I will increase count value..
class Thread1   implements  Runnable
{ Count c= new Count();
    public void run()
    {
        for (int i = 0;i<100;i++)
        {
            c.countNumber();
//            System.out.print(c.count+ " ");
        }
    }
}
class Thread2 extends Count implements Runnable {
    public void run()
    {
        for(int i = 0;i<10;i++)
        {
            countNumber();
        }
    }

}
public class SynchronizationExample {
    public static void main(String[] args) throws Exception {
        Count c= new Count();
//        for(int i =0;i<10;i++)
//        {
//            c.countNumber();  // here if I call countNumber method 10 time , the value of count is 10...
//        }
//        System.out.println(c.count);

        Thread t =new Thread(() ->{
            for(int i = 0;i<10;i++)
            {
//                System.out.println("!!! Hello I's me.. "+ i );
//                c.countNumber();
                c.Hello(i);
            }
        });
        Thread t1= new Thread (new Runnable() {
            public  void run()
            { for(int i =0; i<10 ;i++)
            {
//                System.out.println("@@@ hii its me.. " + i);
//                c.countNumber();
                c.Hello(i);
            }
            }
        }
        );
        t.start();
        t1.start();
        t.join();
        t1.join();
//      System.out.println("\n"+t3.getName());
        System.out.println("Value of sum  is : "+ c.sum);
        System.out.println("\nCount value is : "+c.count);
    }
}
// Without Synchronization output is
/* Value of i is : 0
Hello I am in Count... : 0
Hello I am in Count... : 1
Hello I am in Count... : 2

Count value is : 2
Hello I am in Count... : 0
Hello I am in Count... : 1
Hello I am in Count... : 2
Hello I am in Count... : 3
Hello I am in Count... : 4
Hello I am in Count... : 5
Hello I am in Count... : 6
Hello I am in Count... : 7
Hello I am in Count... : 8
Hello I am in Count... : 9
Hello I am in Count... : 3
Hello I am in Count... : 4
Hello I am in Count... : 5
Hello I am in Count... : 6
Hello I am in Count... : 7
Hello I am in Count... : 8
Hello I am in Count... : 9
*/
// With Synchronization output is