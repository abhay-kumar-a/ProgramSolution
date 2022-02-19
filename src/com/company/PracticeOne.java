package com.company;

import java.util.Arrays;

class  PracticeOne
{
    public static void main(String[] args) {
        char[] a = {'a','b','c'};
        char[] b = {'a','b','c'};
        System.out.println(Arrays.equals(a,b));

        char m ='a';
        char n ='a';
        System.out.println(m==n);

        String s ="Hello";
        String t = "Hello";
        System.out.println(s==t);

        String[] o = {"Abhay"};
        String[] p = {"Abhay"};
        System.out.println(o==p);
        System.out.println(o.equals(p));
        System.out.println(Arrays.equals(o,p));

    }
}