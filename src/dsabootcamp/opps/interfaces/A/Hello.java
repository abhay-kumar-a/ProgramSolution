package dsabootcamp.opps.interfaces.A;

interface Abhay {
    public void M();
    public static void N()
    {
        System.out.println("I am in static");
    }
    public default void O()
    {
        System.out.println("I am in default");
    }
}
class Hii implements Abhay{
    @Override
    public void M() {
        System.out.println("I am from Hello");
    }

    @Override
    public void O() {

    }

}
public class Hello extends Hii {
    public static void main(String[] args) {
        Abhay a =new Hii();
        a.M();
        a.O();
        Abhay.N();
    }
}


