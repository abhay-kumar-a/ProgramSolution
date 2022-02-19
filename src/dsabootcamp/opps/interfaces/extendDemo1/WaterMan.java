package dsabootcamp.opps.interfaces.extendDemo1;

public class WaterMan implements Man,Iron{

    @Override
    public void newMan() {
        System.out.println("Hello I am Man");
    }

    @Override
    public void newWater() {
        System.out.println("Hello I am water");
    }

    @Override
    public void IronMan() {
        System.out.println("Hello I am ironMan");
    }
}
