package dsabootcamp.bitwiseoperators;

import java.util.Scanner;

public class AdditionOfBinaryNo {
    public static void main(String[] args) {
//        int a = 0;
////        int b = 0 ;
////        int c = binaryAddition(a,b);
////        System.out.println(c);
        long m,n;
        int i =0;
        int carry =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no : ");
        m = sc.nextLong();
        System.out.println("Enter Second no : ");
        n = sc.nextLong();

        int[] sum = new int[10];

        while(m>0 || n>0)
        {
            sum[i++] = (int)(m%10+n%10+carry)%2;
            carry = (int) (m%10 + n%10 + carry) /2;

            m = m/10;
            n = n/10;

        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");

        binaryAdditionInbuiltFunction();


    }

    // Addition of two binary no using inbuilt functions;
    static void binaryAdditionInbuiltFunction()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Binary no : ");
        String s1 = sc.next();
        System.out.println("Enter Second Binary no : ");
        String s2 = sc.next();

        int t1 = Integer.parseInt(s1,2); // 2 is base
        int t2 = Integer.parseInt(s2,2);
        int Ans = t1+t2;
        System.out.println("t1 : "+ Integer.toBinaryString(t1));
        System.out.println("t2 : "+ Integer.toBinaryString(t2));
        System.out.println("Addition of two binary no is : " + Integer.toBinaryString(Ans));
    }

     static  int binaryAddition(int a , int b)
     {
             int c = a;
             int d = b;
             if( (c==1) && (d == 1))
             {
                 return 10;
             }
             if((c==0) && (d==0))
             {
                 return 0;
             }
//             if(((c==0) && (d == 1)) || ((c==1) && (d==0)) )
//             {
//                 return 1;
//             }
         return 1;
     }
}
