package dsabootcamp.opps.interfaces.newIntefaceEx;

import dsabootcamp.opps.interfaces.Engine;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power engine is start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine is stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine is Accelerate");
    }
}
