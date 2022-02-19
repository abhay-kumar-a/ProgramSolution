package Linearsearch;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = new int[2][];
        int s[][] =new int[2][4];

        int b[][] =    {{ 2,3,4,4},
                    {3,4,6,9}};

        int c[][] = {{2,4,5,7},
                    { 3,8,5,6}};
//        System.out.println(b.length);
//        System.out.println(c.length);

       for(int i = 0 ; i<b.length;i++)
       {
//           System.out.println(Arrays.toString(b[i]));
       }

       for(int row = 0;row<b.length;row++)
       {
           for(int column= 0;column<b[row].length;column++)
           {
               System.out.print(b[row][column]+" ");
           }
           System.out.println();
       }
        System.out.println();
       for(int row =0;row <c.length;row++)
       {
           for(int column =0;column<c[row].length;column++)
           {
               System.out.print(c[row][column]+" ");
           }
           System.out.println();
       }
        System.out.println("Sum of given two string : ");

       for(int  row = 0; row < b.length; row++)
       {
           for(int column = 0;column<c.length;column++)
           {
               s[row][column] = b[row][column]+c[row][column];
           }

       }

       for(int i = 0 ;i<s.length;i++)
       {
           System.out.println(Arrays.toString(s[i]));
       }




    }

}
