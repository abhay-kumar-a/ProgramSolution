package newAssignments.ass3;

import java.util.Comparator;

class Payment1 {
    String id;
    int amount;
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

    public Payment1(String id, int amount, long accountNumber, String cardType) {
        this.id = id;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.cardType = cardType;
    }


}
class PayComparator1 implements Comparator<Payment>
{

    @Override
    public int compare(Payment o1, Payment o2) {
        return o1.cardType.compareTo(o2.cardType);
    }
}