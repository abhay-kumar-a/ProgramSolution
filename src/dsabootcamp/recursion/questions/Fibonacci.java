package dsabootcamp.recursion.questions;

public class Fibonacci {
    static int  a  = 0, b=1;
    static  void fibonacci( int count)
    {
        if(count>0)
        {
            int n = a+b;
            a=b;
            b=n;
            System.out.print(n + " ");
            fibonacci(count-1);
        }
    }
    public static void main(String[] args) {
        int num =10;
        System.out.print( a + " "+ b + " ");
        fibonacci(num-2);
    }
}
