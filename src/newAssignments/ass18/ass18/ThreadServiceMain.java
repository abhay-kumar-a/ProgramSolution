package newAssignments.ass18.ass18;

import java.util.ArrayList;
import java.util.List;

public class ThreadServiceMain {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        SharableListResource sharableListResource =new SharableListResource(list);
        ProducerThread producerThread =new ProducerThread(sharableListResource);
        ConsumerThread consumerThread =new ConsumerThread(sharableListResource);
        new Thread(producerThread).start();
        new Thread(consumerThread).start();
    }
}
