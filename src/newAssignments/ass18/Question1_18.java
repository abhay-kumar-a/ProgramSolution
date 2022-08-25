package newAssignments.ass18;


class Add implements  Runnable
{
    SharableListThread sharableListThread;
    int element;

    public Add(SharableListThread sharableListThread, int element) {
        this.sharableListThread = sharableListThread;
        this.element = element;
    }

    @Override
    public void run() {
        sharableListThread.add(element);
    }
}
class Removed implements Runnable
{
    SharableListThread sharableListThread1;
    int index;

    public Removed(SharableListThread sharableListThread1 , int index) {
        this.sharableListThread1 = sharableListThread1;
        this.index = index;
    }

    @Override
    public void run() {
        sharableListThread1.remove(index);
    }
}
public class Question1_18 {

    /*Multiple threads are trying to access that list(add and remove)
    Create multiple threads --- create 2 threads that will add data to the list and create 2 more threads that
    will remove the data from that list. and all of these operations will execute in a parallel manner.
    Try using wait() and notify();
     */
    public static void main(String[] args) {
       SharableListThread t = new SharableListThread();
       Add a = new Add(t,10);
      // Removed r = new Removed(t,2);
       Thread t1 = new Thread(a);
      // T/hread t2 = new Thread(r);
       t1.start();
      // t2.start();

       t.getList();

    }
}
