package dsabootcamp.opps.interfaces.extendDemo1;

public class Main {
    public static void main(String[] args) {
        WaterMan w = new WaterMan();
        w.IronMan();
        w.newMan();
        w.newWater();
        Water w1 = new Water() {
            @Override
            public void newWater() {
                System.out.println("Water object crated");
            }
        };
        w1.newWater();  //Water object crated
    }
}
