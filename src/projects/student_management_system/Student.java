package projects.student_management_system;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String latName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance =0;
    private static int costOfCourse =600;
    private static  int id = 1000;

    // Constructor : prompt user to enter student's name and year
    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name : ");
        this.latName = sc.nextLine();

        System.out.println("1 - First_year\n2 - Second_Year\n3 - Third_year\n4 -  Fourth_year\nEnter student Year level : ");
        this.gradeYear=sc.nextInt();

        setStudentID();

        System.out.println(firstName+ " "+ latName+ " "+ gradeYear + " "+ studentID);

       // enroll();

    }

    // Generate an ID.
    private void setStudentID()
    {
        // Grade Level + ID
        id++;
        this.studentID=gradeYear +""+id;
    }

    // Enroll in courses
    public void enroll()
    {
        // get inside a loop, user hits 0;
       do {
             System.out.println("Please enter courses to enroll (Q to quit): ");
             Scanner sc = new Scanner(System.in);
             String  course = sc.nextLine();
             if(!course.equals("Q")) {
                courses = courses +"\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
           }
             else {break;}
           }while (1 !=0);
           System.out.println("ENROLLED IN: " + courses);
          // System.out.println("TUITION BALANCE : "+ tuitionBalance);
    }
    // View balance
    public  void  viewBalance()
    {
        System.out.println("Your balance is : " + tuitionBalance);
    }

    // pay Tuition
    public void  payTuition()
    {
        viewBalance();
        System.out.println("Please Enter your payment:  ");
        Scanner sc  = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance -payment;
        System.out.println("Thanks you for your payment of : "+ payment);
        viewBalance();
    }
    // Show status
    public String showInfo()
    {
        return "\nStudent Details"+ "\nName : " + firstName+ " "+ latName+
                "\nGrade level : "+ gradeYear+
                "\nStudent ID : "+ studentID+
                 "\nCourses Enrolled: "+ courses+
                "\nBalance: "+ tuitionBalance;
    }
}
