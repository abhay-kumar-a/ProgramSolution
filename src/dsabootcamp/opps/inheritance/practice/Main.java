package dsabootcamp.opps.inheritance.practice;

public class Main implements Practice{
    @Override
    public void num(int num) {
        System.out.println("Number  is : " +num);
    }

    @Override
    public void Hello(String name) {
        System.out.println("name is : "+ name);
    }

    public static void main(String[] args) {
        Main  m = new Main();
        Practice p = new Practice() {
            @Override
            public void num(int num) {
                System.out.println("Number is : "+ num);
            }

            @Override
            public void Hello(String name) {
                System.out.println("Name is : "+ name);
            }
        };
        System.out.println("Using Class objects");
        m.Hello("Abhay"); // call method of interface with class objects where the class implements the interface
        m.num(45);
        System.out.println("using Interface Objects ");
        p.Hello("Vivek");  // call method of interface using interface objects
        p.num(45);
    }
}
