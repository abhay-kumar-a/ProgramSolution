package  newAssignments.concepts.multithreading.syncronization;

public class CustomerWitdrawThread implements Runnable{

    private Customer customer;
    private int amount;

    public CustomerWitdrawThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public void run() {
        customer.withdraw(amount);
    }
}
