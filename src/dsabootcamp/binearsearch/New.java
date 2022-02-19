package dsabootcamp.binearsearch;

import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        String s = "xyz";
//        for(int i  =0; i<4;i++)
//        {
//            if(i<3)
//            {
//
//                for (int j = i; j <= i; j++) {
//                    System.out.println(s.charAt(j));
//                }
//
//            }
//            else {
//                i=i+(i-3)-1;
//            }
//            }
        String str = "I love my india";
        String[] arr = str.split("\\s");
        System.out.println(Arrays.toString(arr));
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
