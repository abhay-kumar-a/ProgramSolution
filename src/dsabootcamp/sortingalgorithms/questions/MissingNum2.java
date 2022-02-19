package dsabootcamp.sortingalgorithms.questions;

import java.util.Arrays;

public class MissingNum2 {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int index =  missingNumber(arr);
        System.out.println(index);

    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i];
            if (arr[i] <arr.length && arr[i] != arr[index]) {
                swap(arr, i, index);
            } else {
                i++;
            }
        }
        // case 1
        // for find index of missing number
        for(int index = 0 ; index < arr.length; index++)
        {
            if(arr[index] != index){
                return index;
            }
        }
        //case 2
        return arr.length;
    }
    static void swap(int[] arr, int first , int  second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
