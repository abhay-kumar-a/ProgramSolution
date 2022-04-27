package practice.trickyQuestions;

public class Q4 {
    public static void main(String[] args) {

        long l =  1000*60*60*24*365L;
        System.out.println("Long val : "+ l);//  31536000000  // this is 35 bit in binary number  11101010111101100010010110000000000

        double d = 1000 * 60 * 60 * 24 * 365d;
        System.out.println("double val : "+ d); //3.1536E10

        int d1 =  1000 * 60 * 60 * 24 * 365;
        System.out.println( d1);  // 1471228928 ,  why , because int store only 4 byte means 32-bit binary number only
        //1471228928 // 1010111101100010010110000000000 //  31 bits

        //  for long 31536000000  // this is 35 bit in binary number  11101010111101100010010110000000000  // long store 64 bits
        // for int  java remove most significant 4 bits (means for left side from 35 bits which given in long  ) and then count remaining bits and show ans

        countDigits();
    }

    static void countDigits()
    {
        String s = "1010111101100010010110000000000";
        System.out.println("Digits : "+  s.length());
        for (int i = 0 ;i<s.length();i++)
        {
            System.out.println( s.charAt(i) + "  --  "+ (i+1) );
        }
    }
}
