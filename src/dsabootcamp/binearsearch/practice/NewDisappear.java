package dsabootcamp.binearsearch.practice;

import java.awt.datatransfer.ClipboardOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewDisappear {
    public static void main(String[] args) {
        int[] arr = {100};
        System.out.println("Array is : "+Arrays.toString(arr));
        List<Integer> list = newDis(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println("Disappear number are : " +list);
//        continueUse();


    }

static List<Integer> newDis(int[] arr)
{
    int max = maxFind(arr);
    List<Integer> list = new ArrayList<>();
    for(int  i= 1;i<=max;i++)
    {
        list.add(i);
    }
    List<Integer> newList = new ArrayList<>();
    for (int i = 0;i<arr.length;i++)
    {
        newList.add(arr[i]);
    }
    list.removeAll(newList);

     return list ;
}



    static void continueUse()
    {
        for(int i =0;i<10;i++)
        {
            if(i==5)
            {
                continue;
            }
            else {
                System.out.print(i+ " ");
            }
        }
    }

    static List<Integer> findDisappearNumber(int[] arr) {
     int max = maxFind(arr);
     List<Integer> list = new ArrayList<>();
        System.out.println(max);
     for (int i = 1;i<=max;i++)
     {
         for ( int  j = 0;j<arr.length;j++)
         {
             if(i == arr[j])
             {
                 continue;
             }
             else {
                 list.add(i);
             }
         }
     }
     return list;

    }
    static int maxFind(int[] arr)
    {
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max= arr[i];
            }
        }
        return max;
    }
}
