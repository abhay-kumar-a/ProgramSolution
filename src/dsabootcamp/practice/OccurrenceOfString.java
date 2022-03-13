package dsabootcamp.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OccurrenceOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String name = r.readLine();
//        System.out.println(Arrays.toString(name));
//        char[] stringArr = name.toCharArray();
//        int[] newArray = new int[stringArr.length];
//        for(int i = 0;i<newArray.length;i++)
//        {
//            newArray[i] = (int)stringArr[i];
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(stringArr));
//        System.out.println((int)stringArr[0]);
//        StringOccurrenceFind(stringArr);
        stringToArray(name);
    }

    static void stringToArray(String name)
    {
        char[] charA=name.toCharArray();
        System.out.println(Arrays.toString(charA));

        int[] arrNew = new int[charA.length];
        for(int i = 0;i<arrNew.length;i++)
        {
            arrNew[i] =charA[i];
        }
        System.out.println(Arrays.toString(arrNew));
        StringOccurrenceFind(arrNew);
    }
    static void StringOccurrenceFind(int[] arr)
    {
        int count =1;
        BubbleSortForSortCharArray(arr);
        System.out.println("call is Occurrence Find : \n"+ Arrays.toString(arr));
        for(int i = 0;i<arr.length;)
        {
            count=1;
            for(int j = i;j<arr.length-1;j++){
                if(arr[i]==arr[j+1])
                {
                    count++;
                }
            }
            System.out.println((char) arr[i]+"-------"+count);
            i=i+count;
        }
    }

    static void BubbleSortForSortCharArray(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = 1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}
