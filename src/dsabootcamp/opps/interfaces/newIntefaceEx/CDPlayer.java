package dsabootcamp.opps.interfaces.newIntefaceEx;

import dsabootcamp.opps.interfaces.Media; /// hewe media access form diff package so , here import is imported

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Media player is start");
    }

    @Override
    public void stop() {
        System.out.println("Media player is stop");
    }
}
