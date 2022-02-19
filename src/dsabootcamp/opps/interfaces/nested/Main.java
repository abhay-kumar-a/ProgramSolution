package dsabootcamp.opps.interfaces.nested;

import dsabootcamp.binearsearch.New;

public class Main {
    public static void main(String[] args) {
        B1 b = new B1();
        System.out.println(b.isOdd(4));

        SubClass n = new SubClass();
        n.Hello(); // it calls subclass Hello

        NewClass n1 = new NewClass();
        n1.Hello();  // it calls New Class Hello

//        NewClass n2 = new SubClass();  // you can not create objects like this ( its possible only in inheritance)
//        SubClass n3 = new NewClass();

}
}
