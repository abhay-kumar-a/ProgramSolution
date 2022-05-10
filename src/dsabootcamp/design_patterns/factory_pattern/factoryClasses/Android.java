package dsabootcamp.design_patterns.factory_pattern.factoryClasses;

import dsabootcamp.design_patterns.factory_pattern.OS;


public class Android implements OS {

    @Override
    public void spec() {
        System.out.println("Open source");
    }
}
