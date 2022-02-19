package dsabootcamp.binearsearch;

import java.util.Arrays;
// all duplicate or triplicates in array
public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 4, 3,6,6};
//        int i=0;
//        int count = arr[i];
        Find(arr);
    }
        static void Find(int[] arr)
        {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<arr.length-1;i++)
        {
            int count=1;
             for(int j = i+1;j<arr.length;j++) {
                 if (arr[i] == arr[j]) {
                     count++;
                 } else {
                     break;
                 }
             }
             if(count>1)
             {
                 System.out.println(arr[i]+" >> "+ count);
                 i+=(count-1);
             }

        }

    }
}
// output
//[3, 3, 3, 4, 4, 4, 6, 6]
//        3 >> 3
//        4 >> 3
//        6 >> 2