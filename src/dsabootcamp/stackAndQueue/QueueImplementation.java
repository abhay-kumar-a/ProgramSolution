package dsabootcamp.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        QueueMethod(0);
    }
    static void QueueMethod(int i)
    {
        Queue queue = new LinkedList();
        queue.add(23);
        queue.add(45);
        System.out.println(queue);


    }
}
