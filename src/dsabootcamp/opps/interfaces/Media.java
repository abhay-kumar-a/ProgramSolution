package dsabootcamp.opps.interfaces;

public interface Media {
    void start();
    void stop();
    static  void staticMethod(){  // in interface or abstract can have static method with body;
        System.out.println("Hello");
    }
}
