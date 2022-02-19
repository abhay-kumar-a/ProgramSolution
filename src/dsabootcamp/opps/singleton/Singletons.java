package dsabootcamp.opps.singleton;
//In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
// only one objects means, all new obj of Singleton class will be pointing same object;
// how can we make singletons class : making constructor as private;
public class Singletons {

    public static Singletons instances; // create ref
   private Singletons() // making privet , because it will help , by this we can not make Singleton class Object;
    {

    }
    public static Singletons newMethod(){ // method , we also can make a method of our own reference type; and that will have return type ;
       if(instances==null) // if whether only 1 obj is created or not
       {
           instances = new Singletons(); //  call cons, and make an object;//Instantiation of utility class 'Singletons'
       }
        return instances;  // reference type method also have return types
   }

}