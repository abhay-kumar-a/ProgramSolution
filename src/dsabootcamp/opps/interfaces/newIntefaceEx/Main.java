package dsabootcamp.opps.interfaces.newIntefaceEx;

public class Main{
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();


        // for upgrade car engine
        System.out.println();
        System.out.println("Upgrade Engine");
        car.UpgradeDefaultEngine();  // here you can easily upgrade your engine without creating any objects \
                                   // so think how creative is that
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();

    }
}
