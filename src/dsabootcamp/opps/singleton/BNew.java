package dsabootcamp.opps.singleton;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BNew {
    public static void main(String[] args) {

        String s = "434256";
        int[] arr = new int[s.length()];

    for(int i = 0;i<s.length();i++)
    {
        arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
    }


    String suma="";
    int start  = 0;
    int end = arr.length-1;
        System.out.println(end);
        while(start<=end)
        {
            int sum = arr[start]+arr[end];
            suma = suma+sum;
            start++;
            end--;

        }
        System.out.println(suma);

        System.out.println(Arrays.toString(arr));

    }
}
