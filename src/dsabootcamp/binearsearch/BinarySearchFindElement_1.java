package dsabootcamp.binearsearch;
// binary search work with sorted array it will be ascending  or descending order
// It search element and return element position
public class BinarySearchFindElement_1 {
    public static void main(String[] args) {
        int[] arr = {-34,-11,-3,-1,0,2,4,5,6,8,9,11,34};
        int target = -1;
        System.out.println(BinarySearchMethod(arr,target));
    }
    static  int BinarySearchMethod(int[] arr,int target)
    {
        int start =0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid  = start+(end-start)/2;
            if(target>arr[mid]) // go left side
            {
                start = mid+1;
            }
            else if(target<arr[mid])// go right side
            {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
