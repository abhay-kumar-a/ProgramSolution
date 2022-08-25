package  newAssignments.concepts.multithreading.syncronization;

public class CustomerThreadExecution {



    public static void main(String[] args) {
         Customer customer = new Customer();
         CustomerWitdrawThread customerWitdrawThread = new CustomerWitdrawThread(customer, 12000);
         CustomerDepositThread customerDepositThread = new CustomerDepositThread(customer, 5000);
         Thread withdrawThread = new Thread(customerWitdrawThread);
         Thread depositThread = new Thread(customerDepositThread);
            withdrawThread.start();
            depositThread.start();

    }



}
