package newAssignments.ass18.ass18;

public class ProducerThread  implements Runnable{
   SharableListResource sharableListResource;
   ProducerThread(SharableListResource sharableListResource)
   {
       this.sharableListResource =sharableListResource;
   }

    @Override
    public void run() {
        sharableListResource.addListElement();
    }
}
