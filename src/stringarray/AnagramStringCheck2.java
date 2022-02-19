package stringarray;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramStringCheck2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        a=a.toLowerCase();
        b=b.toLowerCase();


        if(a.length()!=b.length())
        {
            System.out.println("Not Anagram");
        }
        else
        {
            char[] m =a.toCharArray();
            char[] n = b.toCharArray();
            Arrays.sort(m);
            Arrays.sort(n);

            if(Arrays.equals(m,n)==true)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not  Anagram");
            }

        }

    }
}
