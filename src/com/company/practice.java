package com.company;

import javax.swing.*;
import java.util.Scanner;

public class practice {

    static int roll_number =10 ;
    static  String name="hey bro";
    static String college = "that's VSGOI";

    practice(int roll_number,String name,String college) {
        this.roll_number = roll_number;
        this.name = name;
        this.college = college;
    }
    public String toString()
    {
        return roll_number+" " + name + " "+ college;
    }
    void Hello()
    {
        System.out.println(roll_number + name +college);
    }


        public static void main(String[] args)
        {
//            System.out.println(roll_number);
//            System.out.println(name);
//            System.out.println(college);
            practice p = new practice(101,"ABHAY","VSGOI");
            System.out.println(p);
            Abhay a = new Abhay();
            p.Hello();
            a.m();

        }
}
class Abhay
{
    void m()
    {
        System.out.println("Okk man");
    }
}

