package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expected sum : ");
        int target = sc.nextInt();
        System.out.println("Enter First array size: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter First Array element: ");
        for(int i = 0;i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Second array Size : ");
        int size2=sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter Second Array elements: ");
        for(int i = 0;i<arr2.length;i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("First array Are : " );
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nSecond Array Are: ");
        for (int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        // logics
        System.out.println ("\nResult: ");
        for(int i =0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(target==arr1[i]+arr2[j])
                {
                    System.out.print("("+arr1[i]+","+arr2[j]+")"+" ");
                }
            }

        }
    }

}
//output
/*First array Are :
        1 4 6 2 0
        Second Array Are:
        5 1 9 6
        Result:
        (4,1) (0,5) */

