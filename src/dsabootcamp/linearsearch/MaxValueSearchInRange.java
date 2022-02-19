package dsabootcamp.linearsearch;

public class MaxValueSearchInRange {
    public static void main(String[] args) {
        int[] arr= {8,7,6,5,4,3,};
        int max = MaxValueSearchInRanges(arr,0,4);
        System.out.println("Max Value is: "+ max);
        int min= MinValueSearchInRanges(arr,0,4);
        System.out.println("Min Value is :"+ min);
    }
    static int  MaxValueSearchInRanges(int[] arr , int start, int end)
    {
        int max=arr[start];
        for(int  i = start;i<=end;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int MinValueSearchInRanges(int[] arr, int start,int end)
    {
        int min = arr[start];
        for(int i =start;i<=end;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }

}
