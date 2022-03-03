package dsabootcamp.opps.interfaces;
// we use implement keyword for access property of interface in class , access property of one interface to another interface we use extend keyword
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
