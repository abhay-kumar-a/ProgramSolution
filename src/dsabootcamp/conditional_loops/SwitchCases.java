package dsabootcamp.conditional_loops;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Id : ");
        int empId = sc.nextInt();
        System.out.println("Enter Department  ");
        String department = sc.next();
        System.out.println(department);
        System.out.println("Check for nextLine Input : ");
        String nextLine = sc.nextLine();
        System.out.println(nextLine);
//        switch (empId) {                 /// java switchCase
//            case 1 -> System.out.println(empId + " Abhay");
//            case 2 -> System.out.println(empId + " Vivek");
//            case 3 -> System.out.println(empId+ " Vineet");
//        }
        switch (empId)
        {
            case 1 :
                System.out.println( empId+ " Abhay");
                break;
            case 2:
                System.out.println(empId+ " Vivek");
                switch (department) {                        //nested switchCases
                    case "IT" -> System.out.println("IT Department ");
                    case "Electric" -> System.out.println("Electric Department");
                    default -> System.out.println("Default always print");
                }
                break;
            case 3:
                System.out.println(empId+ " Vineet ");
                break;
            default:
                System.out.println("Always Print default for First ");

        }
    }
}
