package newAssignments.springFramework.taxidreiver;

public class Fuel {
    int fuelQuantity;
    Fuel(int fuelCapacity)
    {
        this.fuelQuantity = fuelCapacity;
    }
    public int getFuel()
    {
        return fuelQuantity;
    }
}
