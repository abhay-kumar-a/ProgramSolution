package dsabootcamp.opps.interfaces;

public class Car implements Brake,Engine,Media{

    @Override
    public void brake() {
        System.out.println("Car will be brake after few minutes");
    }
    public void start()
    {
        System.out.println("start Engine");
    }
    public void stop()
    {
        System.out.println("Stop Engine");
    }
    public void accelerate()
    {
        System.out.println("Accelerate Engine");
    }
}
