package dsabootcamp.design_patterns.factory_pattern.exaple2.propertyClasses;

import dsabootcamp.design_patterns.factory_pattern.exaple2.GiveProperty;

public class GetInstanceOf {

    public GiveProperty getInstance(String str)
    {
        if(str.equals("Abstraction"))
        {
            return new AbstractionProperty();
        }
        else if(str.equals("Encapsulation") || (str.equals("encapsulation")))
        {
            return new EncapsulationProperty();
        }
        return new AbstractionProperty();
    }
}
