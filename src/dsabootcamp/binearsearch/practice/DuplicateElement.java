package dsabootcamp.binearsearch.practice;

import dsabootcamp.opps.interfaces.extendDemo2.A;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[]arr = { 2,2,3,3,4};
        Arrays.sort(arr);
        System.out.println(" actual Arrays is : "+ Arrays.toString(arr));
        removeDuplicateElement(arr);
    }
    static void removeDuplicateElement(int [] arr)
    {
        int j = 0;
        for(int i = 0; i<arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];

        // print all unique elements
        for (int k = 0;k<j;k++)
        {
            System.out.print(arr[k]+ " ");
        }
    }
}
