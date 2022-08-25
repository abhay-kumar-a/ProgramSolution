package  newAssignments.concepts.multithreading.syncronization;

public class ChildThread implements  Runnable{
    private SharedResource sharedResource;
    private int n;

    public ChildThread(SharedResource sharedResource, int n) {
        this.sharedResource = sharedResource;
        this.n = n;
    }

    @Override
    public void run() {
            sharedResource.printData(n);
    }
}
