package dsabootcamp.binearsearch;

public class practice {
    public static void main(String[] args) {
        int[] arr= {1,2,5,4,7};
        int a = missingNumber(arr);
        System.out.println(a);

    }
    public  static int missingNumber(int[] nums) {
            int i =0;
//            int[] arr = new int[nums.length];
            while(i<nums.length)
            {
                int index = nums[i];
                if(nums[i]< nums.length && nums[i] != nums[index]) // here formation is mandatory // ignore  (no == nums.length),
                {
                    swap(nums, i, index);
                }
                else{
                    i++;
                }
            }
            //case 1 : for finding missing no.
            for(int index = 1; index < nums.length ; index++)
            {
                if(nums[index] != index)
                {
                    return index;  // here index will be the missing no.
                }
            }
            // case 2 : if missing no. not find in array then array length will be the answer;
            return nums.length;

        }
        public static void swap(int[] nums ,int first, int second)
        {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
