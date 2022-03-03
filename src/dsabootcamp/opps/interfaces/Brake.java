package dsabootcamp.opps.interfaces;
// interface : interface just say what to do not how to do;
interface Brake {
    void brake();  // interface abstract method con not have body;

    static void helloStatic()
    {
        System.out.println("I am static method in interface");
    }
}

// in interface normal method did not have body but static method have body also