package dsabootcamp.sortingalgorithms.questions;

import java.util.Arrays;

public class MissMatchNumber {
    public static void main(String[] args) {
        int[] arr = {1,3, 3};

        int[] a=  findErrorNums(arr);
        System.out.println(Arrays.toString(a));

    }

    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int index = nums[i]-1;
            if(nums[index] != nums[i])
            {
                swap(nums,index,i);
            }
            else {
                i++;
            }
        }

        int[] error = new int[2];
        for(int j = 0 ;j <nums.length; j++)
        {
            if(nums[j] != j+1)

            {
                error[0] = nums[j];
                error[1] = j+1;

            }
        }
        return error;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
