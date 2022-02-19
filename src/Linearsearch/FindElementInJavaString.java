// find element in range...

package Linearsearch;
import java.util.*;

import java.util.Arrays;

public class FindElementInJavaString {
    public static void main(String[] args) {
        String s = "Abhay";
        s= s.toLowerCase();
        Scanner sc= new Scanner(System.in);
        char[] m = s.toCharArray();
        System.out.println(Arrays.toString(m));
        System.out.print("Enter target character : ");
        char target = sc.next().charAt(0);
        System.out.println();
        int b=LinearSearch(m,target);
        System.out.println(target + " preset at position : "+b);

    }
    static  int LinearSearch(char[] s , char target)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter stating index: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter end index : ");
        int b= sc.nextInt();

        for(int  i = a ; i<=b;i++)
        {
            if(target==s[i])
            {
                 return i;
            }
        }
        return -1;
    }
}
