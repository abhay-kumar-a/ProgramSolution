package  newAssignments.concepts.multithreading.syncronization;

public class CustomerDepositThread implements Runnable{

    private Customer customer;
    private int amount;

    public CustomerDepositThread(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public void run() {
        customer.deposit(amount);
    }
}
