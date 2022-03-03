package practice;

import java.util.Scanner;

//8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
//<pre>
//Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail
public class GradePrint {
    public static void main(String[] args) {
        int ex;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks out of 100 : ");
            int marks = sc.nextInt();
            System.out.println("Grade is : " + findGrade(marks));
            System.out.println("Do you want to continue?1.Yes 2.No");
             ex = sc.nextInt();
        }
        while (ex==1);


    }
    static String findGrade(int number)
    {
        if (number>=91 && number <= 100) {
            return "AA";
        }
        else if(number>=81 && number<=90)
        {
            return "AB";
        }
        else if(number>=71 && number<=80)
        {
            return "BB";
        }
        else if(number>=61 && number<=70)
        {
            return "BC";
        }
        else if(number>=51 && number<=60)
        {
            return "CD";
        }
        else if(number>=41 && number<=50)
        {
            return "DD";
        }
        else {
            return "Fail";
        }

    }

}
