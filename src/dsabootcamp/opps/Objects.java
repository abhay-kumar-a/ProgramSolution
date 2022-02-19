package dsabootcamp.opps;

public class Objects  {
    public static void main(String[] args) {
        Abhay a = new Abhay(); // new Abhay() / whole things called objects
        System.out.println(a.s);
        System.out.println(a.m());
    }
}
class Abhay
{
    int s =4;

    int  m()
    {
        System.out.println("Hello");
        return 0;
    }
}