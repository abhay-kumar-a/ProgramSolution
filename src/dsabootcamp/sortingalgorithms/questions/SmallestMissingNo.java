package dsabootcamp.sortingalgorithms.questions;

import java.util.Arrays;

public class SmallestMissingNo {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 11, 12};
        firstMissingPositive(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i <nums.length)
        {
            int index = nums[i]-1;
            if(index >=0 &&  nums[index] != nums[i])
            {
                swap(nums,index,i);
            }
            else {
                i++;
            }
        }
    return i;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
