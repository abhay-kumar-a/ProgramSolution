package practice;

import java.util.Arrays;

public class P15 {
    public static void main(String[] args) {
        int a = 6;
        Integer m =Integer.valueOf(a);
        System.out.println(m);

        Integer m1 = 45;
        int b= m1.intValue();
        System.out.println(b);
        int s =56;
        String str = String.valueOf(s);
        System.out.println(str.toCharArray());
        char c ='8';
        System.out.println((Integer.parseInt(String.valueOf(c))));
    }
}
