package dsabootcamp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExpectedSumPairsFind {
    public static void main(String[] args) {
        int[] arr1 = {1,3,1,1,4,};
        System.out.println("First array: "+ Arrays.toString(arr1));

        selectionSort(arr1);
//        System.out.println(Arrays.toString(arr1));
        int[] newArr1 = removeDuplicate(arr1);
        int[] arr2 = {4,4,2,4,1};
        System.out.println("Second array: "+ Arrays.toString(arr2));

        selectionSort(arr2);
        int[] newArr2 = removeDuplicate(arr2);
        //find expected sum
        int ExpectedSum = 5;
        findPairsOfExpectedSum(newArr1,newArr2,ExpectedSum);

//        int[] arr2=  removeDuplicate(arr1);
//        System.out.println("removed array duplicates "+ Arrays.toString(arr2));
    }

    static void findPairsOfExpectedSum(int[] arr1,  int[] arr2, int expectedSum)
    {

        System.out.println("Expected Sum is : "+ expectedSum);
        System.out.println("\nResult pairs are  : ");
          for(int i =0;i<arr1.length;i++)
          {
              for(int j =0; j<arr2.length;j++)
              {
                  if(arr1[i] + arr2[j] == expectedSum)
                  {
                      System.out.println("(" + arr1[i] +","+arr2[j]+")");
                  }
              }
          }
    }
    static int[]  removeDuplicate(int[] arr) {
        int count = 0;
        ArrayList arr1 = new ArrayList();
        for (int i = 0; i < arr.length; ) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            arr1.add(arr[i]);
//            System.out.println(arr[i] + " is : " + count); // it will print all existing adjacent duplicate value
            i = i + count;
        }
//        System.out.println(new ArrayList());

        // copy data of arrayList in array
        int[] arr2 = new int[arr1.size()];
        for(int i = 0;i<arr2.length;i++)
        {
            arr2[i] = (int)arr1.get(i);
        }
        return arr2;
    }

    static void selectionSort(int[] arr)
    {
        for(int i= 0;i<arr.length;i++)
        {
            int lastIndex = arr.length-1-i;
            int maxValueIndex= getMaxValueIndex(arr,0,lastIndex);
            swap(arr,maxValueIndex,lastIndex);
        }
    }
    static int getMaxValueIndex(int[] arr,int start,int end)
    {
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[i] >arr[max])
            {
                max=i;
            }
        }
        return max;
    }
    static  void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}