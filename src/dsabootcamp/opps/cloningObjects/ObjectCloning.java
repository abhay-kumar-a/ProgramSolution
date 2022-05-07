package dsabootcamp.opps.cloningObjects;

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(1);
        e1.setName("Abhay");
        e2.setId(2);
        e2.setName("Vivek");

        Employee e3 = e1;
        Employee e4 = e1.clone();

        System.out.println("------------------------------");
        System.out.println(e4.id);
        System.out.println(e4.name);

        System.out.println(e1.name);
        System.out.println(e1.id);
        //
        System.out.println(e3.name);
        System.out.println(e3.id);
    }
}
