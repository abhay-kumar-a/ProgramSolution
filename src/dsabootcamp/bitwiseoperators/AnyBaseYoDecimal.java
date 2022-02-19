package dsabootcamp.bitwiseoperators;

import java.util.Scanner;

public class AnyBaseYoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any base no to convert into decimal: ");
        int n = sc.nextInt();
        System.out.print("Enter base : ");
        int base = sc.nextInt();

        int result = 0;
        int digits = 0;
        while(n>0)
        {
            int c= n%10;
            result = result + c* (int)(Math.pow(base,digits));
            n  = n/10;  // no. is dividing by 2(binary)
            digits++;
        }
        System.out.println("binary is  : " + result);

    }
}
