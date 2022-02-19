package dsabootcamp.opps.abstractDemo;

public class Main {
    public static void main(String[] args) {
        {
            Son s = new Son(25);
            s.carrier();
            s.partner();
            System.out.println("Sons age : " + s.age);
            s.Hello();
            System.out.println("parent class : "+ s.finalVariable);
            System.out.println("Parent class: "+ Son.fsVariable);

            // creating object for Daughter class
            Daughter d = new Daughter(5);
            d.carrier();
            d.partner();
            System.out.println("Daughter age is: " + d.age);
            d.Hello();
            d.normal();

            // we can't create Abstract class object;/// also can create object
            Parents p = new Parents(45) {
//                public static void main(String[] args) {  // also can
//
//                }

                @Override
                public void carrier() {
                    System.out.println("Hello i am main Parent class constructor");
                }

                @Override
                void partner() {

                }
            };
            System.out.println("age value of parent class : " + p.age);
            p.carrier();

            // static method call for parent class
            int sum = Parents.sum(5,6);
            System.out.println("static sum from parent class : "+ sum);

            // normal method access for parent class
            p.Hello();
            // access variables
            System.out.println(p.age);
            System.out.println(p.finalVariable);
            System.out.println(Parents.staticVariable);
            System.out.println(Parents.fsVariable);
        }
    }
}