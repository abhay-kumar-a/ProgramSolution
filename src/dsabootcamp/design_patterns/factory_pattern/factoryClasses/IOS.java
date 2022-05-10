package dsabootcamp.design_patterns.factory_pattern.factoryClasses;

import dsabootcamp.design_patterns.factory_pattern.OS;

public class IOS implements OS {
    @Override
    public void spec() {
        System.out.println("Close source");

    }
}
