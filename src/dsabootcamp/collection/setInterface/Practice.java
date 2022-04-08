package dsabootcamp.collection.setInterface;


import dsabootcamp.opps.packages.a.Hello;

import java.util.SortedSet;

public class Practice implements A {


    public static void main(String[] args) {
        Practice p = new Practice();
        p.run();
        A.Hello();
        A.Call();
    }

    @Override
    public void run() {
        System.out.println("Hello My  name is Abhay");
    }
}

 interface A
{
    abstract void run();

    static void Hello() {
        System.out.println("Hello I am in static : ");
    }

    private void run2()
    {
        System.out.println("Hello I am in private : ");
    }
    A a= new A() {
        @Override
        public void run() {
            System.out.println("");
        }
    };
    static void Call()
    {
        a.run2();
    }

}
/*Hello My  name is Abhay
Hello I am in static :
Hello I am in private : */