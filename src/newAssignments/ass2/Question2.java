package newAssignments.ass2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  // take number of pairs from users
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {   // storing pairs into pair_left and pair_right
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> set = new HashSet<>();  // using HashMap to store unique data.
        for (int j = 0; j < t; j++) {
            set.add(pair_left[j] + " " + pair_right[j]); // add data into hashMap
            // print unique pairs
            System.out.println(set.size()); // and according to the unique data present in the hashMap , it will give size // that output
        }
    }
}