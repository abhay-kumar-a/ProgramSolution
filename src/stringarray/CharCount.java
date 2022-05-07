package stringarray;
import  java.util.Scanner;

import java.util.Arrays;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        s=s.replaceAll("\\s","");
       // s =s.toLowerCase();
        System.out.println();
        int l = s.length();;
        int[] count = new int[256];
        for (int i = 0; i < l; i++) {
            count[s.charAt(i)] = count[s.charAt(i)] + 1;
        }
        char[] ch = new char[l];
        for (int i = 0; i < l; i++) {

            ch[i] = s.charAt(i);
            int find = 0;
            for (int j = 0; j < l; j++) {
                if (ch[j] == s.charAt(i)) {
                    find++;
                }
            }

            if (find == 1) {
                System.out.println(s.charAt(i) + ": " + count[s.charAt(i)]);
            }
        }
//        System.out.println(find);

    }
}




