package dsabootcamp.opps;

import patterns.P;

import java.util.Arrays;

public class Practice {
    String message = " Hello World"; // non-static context
    public static void display(Practice practice) // passing instance of class
    {
        System.out.println(practice.message);
//        System.out.println(message);
    }
    public void Hello()
    {
        System.out.println(message);
    }

    public static void main(String[] args) {
//        String s = "Hello Man,atul:hello";
//        s=s.replaceAll("," ," ");
//        char[] a = s.toCharArray();
//        System.out.println(Arrays.toString(a));
        Practice p = new Practice();

        display(p);
        p.Hello();


    }
}
