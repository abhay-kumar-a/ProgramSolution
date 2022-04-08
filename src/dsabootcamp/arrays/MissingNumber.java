package dsabootcamp.arrays;
// missing number for 1 to n array and , no, any duplicate available
public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {0,1,3,5};
        int a = missingNumber3(arr);
        System.out.println(a);
//        System.out.println(arr.length);
    }
    static int missingNumber(int[] arr)  // for 1 to n array   // wrong
    {
        for( int i = 0;i<arr.length-1;i++)
        {
            int index = i+1;
            if(arr[i]!=index)
            {
                return  index;
            }
        }
        if(arr[arr.length-1]!=arr.length)  // use for last element , because in for loop will iterate only length-1 times
        {
            return arr.length;
        }
        return -1;
    }
    static int missingNumber2(int[] arr)  // for 0 to n array  // wrong
    {
        for( int i = 0;i<arr.length;i++)
        {
            if(arr[i]!= i)
            {
                return i;
            }
        }
//        if(arr[arr.length-1]!=arr.length-1)
//        {
//            return arr.length;
//        }
        return -1;
    }
    // brute force solution using two for loop
    static  int missingNumber3(int[] arr)  // right...
    {
        int i,found=0;
         for( i = 0;i<=arr.length;i++)   // use for index
         {
             found = 0;
             for(int j = 0;j<arr.length;j++)  // use for value...
             {
                 if(arr[j] == i)
                 {
                     found = 1;
                 }
             }
             if(found==0) // means !found;
             {
                 return i;
             }
         }
         return -1;
    }
}
