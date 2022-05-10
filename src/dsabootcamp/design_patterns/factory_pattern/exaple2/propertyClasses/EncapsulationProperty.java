package dsabootcamp.design_patterns.factory_pattern.exaple2.propertyClasses;

import dsabootcamp.design_patterns.factory_pattern.exaple2.GiveProperty;

public class EncapsulationProperty implements GiveProperty {

    @Override
    public void giveProperty() {
        System.out.println("Encapsulation : It is define up of wrapping up of data under a single unit. It is the mechanism to binds together code and the " +
                "the data inn manipulation. Another way to think about encapsulation is , it is a protective shield that prevents the data from being accessed by" +
                "the cod outside this shield. " +
                "Technically in encapsulation: the variables or data of a class is hidden from other classes and can only access through any member  function of own class in which they are declared" +
                "As in encapsulation,  the data in a class is hidden from other classes , so it is also known as data hiding " +
                "Encapsulation can be achieved by Declaring all the variables in the class as a private and writing public method in the class to set and get the values" +
                "of variables ");
    }
}
