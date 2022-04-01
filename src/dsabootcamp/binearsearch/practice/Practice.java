package dsabootcamp.binearsearch.practice;

import javax.swing.text.StyledEditorKit;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2,7,7,8,8,8,9};
        System.out.println("Array is : "+ Arrays.toString(arr));
        ///bubble sort
        bubbleSort(arr);
        System.out.println("Array with BubbleSort sorted array : "+ Arrays.toString(arr));
        int target = 8;
        System.out.println("Target is : "+ target);
        // Normal Binary Search
        int a =binarySearch(arr,target);
        // BinarySearch with recursion
        int b = binarySearchWithRecursion(arr,0,arr.length-1,target);
        System.out.println("Position of target with recursion is : "+ b);
        System.out.println("Position of target is : "+ a);

        // Celling Number > the smallest number which is grater or equal to  target
        int cellingNumber  = FindCellingNumber(arr,target,0,arr.length-1);
        System.out.println("Celling Number is :"+ cellingNumber);
// FloorNumber_4 Means :   Greatest Number which is <= target
        // same like
        // find next graterElement form target ;
  int nextGraterNumber = FindNextGraterNumber(arr,target,0,arr.length-1);
        System.out.println("Next Grater Number is : "+ nextGraterNumber);

        // find start and end position of elements
        int [] startAndEnd = startAndEndPositionOfArray(arr,target);
        System.out.println("Start and end position of target: "+Arrays.toString(startAndEnd));


    }
    static  int binarySearch(int[] arr,int target)  // normal Binary Search
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else return mid;
        }
        return -1;  // -1 means target is not found
    }
    static int binarySearchWithRecursion(int[] arr, int start , int end ,int target ){ // BinarySearch with recursion
            int mid = start+(end-start)/2;
            while (start<=end)
            {
                if(target>arr[mid])
                {
                   return binarySearchWithRecursion(arr,mid+1,end, target);
                }
                else if(target<arr[mid])
                {
                   return binarySearchWithRecursion(arr,start,mid-1,target);
                }
                else return mid;
            }
            return -1;
    }
    static void bubbleSort(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = 1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }

            }
        }
    }

    static int FindCellingNumber(int[] arr , int target , int start,  int end)
    {
       int mid=  start+(end-start)/2;
        while (start<=end)
        {
            if(target>arr[mid])
            {
                return FindCellingNumber(arr,target,mid+1,end);
            }
            else if(target<arr[mid])
            {
                return FindCellingNumber(arr,target,start,mid-1);
            }
            else
            {
                return arr[mid];
            }
        }
        return arr[start];
    }
    static int FindNextGraterNumber(int[] arr , int t,  int s , int e)
    {
       while (s<=e)
       {
           int m = s+(e-s)/2;
           if(t<arr[m])
               return FindNextGraterNumber(arr, t,s,m-1);
           else
               return FindNextGraterNumber(arr,t,m+1,e);
       }
        return arr[s%arr.length];  // here formula is used for next value
    }

    /// start and end position of the array
    static int[] startAndEndPositionOfArray(int[] arr , int  target)
    {
        int[] ans ={-1,-1};
        // call Function from find position of target elements
        ans[0] = findPositionOfTargetElements(arr , target , true);
        ans[1] = findPositionOfTargetElements(arr,target,false);
        return ans;
    }
    static int findPositionOfTargetElements(int[] arr ,  int target , boolean FirstPositionOccurence)
    {
        int ans = -1;
        int start  = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else {
                ans = mid;
                if(FirstPositionOccurence)
                {
                    end=mid-1;
                }
                else {
                    start= mid+1;
                }
            }
        }
        return ans;
    }


    static  void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}
