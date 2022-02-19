package stringarray;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class EveryCharCountInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        System.out.println();
        s = s.replace(" ", "");
        s = s.toLowerCase();
        int l = s.length();
        char[] arr = s.toCharArray();
        int count=1;
        for (int i = 0; i < l-1; i++) {
            count =1;
            for (int j = i+1; j < l; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                    if (i != j) {
                        for (int k = j; k < l - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        l--;
                    }
                }
            }
        }
        System.out.println(  count );
    }
}
