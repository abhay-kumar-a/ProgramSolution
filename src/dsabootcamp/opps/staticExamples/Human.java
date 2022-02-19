package dsabootcamp.opps.staticExamples;

public class Human {
    String name;
    int age;
    float salary;
    boolean Married;
    static int population;   // common for all //  static variables cont depends on  objects(instance) of the class

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        Human.population = population+1;
    }

    // creating method
    void allInformation()
    {
        System.out.println("Human name :  " + name +"\n" + "age :  "+ age+  " \n" + "salary : " + salary + "\n" + "Married : " + Married );
    }

    static void Hello( int name)
    {
      //  this.name = name;  // here in static method we can't use "this " keyword , because this , work as ref, and static
        //  did not depend on  ref(ins) of class ;
    }

}
