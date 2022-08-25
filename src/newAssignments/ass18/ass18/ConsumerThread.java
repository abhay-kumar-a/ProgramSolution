package newAssignments.ass18.ass18;

public class ConsumerThread implements  Runnable{
    SharableListResource sharableListResource;
    ConsumerThread(SharableListResource sharableListResource)
    {
        this.sharableListResource =sharableListResource;
    }

    @Override
    public void run() {
        sharableListResource.removeListElement();
    }
}
