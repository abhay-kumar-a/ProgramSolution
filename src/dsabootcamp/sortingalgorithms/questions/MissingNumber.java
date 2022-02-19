package dsabootcamp.sortingalgorithms.questions;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,2};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        int m = mi(arr);
        System.out.println(m);
    }
    static void missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i];
            if (arr.length == index) {
                i++;
            } else if (arr[i] != arr[index]) {
                swap(arr, i, index);
            } else {
                i++;
            }
        }
    }
    static int mi(int[] arr) {
        int i = 0;
        while (i <= arr.length) {
            int index = i;
            if(i==arr.length)
            {
                return i;
            }
           else if (arr[i] == index) {
                i++;
            } else {
                return index;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first , int  second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

