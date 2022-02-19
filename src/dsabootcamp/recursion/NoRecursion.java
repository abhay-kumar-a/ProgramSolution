package dsabootcamp.recursion;
// print 1  to 5 using recursion
public class NoRecursion {
    public static void main(String[] args) {
        int n  =1;
        number(n);
    }
    static void number(int n)
    {
        if( n==5)  // this is base condition : it is used for stop recursion to call another method;
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number(n+1);

    }

}
