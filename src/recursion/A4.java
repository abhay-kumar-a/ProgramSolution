package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for(int i  = 0 ; i< n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("First largest is "+ arr[n-1]);
        System.out.print(" Second largest is " +arr[n-2]);
        int average = (arr[n-1]+arr[n-2])/2;
        System.out.print(" and average of both is "+ average);
    }
}
