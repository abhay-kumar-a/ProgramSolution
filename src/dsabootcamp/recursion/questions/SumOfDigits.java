package dsabootcamp.recursion.questions;

import patterns.P;

public class SumOfDigits {
    public static void main(String[] args) {
        int n  =0;
        System.out.println("recursion :" + getSumOfDigitsUsingRecursion(n));
        System.out.println("Using simple program: "+ getSumOfDigits(1234));
    }
    static int getSumOfDigitsUsingRecursion(int n)
    {
        if(n<1)
        {
            return 0;
        }
        int c =n%10;
       return c+getSumOfDigitsUsingRecursion(n/10);
    }

    static int getSumOfDigits(int n)
    {
        int sum=0;
        while ( n>0)
        {
            int c = n%10;
            sum+=c;
            n=n/10;
        }
        return sum;
    }
}
