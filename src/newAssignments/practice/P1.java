package newAssignments.practice;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<2;i++)
        {
            String qu = sc.next();
            if(qu.equals("Add One"))
            {
                System.out.println("In am added");
            }
            if(qu.equals("Remove One"))
            {
                System.out.println("I am removed");
            }
//            String s =  sc.nextLine();
//            System.out.println(s);
        }


//        String s1 =sc.nextLine();
//        System.out.println(s1);
    }
}
