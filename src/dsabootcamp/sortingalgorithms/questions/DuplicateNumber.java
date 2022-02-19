package dsabootcamp.sortingalgorithms.questions;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2,3,1,4,3};
        int a = duplicateNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }
    static  int duplicateNumber(int[] arr)
    {
       int i=0;
        while(i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[index] != arr[i])
            {
                swap(arr,index,i);
            }
            else {
                i++;
            }
        }
        // find duplicate numbers;
        int index = 0;
        for(int  j = 0; j<arr.length-1;j++)
        {
            if(arr[arr.length-1]==arr[j])
            {
                index = arr[arr.length-1];
            }
        }
        return index;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
