package dsabootcamp.binearsearch.practice.stringQuestion;

import dsabootcamp.arrays.ArrayLists;
import dsabootcamp.practice.OccurrenceOfString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstNonRepeatedCharacter  extends New{
    public static void main(String[] args) {
        String s = "Hello";
        OccurrenceOfString s1 = new OccurrenceOfString();

        New n = new New();
        n.HelloMan();

    }

}
class New {
    int name = 2;
    static int num =9;

    void HelloMan()
    {
        System.out.println("Num is : "+ (6+2));
        stringSort("abhay");
    }




    static void stringSort(String str) {
        ///  insertion sort;
        String s = "";
        char[] newArray = str.toCharArray();
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (newArray[j] < newArray[j - 1]) {
                    swap(newArray, j, j - 1);
                }
            }
        }
        for (int i = 0;i<newArray.length;i++)
        {
            s=s+newArray[i];
        }
        System.out.println("String is : "+ s);
        System.out.println(Arrays.toString(newArray));
    }
        static void swap(char[] str ,  int start , int end)
        {
            char temp = str[start] ;
            str[start]=str[end];
            str[end] = temp;
        }

    static void firstNonRepeatedCharacter(String str)
    {
        int count = 0;
        int value = 0;
        String s = "";

        for (int i =0;i<str.length();i++)
        {
            for (int j = 1 ; j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count ++;
                }
                else {
                    value++;
                    System.out.println(str.charAt(i));
                    s = s+str.charAt(i);
                    break;
                }
            }
        }
        if(value>0)
        {
            System.out.println("vir: "+s);
        }
    }
}
