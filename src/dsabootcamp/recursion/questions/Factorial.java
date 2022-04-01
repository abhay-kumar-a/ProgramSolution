package dsabootcamp.recursion.questions;
// or product of n numbers.......
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getFactorial(n));
    }
    static int getFactorial(int num)
    {
        if(num<=1)
        {
            return 1;
        }
//        int m = num * getFactorial(num-1);
//        System.out.println(m);
       return num * getFactorial(num-1);

    }


}
