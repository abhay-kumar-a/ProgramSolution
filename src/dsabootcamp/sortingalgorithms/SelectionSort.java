package dsabootcamp.sortingalgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,7,2,2,2,2,1,5,6,8,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        for(int i =0; i<arr.length;i++)
        {
            int last = arr.length-1-i;
            int MaxValueIndex = getMaxValueIndex(arr,0,last);
            swap(arr,MaxValueIndex,last);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
    static int getMaxValueIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<=end;i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}