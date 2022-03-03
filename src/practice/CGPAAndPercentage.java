package practice;

import java.util.Scanner;

public class CGPAAndPercentage {
    public static void main(String[] args) {
        int number = 5;
        int[] arr = { 90, 80, 80, 80, 90 };
        double cgpa = CGPACalculate(arr,number);
        System.out.println("cgpa of given Number is : " + cgpa);
        System.out.printf("Percentage of Given Number is: %.2f",cgpa*9.5); /// for format
        System.out.println();
        // also use for format
        System.out.println("in different format :  "+ String.format("%.2f",cgpa*9.5));
    }

    static double CGPACalculate(int[] arr ,  int number)
    {
        double cgpa = 0;
        int[] grade = new int[number];
        int sum = 0;
        for( int i=0;i<arr.length;i++)
        {
            grade[i] = arr[i]/10;
        }
        for(int j =0;j<number;j++)
        {
            sum += grade[j];
        }
        cgpa = (double) sum/number;
        return cgpa;
    }

}
