package practice;

class A2
{
    public void printData(Object obj)
    {
        System.out.println("I am object class");
    }
    public void printData(String str)
    {
        System.out.println("In am in String");
    }
}
public class P5 {
    public static void main(String[] args) {
     A2 a = new A2();
     a.printData(null);   // call String parameter  , because java always choose most specific or restrictive Hierarchy
                             // and object is top in hierarchy and string is bottom from object ..
                    // it prints I am in String
    }
}
