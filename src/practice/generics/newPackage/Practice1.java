package practice.generics.newPackage;

class Employee
{
    int id ;
    Employee( int id)
    {
        this.id =id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
public class Practice1 {
    public static void main(String[] args) {
 // compareTo string method
        System.out.println("a".compareTo("A"));
        System.out.println("b".compareTo("a"));
        System.out.println("b".compareTo("b"));
        System.out.println("1".compareTo("3"));
        System.out.println("3".compareTo("1"));
        System.out.println("1".compareTo("1"));
        System.out.println(new Integer(34).compareTo(0));


        //
        System.out.println("------------------------");

        Employee employee=new Employee(5);
        Employee employee1 = new Employee(5);
        System.out.println(employee+ " "+ employee1);

        System.out.println("----------------------------");
        Integer i1= new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1 + " " + i2);
        String s = new String("Abhay");
        System.out.println(s);

    }
}
