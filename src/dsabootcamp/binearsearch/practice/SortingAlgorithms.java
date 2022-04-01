package dsabootcamp.binearsearch.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int [] arr = new int[]{3,2,1,4,5};
        System.out.println("Actual array : "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array By InsertionSort: " + Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Sorted Array By Cyclic sort: " + Arrays.toString(arr));

    }


    static void insertionSort(int [] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for (int j = 1+i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void cyclicSort(int[] arr)
    {
//        for(int i = 0;i<arr.length;i++)
//        {
//            int index = arr[i]- 1;
//            if(arr[i] != index)
//            {
//                swap(arr,i,index);
//            }
//        }
        int i =0;
        while (i<arr.length)
        {
            int index = arr[i]- 1;
            if(arr[i] != arr[index])
            {
                swap(arr,i,index);
            }
            i++;

        }
    }
    static  void swap(int[ ]arr , int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
