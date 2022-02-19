package dsabootcamp.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        // fibonacci  series using loops
//        int a = 0;
//        int b = 1;
//        int n =10;
//        int nextValue = 0;
//        System.out.print(a + " " + b + " ");
//        for(int  i = 2 ; i< n ;i++){
//            nextValue = a + b;
//            a = b;
//            b = nextValue;
//            System.out.print(nextValue+ " ");
//        }

       int m =  fibonacci(4);
        System.out.println(m);

    }
        // fibonacci  series using recursion;
        static int fibonacci(int n)
        {
            if(n <2)
            {
                return n;
            }
            return  fibonacci(n-1)+ fibonacci(n-2);
        }
}
