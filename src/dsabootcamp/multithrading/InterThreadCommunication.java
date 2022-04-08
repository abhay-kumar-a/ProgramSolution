package dsabootcamp.multithrading;

class SetAndGet
{
    int num;
    boolean checkSetValue =false;
    public synchronized void put(int num)
    {
        while (checkSetValue)
        {
            try{wait();}catch (Exception e){e.printStackTrace();} // or use catch(Exception e )
        }
        System.out.println("@@@_Put : "+ num);
        this.num = num;
        checkSetValue= true;
        notify();
    }
    public synchronized void  get() {
        while (!checkSetValue)
        {
            try{wait();} catch (IllegalMonitorStateException | InterruptedException e){e.printStackTrace();}
        }
        System.out.println("!!!_Get : "+ num);
        checkSetValue =false;
        notify();  // if we not put notify over here it will get error...
    }
}
// create thread class
class Producer implements Runnable{
    SetAndGet s1;
    Producer( SetAndGet s1)
    {
        this.s1 = s1;
        Thread t= new Thread(this,"Producer"); // this call current class object
        t.start();
    }
    int i =0;
    public void run()
    {
        int j =0;
        while (j<10)
        {
            s1.put(i++);
            try{Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
            j++;
        }
    }
}
class Consumer implements Runnable
{
    SetAndGet s1 ;
    Consumer(SetAndGet s1)
    {
        this.s1=s1;
//        Thread t =new Thread(new Consumer(s1), "Consumer");
        Thread t1 = new Thread(this,"Consumer");
        t1.start();
    }

    public void run()
    {
        int j=0;
       while (j<10)
       {
           s1.get();
           try{Thread.sleep(1000);}catch(Exception e) {e.printStackTrace();}
           j++;
       }
    }

}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SetAndGet s =new SetAndGet();
        Producer p =new Producer(s);
       Consumer c = new Consumer(s);
    }
}
