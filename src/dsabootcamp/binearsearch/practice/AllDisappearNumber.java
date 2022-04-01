package dsabootcamp.binearsearch.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDisappearNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,6,7,8};
        List<Integer> list = AllDisappearNoFind(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

    }
    static  List<Integer> AllDisappearNoFind(int[] arr )
    {
        int[] newq = {3,4,5};
        int i  = 0;
        while (i<arr.length)
        {
            int index = arr[i] -1;
            if(arr[i]!= arr[index])
            {
                swap(arr,i, index);
            }
            else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int index = 0;index<arr.length;index++)
        {
            if(arr[index]!= index+1)
            {
                list.add(index+1);
            }
        }
        return list;
    }
    static  void swap(int[ ]arr , int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
