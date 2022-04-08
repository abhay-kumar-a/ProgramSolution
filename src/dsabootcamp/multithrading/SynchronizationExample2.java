package dsabootcamp.multithrading;

class PrintNumber{
    public synchronized void printNumber(int n)
    {
        for(int i =1;i<=5;i++)
        {
            System.out.println(i*n);
            try{Thread.sleep(1000);}catch (Exception e){e.printStackTrace();}
        }
    }
}
class ThreadA extends Thread {
    //making reference of PrintNumber
    PrintNumber p;
    ThreadA(PrintNumber p)
    {
        this.p = p;
    }
    public void run()
    {
        p.printNumber(2);
    }
}
class ThreadB extends Thread{
    PrintNumber p;
    ThreadB(PrintNumber p)
    {
        this.p= p;
    }
    public void run()
    {
        p.printNumber(100);
    }
}
public class SynchronizationExample2 {
    public static void main(String[] args)  throws Exception{
PrintNumber p = new PrintNumber();

// with anonymous class
Thread t = new Thread(() -> p.printNumber(2));
Thread t1 = new Thread(() -> p.printNumber(100));

// here we need to synchronization keyword in method ,  because i need first thread complete his execution and another thread use
// that shared memory and complete his execution . it will be continued for all Thread
t.start();
t1.start();
t.join();
t.join();
// run like this means is first put start and then join , then this thing work like synchronization keyword..
//t.start();
//t.join();
//t1.start();
//t1.join();

// Without anonymous class

//ThreadA a = new ThreadA(p);
//ThreadB b = new ThreadB(p);
//a.start();
//b.start();
//a.join();
//b.join();
    }
}

/*without synchronization , no matter that you are using join()
2
100
200
4
6
300
8
400
500
10
*/
///with synchronization
/*2
4
6
8
10
100
200
300
400
500*/