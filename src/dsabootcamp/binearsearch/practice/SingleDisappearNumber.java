package dsabootcamp.binearsearch.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
//  array always given  1 to n or 0 to n;
public class SingleDisappearNumber {
    public static void main(String[] args) {
        int[]arr = {3,0,1};
        System.out.println("Original array: "+ Arrays.toString(arr));
        int a = disappearNumber(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
        System.out.println("Number is : "+ a);

    }
    static int disappearNumber(int[] arr)
    {
        int i = 0;
      while (i<arr.length)
      {
          int index =arr[i];
          if(arr[i]<arr.length && arr[i] != arr[index])   // here use ar[i]<arr.length , because arr is start 0 to n;
          {
              swap(arr, i , index);
          }
          i++;
      }

      // find disappear number
        for(int  j = 0;j<arr.length;j++)
        {
//            int index = arr[j];
            if(arr[j] != j ){
                return j;
            }
        }
        return arr.length;
    }
    static  void swap(int[ ]arr , int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
