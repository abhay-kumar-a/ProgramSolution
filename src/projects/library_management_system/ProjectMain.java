package projects.library_management_system;

import java.util.Scanner;

public class ProjectMain {
    public static void main(String[] args) {
        char r;
        do {
            System.out.println("------------------------------Library Management System---------------------------");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue a Book");
            System.out.println("Press 3 to  return a Book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");

            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter any Number : ");
            int num = obj1.nextInt();
            switch (num) {
                case 1: {
                    Library r1 = new Library();
                    r1.addBook();
                    break;
                }
                case 2: {
                    Library r2 = new Library();
                    r2.issueBook();
                    break;
                }
                case 3: {
                    Library r3 = new Library();
                    r3.returnBook();
                    break;
                }
                case 4: {
                    Library r4 = new Library();
                    r4.detail();
                    break;
                }
                case 5: {
                    Library r5 = new Library();
                    r5.exit();
                    break;
                }
                default: {
                    System.out.println("Invalid Number :  ");
                }
            }
            System.out.println("You want to select next Option Y/N");
            r = obj1.next().charAt(0);
        }
        while (r == 'Y' || r == 'y') ;
            if (r == 'n' || r == 'N') {
                Library call = new Library();
                call.exit();
            }
        }
}
