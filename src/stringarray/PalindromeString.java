package stringarray;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        palindromeNo1(s);

    }
//    static boolean palindromeNo(String s) {
//        int start = 0;
//        int end = s.length() - 1;
//        while (start <= end) {
//            if (s.charAt(start) == s.charAt(end)) {
//                start++;
//                end--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
    static void palindromeNo1(String s) {
        int start = 0;
        int count = 0 ;
        int l = s.length();
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                count++;
            }
            start++;
            end--;
        }
     if(count< l/2)
     {
         System.out.println("No");
     }
     else {
         System.out.println("Yes");
     }
    }
}