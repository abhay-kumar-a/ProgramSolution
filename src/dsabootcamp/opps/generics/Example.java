package dsabootcamp.opps.generics;
//  Note : Here see we use a separate method for printing any primitives array
// so for solve these problems , use generics , in generics we make only one function and print any dataTypes of arrays
// use of generics , code will be flexible, optimized  and lines will be reduced (see in GenericSolutionOfExample)

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        // Primitives data types  are
        int[] a = {4, 5, 6, 7};
        float[] f = {3.4f, 56.9f, 76.2f, 56.6f};
        char[] c = {'4', 'r', '5', 'y'};
        System.out.println(Arrays.toString(a));

        //calling PrintArray Function
        // here for print any primitive array  it overLoaded  PrintArray method
        PrintArray(a);
        System.out.println();
        PrintArray(f);
        System.out.println();
        PrintArray(c);
    }
    // use for integer
    static void PrintArray(int[] arr){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print (arr[i]+ " ");
        }
    }
    // use for float
    static void PrintArray(float[] arr){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print (arr[i]+ " ");
        }
    }
    // use for char
    static void PrintArray(char[] arr){
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print (arr[i]+ " ");
        }
    }
}
