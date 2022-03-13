package dsabootcamp.practice;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(arr.length);
        System.out.println("Array is : \n"+ Arrays.toString(arr));
        System.out.println("Missing Number is : " +missingNumberFind(arr));
     }
    static int missingNumberFind(int[] arr) // for 1 to n array
    {
       int ans = 0;
       int sum =0;
       int  n = arr.length;
       int lastNumber = arr[n-1];
       // find sum of natural number
        int naturalNumberSum =lastNumber*(lastNumber+1)/2;
        // traversing  whole array
        for (int i = 0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }

        ans = naturalNumberSum-sum;
        if(ans>=0 && ans<arr.length)
        {
            return ans;  // return find missing number
        }
        else return arr.length; // if missing number is not found in array then return length

    }
    static int missingNumberWithBinarySearch(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int index = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[index]) // here formation is mandatory // ignore  (no == nums.length),
                {
                    swap(arr, i, index);
                } else {
                    i++;
                }
            }
            //case 1 : for finding missing no.
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;  // here index will be the missing no.
                }
            }
            // case 2 : if missing no. not find in array then array length will be the answer;
            return arr.length;
    }
    public static void swap(int[] nums ,int first, int second)
        {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
}
