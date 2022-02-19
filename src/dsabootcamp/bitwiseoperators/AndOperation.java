package dsabootcamp.bitwiseoperators;

import java.util.Scanner;

public class AndOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=9;
        int b=4;

        System.out.println(a&b);

        System.out.println(11010&1);
        System.out.println(11010^1);
    }
}
