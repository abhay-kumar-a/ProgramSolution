package dsabootcamp.multithrading;
// print doc using thread
class A1 extends Thread    // achieve thread using Thread class
{
    A1(){
        setDaemon(true);
        setName("Thread _First");
    }
   public void run()
    {
        int n=5;
        for (int i = 1;i<=n;i++)
        {
            System.out.println("!!!! Printing doc "+ i+ " for A");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
        String s = Thread.currentThread().getName();
        System.out.println(isDaemon());
        System.out.println(isAlive());

        System.out.println(s);
    }
}
class B1 extends Thread
{
   public void run()
    {
        int n=5;
        for (int i = 1;i<=n;i++)
        {
            System.out.println("@@@@ Printing doc "+ i+ " for B");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
        }
    }
}
public class NewExample2 {
    public static void main(String[] args) {
        A1 a= new A1();
        B1 b = new B1();
        String s= Thread.currentThread().getName();
        System.out.println("Current Thread name : "+ s);
        a.start();
        //try {Thread.sleep(100);} catch (Exception e) {}
        b.start();

    }
}
