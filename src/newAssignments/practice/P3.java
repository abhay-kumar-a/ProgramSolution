package newAssignments.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

            Set<String> set = new HashSet<>();
            for(int j =0 ; j < t ; j++)
            {
                set.add(pair_left[j]+ " "+ pair_right[j]);
                // print unique pairs
                System.out.println(set.size());
            }


//Write your code here

        }
    }
