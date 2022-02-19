package dsabootcamp.binearsearch;

public class PeakIndexInMountainArray_8 {
    public static void main(String[] args) {
        int[] arr = {3,5,2,3,0};
        System.out.println(PeakArrayInMountainArray(arr));
    }
    public static int PeakArrayInMountainArray(int[] arr)
    {
        if(arr.length<3)
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int  mid = start+(end-start)/2;
            int target = arr[mid];
            if(target<arr[mid-1])
            {
                end  = mid-1;
            }
            else if(target<arr[mid+1])
            {
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
