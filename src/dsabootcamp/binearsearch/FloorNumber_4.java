package dsabootcamp.binearsearch;
// FloorNumber_4 Means :   Greatest Number which is <= target ,
public class FloorNumber_4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 65;
        System.out.println("Floor Number is : "+ FloorNumberFind(arr,target));
    }
    public static int FloorNumberFind(int[] arr ,int target)
    {
        int start  = 0 ;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<arr[mid])
            {
                end = mid -1;
            }
            else if(target>arr[mid])
            {
                start =mid +1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
