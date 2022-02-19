package dsabootcamp.conditional_loops;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Rule 1 -------------------------------------------------------------------
        String nextUse = sc.next();    ///input = Hello Abhay and Vivek;
        System.out.println(nextUse);  // output = Hello(it will print)
        String nextLine= sc.nextLine();//  but here it considers ( Abhay and Vivek)
        System.out.println(nextLine); //  so // output=  Abhay and Vivek;


    }
}
