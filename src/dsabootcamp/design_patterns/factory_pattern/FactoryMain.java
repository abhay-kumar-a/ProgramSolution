package dsabootcamp.design_patterns.factory_pattern;
import dsabootcamp.design_patterns.factory_pattern.factoryClasses.OperatingSystemFactory;
public class FactoryMain {
    public static void main(String[] args) {

        OperatingSystemFactory o1 = new OperatingSystemFactory();
         OS ob = o1.getInstance("Old");
         ob.spec();

    }
}
