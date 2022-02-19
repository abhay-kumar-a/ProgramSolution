package dsabootcamp.opps.polymorphism;

public class ObjectPrint {
    int a;
    ObjectPrint( int a)
    {
        this.a = a;
    }
    // override toString Method;
    @Override //  this is called annotation
    public String toString()
    {
        return ""+ a;
    }


    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj.a);
        //System.out.println(obj);// print object give // hexadecimal values by default
        // override to string method
        System.out.println(obj);// so print 5;// here override own toString method so , print 5;


    }
}
