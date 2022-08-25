package java8.examles;

import java.util.ArrayList;

public class Arraysa {

    public static void main(String[] args) {

        int p = 5;
        int r = 55;
        int x = 5;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = p; i <= r; i++) {
            if (i < 10) {
                if (i == x) {
                    list.add(i);
                }
            }
          int j =i;
            if (j >= 10) {
                int sum = 0;
                while (j > 0) {
                    sum = sum + j % 10;
                    j= j/ 10;
                }
                System.out.println(sum);
                if(sum==5)
                {
                    list.add(i);
                }

            }
        }
        System.out.println(list);
    }
}
