package dsabootcamp.sortingalgorithms.questions;

import java.util.Arrays;

public class AllDisappearNumber2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] a = allDisappear(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
    }

    public static int[] allDisappear(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swap(arr, i, index);
            } else {
                i++;
            }
        }
//        just finding missing number
        int[] index = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (j+1 != arr[j]) {
                index[j] = j+1;
            }
        }
        return index ;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}