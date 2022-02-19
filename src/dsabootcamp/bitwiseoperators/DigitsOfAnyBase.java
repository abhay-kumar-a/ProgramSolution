package dsabootcamp.bitwiseoperators;

import java.util.Scanner;

public class DigitsOfAnyBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n= scanner.nextInt();
        System.out.print("Enter base : ");
        int base = scanner.nextInt();

        System.out.println("no in base '" + base + "' is  : " + decimalToAnyBase(n,base));
        int c = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println("All digits of any base : " + c);

        System.out.println("no in decimal : " + anyBaseToDecimal(n,base));
    }
    static int anyBaseToAnyBase(int base1,int base2)
    {
        int result  = 0;
        return result;
    }
    static  int decimalToAnyBase(int no , int base) {
        int result = 0;
        int p = 1;
        while (no>0){
        int c = no % base;
            System.out.println(c);
        result = result + c * p;
        p = p * 10;
        no = no / base;
    }

        return result;
    }
    static int anyBaseToDecimal(int No, int base)
    {
        int decimalNo = 0 ;
        int power = 0;

        while (No>0)
        {
            int c = No%10;
            decimalNo = (int) (decimalNo+  c * (Math.pow(base,power)));
            power++;
            No = No/10;
        }
        return decimalNo;
    }
}
