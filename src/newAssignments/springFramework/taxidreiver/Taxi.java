package newAssignments.springFramework.taxidreiver;

public class Taxi {
    Driver d ;
    Fuel f ;
    Taxi(Driver d , Fuel f)
    {
        this.d = d;
        this.f = f;
    }
    public void  engineStarted() {
        if (d.hasLicence && f.fuelQuantity>0) {
            System.out.println("Engine Started : \n Fuel is : "+f.getFuel()+" Liter");
        }
    }

}
