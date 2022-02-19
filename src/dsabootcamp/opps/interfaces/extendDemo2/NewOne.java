package dsabootcamp.opps.interfaces.extendDemo2;
// static method did not need to implement here
// but default method necessary to implements here by separately for all classes
public class NewOne implements A,B{

    @Override
    public void fun() {

    }  @Override
    public void newDefaults() {
        A.super.newDefaults();
    }


    @Override
    public void newDefaults1() {
        B.super.newDefaults1();
    }
}
