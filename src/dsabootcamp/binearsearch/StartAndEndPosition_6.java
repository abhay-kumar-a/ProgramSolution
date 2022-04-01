package dsabootcamp.binearsearch;

import java.util.Arrays;

public class StartAndEndPosition_6 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,10};
        int target  = 8;
        System.out.println(Arrays.toString(FirstAndLastPosition(arr,target)));
    }
    public static int[]  FirstAndLastPosition(int[] a, int target )
    {
        int[] ans = {-1,-1};
        ans[0] = FirstAndLastPosition(a,target,true);  // time complexity  log(n)
        ans[1] = FirstAndLastPosition(a,target,false); // time complexity  log(n)
        return ans;
    }
    // creating function that returns start and position
    public static int FirstAndLastPosition(int[] arr , int target, boolean FirstOccurrencePosition)
    {
        int ans = -1;
        int start  = 0;
        int end  = arr.length-1;
        while (start<=end)
        {
            int mid  = start+(end-start)/2;
            if(target<arr[mid])
            {
                end = mid-1;
            }
            else if(target>arr[mid])
            {
                start = mid+1;
            }
            else {
                // when got potential ans (mid value)
                ans= mid;
                // when got midValue, it might be possible that first Occurrence will be in leftSide
                // if left side then...   end = mid-1;  then apply condition over here that
                if(FirstOccurrencePosition) // meas it is true
                {
                    end = mid-1;
                }
                else {
                    start = mid+1; // for go in right side
                }
            }
        }
        return ans;
    }
}
