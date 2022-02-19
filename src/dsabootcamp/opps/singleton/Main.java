package dsabootcamp.opps.singleton;

public class Main {
    public static void main(String[] args) {
     Singletons s = Singletons.instances;  // declaring a reference  and calling instances(instances var) from Singleton class // by default it cont call constructor, so return 'null'
//        Singletons s1 = null; //  also,can declare as well
        System.out.println(s);
        System.out.println(Singletons.instances);
//        Singletons s1 = new Singletons(); //  cant make object like that because constructor is private;
        System.out.println(Singletons.newMethod()); // return same value : Singletons@65ab7765
        System.out.println(Singletons.newMethod()); // return same value : Singletons@65ab7765
        System.out.println(Singletons.newMethod()); // return same value : Singletons@65ab7765

        // use like that
        Singletons a = Singletons.newMethod();  // here object of Singleton class pointing same object value // here constructor not call
        Singletons a1 = Singletons.newMethod();
        Singletons a2 = Singletons.newMethod();

        System.out.println("By Singleton class");
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
    }
}
