package newAssignments.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Integer> list  = new LinkedList<>();
        for(int i = 0;i<size;i++)
        {
            list.add(sc.nextInt());
        }

        int numberOfQuarries = sc.nextInt();
        for(int i =0; i<numberOfQuarries ;i++)
        {
            String operation = sc.next();
            if(operation.equals("Insert"))
            {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index,value);
            }
            if(operation.equals("Delete"))
            {
                int index1 = sc.nextInt();
                list.remove(index1);
            }
        }
        for(Integer in : list)
        {
            System.out.print(in+" ");
        }
    }
}
