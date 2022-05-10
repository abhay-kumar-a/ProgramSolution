package dsabootcamp.design_patterns.factory_pattern.exaple2;

import dsabootcamp.design_patterns.factory_pattern.exaple2.propertyClasses.GetInstanceOf;

public class Main{
    public static void main(String[] args) {
        GetInstanceOf g = new GetInstanceOf();
        GiveProperty giveProperty = g.getInstance("Abstraction");   // here we did not provide the internal implementation of class
        giveProperty.giveProperty();
    }

}
