package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
//        String[] a = new String[]{"abhay","kumar"};
//        System.out.println(Arrays.toString(a));
//        String[] s = {"abhay","kumar"};
//        System.out.println(s.charAt(0));
        String[] b = new String[7] ;
        for (int i = 0;i<b.length-3;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String");
            b[i]=sc.nextLine();
        }
        b[4]="Abhay";
        b[5]="Abhayp";
        b[6]="Abhaybk";
        System.out.println();
        System.out.println(Arrays.toString(b));

//        System.out.println(Arrays.toString(s));
    }
}
