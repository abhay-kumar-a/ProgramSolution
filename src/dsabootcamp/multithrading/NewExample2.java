package dsabootcamp.multithrading;
// print doc using thread
class A1 extends Thread    // achieve thread using Thread class
{
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
        a.start();
        try {Thread.sleep(100);} catch (Exception e) {}
        b.start();

    }
}
