package newAssignments.springFramework.taxidreiver;

public class Main {
    public static void main(String[] args) {
        Driver d= new Driver(true);     // dependency
        Fuel f= new Fuel(12);
        Taxi t= new Taxi(d,f);   // Driver and fuel are two dependency , because Taxi is dependent on both , and if this property will be got ,then engine will be started
        t.engineStarted();           // and here we manage these dependencies by create the object of Driver and fuel.....

    }
}
