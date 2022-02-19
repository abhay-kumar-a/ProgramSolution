package dsabootcamp.binearsearch;
import java.util.*;
class New1{
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,4,7};

         Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
                                      
//[0 ,1, 2, 4, 5, 7]
         for(int i =0;i<arr.length;i++)
         {
             if(arr[i]!=i)
             {
                 System.out.println(i);
             }
         }
    }
}

