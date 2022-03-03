package dsabootcamp.opps.interfaces;

public class Main extends Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
        // we also can object of interface with all that's methods
        Engine e = new Engine() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void accelerate() {

            }
        };

        Media media = new Car();
        {

            media.start(); //  if I call media then it's printed  car engine is start(here facing this issue ) to solve this // make some good classes
            media.stop();
        }
    }
}
