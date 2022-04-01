package dsabootcamp.sortingalgorithms.questions;
// find all missing number
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDisappearNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Actual array: "+ Arrays.toString(arr));
        List<Integer> ans = allDisappearNumber(arr);
        System.out.println("Sorted array : " +Arrays.toString(arr));
        System.out.println(ans);
    }


    public static List<Integer> allDisappearNumber(int[] arr)
    {
        int i = 0;
        while (i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[i] != arr[index])
            {
                swap(arr,i , index);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
//        just finding missing number
        for( int j = 0 ; j<arr.length;j++)
        {
            if(j != arr[j]-1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first , int  second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
