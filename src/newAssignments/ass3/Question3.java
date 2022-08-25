package newAssignments.ass3;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Question3 {
    public static void main(String[] args) {
        PayComparator comparator = new PayComparator();
        PriorityQueue<Payment> pr= new PriorityQueue<>(10,comparator);

        pr.add(new Payment("1",2000,1234534232l,"Mastercard"));
        pr.add(new Payment("2",10000,1232654535434l,"VisaCard"));
        pr.add(new Payment("3",20000,543546342343l,"RuPayCard"));
        pr.add(new Payment("4",430000,23253485304l,"VisaCard"));


        // convert priorityQueue to Set
        Set<Payment> list = new HashSet<>(pr);
        System.out.println(list);

        //Convert the original queue into a thread safe version of Queue.
        ConcurrentLinkedQueue concurrentLinkedQueue =new ConcurrentLinkedQueue(pr);

       // Sort the queue based on card type
        // print sorted form according cardType
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
    }
}


class Payment {
    String id;
    int amount;
  //  Add two fields to payment, AccountNumber and Cardtype
    long accountNumber ;
    String cardType;

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", accountNumber=" + accountNumber +
                ", cardType='" + cardType + '\'' +
                '}';
    }

    public Payment(String id, int amount, long accountNumber, String cardType) {
        this.id = id;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.cardType = cardType;
    }


}
class PayComparator implements Comparator<Payment>
{

    @Override
    public int compare(Payment o1, Payment o2) {
        return o1.cardType.compareTo(o2.cardType);
    }
}
