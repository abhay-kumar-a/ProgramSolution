package dsabootcamp.binearsearch;

import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 2,2,1,1};
        int a = findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }
    static  int findDuplicate(int[] nums)
    {
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
            return nums[nums.length-1];
        }
        // find duplicate numbers;
        return nums[nums.length-1];
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

