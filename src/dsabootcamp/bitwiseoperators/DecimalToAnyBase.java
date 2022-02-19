package dsabootcamp.bitwiseoperators;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();
//        byte no = sc.nextByte() ;
//        String s = Integer.toBinaryString(no);
//        System.out.println(s);
//        System.out.println("length : " + s.length());
        int result = 0;

        int temp = 1;
        while(n>0)
        {
            int c= n%base;
            result = result +c*temp;
            n  = n/base;  // no. is dividing by 2(binary)
            temp = temp*10;
        }
        System.out.println("binary is  : " + result);

    }
}
