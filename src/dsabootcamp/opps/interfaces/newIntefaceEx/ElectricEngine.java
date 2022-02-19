package dsabootcamp.opps.interfaces.newIntefaceEx;

import dsabootcamp.opps.interfaces.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric Engine is start ");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine is stop");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricEngine is Accelerate");
    }
}
