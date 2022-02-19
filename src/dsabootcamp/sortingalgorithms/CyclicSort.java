package dsabootcamp.sortingalgorithms;

import java.util.Arrays;
// if array given 1 to N , then use cyclic sort;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,0,1};  // array always given 1 to n;
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int i =0;
        while (i<arr.length)
        {
            int correctIndex = arr[i];    //  index = values -1;
            if(arr[i] != arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first , int  second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
