package dsabootcamp.practice;

public class EvenDigitsFind {
    public static void main(String[] args) {
        int[] arr= {437,315,322,431,686,264,442};
      int a =   findNumbers(arr);
        System.out.println(a);

    }
        public static int findNumbers(int[] nums) {

            int evenCount=0;
            for(int i = 0 ; i <nums.length;i++)
            {
                int a = nums[i];
                int temp = 0;
                while(a>0)
                {
                    a=a/10;
                    temp++;
                }
                if(temp%2==0)
                {
                    evenCount++;
                }

            }
            if(evenCount>0)
            {
                return evenCount;
            }
            return 0;
        }

}
