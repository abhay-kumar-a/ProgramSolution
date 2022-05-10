package projects.student_management_system;

import java.util.Scanner;

public class StudentDatabaseApplication {
    public static void main(String[] args) {
        // Ask how  many new student we want to add
        System.out.println("Enter number of new Student to enroll");
        Scanner sc = new Scanner(System.in);
        int numOfStudent = sc.nextInt();
        Student[] students = new Student[numOfStudent];

        // Create n number of new student
        for(int n = 0; n<numOfStudent;n++)
        {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
          //  System.out.println(students[n].showInfo());
        }
        for (int n = 0;n<numOfStudent;n++)
        {
            System.out.println(students[n].showInfo());
        }
//        System.out.println(students[0].showInfo());
//        System.out.println(students[1].showInfo());
//      //  System.out.println(students[2].showInfo());

    }
}
