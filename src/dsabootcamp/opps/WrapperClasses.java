package dsabootcamp.opps;
// Wrapper classes in java provide a mechanism to convert primitive into objects and objects into primitive;
public class WrapperClasses {
    /// why is  wrapper classes and why use it ;

    // we can't swap primitive data types
    public static void main(String[] args) {
        int a=3;
        int b = 4;
        System.out.println("a : "+ a +"\n" + "b : "+b);

        swap(a,b);
//        a=a+b;
//        b=a-b;
//        a= a-b;
//        System.out.println("a : "+ a +"\n" + "b : "+b);

        // using wrapper classes
//            Integer integer1 = new Integer(5);  // crete an object of Integer class
//        System.out.println(integer1);

        // creating object
        A n1 = new A("Abhay Kumar");
        System.out.println(n1.name);
        System.out.println(n1.num);
//        n1.num =3; //can't change  because n1  is final
//        System.out.println(n1.num);


        final  A ab = new A("Abhay Kumar");//
        ab.name = "others";
     //ab = new A("Hello"); // here , when non-primitive is final , you can't reassign it ;///Cannot assign a value to final variable 'ab'
        System.out.println(ab.name);

        A new1 = new A("Vivek");
        for(int i  = 0 ; i<10; i++ )
        {
            System.out.println(new1.name);
        }
    }
    static void swap(int a , int b)
    {
        int temp = a;
        a =b;
        b=temp;
        System.out.println("a : "+ a +"\n" + "b : "+b);
    }
}
class  A {
    final  int num = 45;
    int a =4;
    String name;
    A(String name)
    {
        this.name = name;
    }

}
