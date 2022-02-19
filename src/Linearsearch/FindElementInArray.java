package Linearsearch;

import java.util.Arrays;

public class FindElementInArray {
    public static void main(String[] args) {

        int[] a = { 1 ,3,4,5,6,5};

        int targetElement = 5;
        int m = LinearSearch(a,targetElement);
        System.out.println(m);

        System.out.println(Arrays.toString(a));
    }

    static  int LinearSearch(int[] a,int targetElement)
    {
        for(int i= 0;i<a.length;i++)
        {
            if(targetElement==a[i])
            {
                return i;
            }
        }
        return -1;
    }

}
