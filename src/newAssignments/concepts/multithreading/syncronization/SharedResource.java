package  newAssignments.concepts.multithreading.syncronization;

public class SharedResource {

    public  void printData(int n) {
        synchronized (this){
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread name " + Thread.currentThread().getName() + "Counter " + (i * n));
            }
        }
    }
}
