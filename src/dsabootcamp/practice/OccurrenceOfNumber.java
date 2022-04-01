package dsabootcamp.practice;

import java.util.Arrays;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,4,5,5,5,6,6};
        int[] arr1={10,1,456,543,3,4,9,2,1,4,7};
        System.out.println("Actual is: \n"+Arrays.toString(arr1));
        OccurrenceFind(arr1);
    }
    static void OccurrenceFind(int[] arr)
    {
        int count =1;
//        Arrays.sort(arr);
        sortArray(arr);
        System.out.println("MaxCharOccurrenceInString : \n"+ Arrays.toString(arr));
        for(int i = 0;i<arr.length;)
        {
            count=1;
            for(int j = i;j<arr.length-1;j++){
                if(arr[i]==arr[j+1])
                {
                    count++;
                }
            }
            System.out.println(arr[i]+"-------"+count);
            i=i+count;
        }
    }

    static void sortArray(int[] arr)  // used Bubble sort for sort array
    {
        for (int i = 0;i<arr.length-1;i++)
        {
            for(int j= 1;j<arr.length-i;j++)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int start,int end)
    {
        int temp= arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }

}
