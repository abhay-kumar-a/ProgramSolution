package dsabootcamp.design_patterns.factory_pattern.exaple2.propertyClasses;

import dsabootcamp.design_patterns.factory_pattern.OS;
import dsabootcamp.design_patterns.factory_pattern.exaple2.GiveProperty;

class AbstractionProperty implements  GiveProperty
{
    @Override
    public void giveProperty() {
        System.out.println("Abstraction : Data Abstraction is the property by which only the essential\n"+
                "details are displayed to the user. the trivial or non-essential property are not displayed to the user\n" +
                "A car is viewed as a car rather than its individual components.\n" +
                "Data abstraction may also be define as the process of identifying only the requirement characteristic of object \n" +
                "of an object ignoring the Irrelevant details. The properties and behaviour of an object differentiate it from\n" +
                "other object of similar type and also help in classifying or grouping object \n" +
                "Consider a real time example of a man drive a car. The man the man only know tha t only pressing the accelerator \n" +
                "will increase the speed of a car or applying break to stop the car but actually does not know how how speed is increasing while pressing \n" +
                "the accelerator. he does not know inner mechanism of car accelerator , break etc of the car . The is is what abstraction is.\n" +
                "in java abstraction is achieved by interface and abstract classes   " );
    }
}
