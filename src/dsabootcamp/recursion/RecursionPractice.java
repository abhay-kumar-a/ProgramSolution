package dsabootcamp.recursion;

import dsabootcamp.opps.staticExamples.Main;

// print 1  to 5 using recursion
public class RecursionPractice {
    public static void main(String[] args) {
        int n  =1;
//        number(n);
//        HelloWorld(1,10);
        evenOddNumbers(0,10);

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
    // example
    //  print hello world 10 times
    static void HelloWorld(int MinTime ,int MaxTime)
    {
        if(MinTime==MaxTime)
        {
            System.out.println(MinTime+ " ---- Hello World");
            return;
        }
        System.out.println(MinTime+ " ---- Hello world");
        HelloWorld(MinTime+1,MaxTime);
    }

    static void   evenOddNumbers(int i, int num)
    {
        if(i%2==0)
        {
            System.out.println(i+ " -- is Even");
        }
        else {
            System.out.println(i+ " -- is Odd");
        }
        if(i==num)
        {
            return;
        }

        evenOddNumbers(i+1,num);
        // here we also run 10 time ,even i print after recursion method'
        System.out.println("It will also run"); // it will also run multiple time till condition is not break
    }


}
