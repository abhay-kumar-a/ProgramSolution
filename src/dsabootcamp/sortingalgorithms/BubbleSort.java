package dsabootcamp.sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,6,9,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr)
    {
        boolean sorted;
        for(int i = 0;i<arr.length-1;i++)
        {
            sorted=false;
            System.out.print(i+1 + " ...");            // Print all Iterations
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println(" ");
            for(int j = 1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                    sorted = true;
                }
            }

            //if you do not swap the particular value of i , it means array is sorted hence stop the program.
            if(sorted==false)
            {
                break;
            }
        }

    }
}
