package  newAssignments.concepts.multithreading.syncronization;

public class ThreadService {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        int n = 5;
        ChildThread childThread1 = new ChildThread(sharedResource,n);
        Thread thread1 =new Thread(childThread1);
        ChildThread childThread2 = new ChildThread(sharedResource,n);
        Thread thread2 =new Thread(childThread2);
        thread1.start();
        thread2.start();
    }
}
