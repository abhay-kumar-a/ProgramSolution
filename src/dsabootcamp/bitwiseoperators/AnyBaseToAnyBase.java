package dsabootcamp.bitwiseoperators;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any base no to convert into decimal: ");
        int n = sc.nextInt();
        System.out.print("Enter base1 : ");
        int base1 = sc.nextInt();
        System.out.print("Enter base2 : ");
        int base2 = sc.nextInt();
         int decimalNo = anyBaseToDecimal(n,base1);
        System.out.println(decimalNo);
        int newBase =  decimalToAnyBase(decimalNo,base2);
        System.out.println("New base No is : " + newBase);

    }
    static  int anyBaseToDecimal(int n,int base1)
    {
        int resultDecimal = 0;
        int digits = 0;
        while(n>0)
        {
            int c= n%10;
            resultDecimal = resultDecimal + c* (int)(Math.pow(base1,digits));
            n  = n/10;  // no. is dividing by 2(binary)
            digits++;
        }
        return resultDecimal;
    }
    static int decimalToAnyBase(int n, int base2)
    {
        int result = 0;

        int temp = 1;
        while(n>0)
        {
            int c= n%base2;
            result = result +c*temp;
            n  = n/base2;  // no. is dividing by 2(binary)
            temp = temp*10;
        }
        return result;
    }
}
