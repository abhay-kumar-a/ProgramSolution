package dsabootcamp.opps.packages.b;

import dsabootcamp.opps.packages.a.Hello;

import static dsabootcamp.opps.packages.a.Hello.Helo; // package location provided

public class Greeting extends Hello {
    public static void main(String[] args) {
        System.out.println("Hello brother ");
        // using package accessing use
      Helo();       /// calling using import package

      Hello h = new Hello(); // for class also import it
      h.Helo();// calling using ref variable of Hello class
    }

}
