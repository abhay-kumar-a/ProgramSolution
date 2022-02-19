package dsabootcamp.bitwiseoperators;

import java.lang.reflect.Array;

public class Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println("Binary no: ");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println();
        System.out.println("Results: ");
        //And
        System.out.println("And : " +  (a&b));
        //Or
        System.out.println("OR : " + (a|b));
        //XOR
        System.out.println("XOR : " + (a^b));
        //leftShift
        System.out.println("LeftSift : "+ (a<<1));
        //rightShift
        System.out.println("RightShift : "+ (b>>1));

    }
}
