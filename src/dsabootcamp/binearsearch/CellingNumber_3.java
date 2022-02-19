package dsabootcamp.binearsearch;

import java.util.Arrays;

// Celling numbers means : - the smallest number that is grater and equal than Target (means (the smallest number)num>=target)
public class CellingNumber_3 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        System.out.println("Index of given number in the array:  "+ Arrays.asList(arr).indexOf(target));
        System.out.println("Celling Number is : " + BinarySearch(arr,target));
    }
    public static int BinarySearch(Integer[] arr,int target )
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end -start)/2;
            if(target<arr[mid])
            {
                end = mid -1;
            }
            else if(target>arr[mid])
            {
                start = mid +1;
            }
            else {
                return arr[mid];
            }
        }
        System.out.println(start);
        System.out.println(end);
        return arr[start];
    }
}
