package dsabootcamp.arrays;

public class Hello1 {
    public static void main(String[] args) {
        int n =9;
        if((n%9==0) && ( n%13==0))
        {
            System.out.println("Foo Bar");
            System.exit(0);
        }

        if(n%9==0)
        {
            System.out.println("Foo");
        }
        if(n%13==0)
        {
            System.out.println("Bar");
        }

    }
}
