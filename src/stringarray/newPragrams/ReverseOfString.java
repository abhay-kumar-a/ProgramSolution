package stringarray.newPragrams;

import java.io.IOException;

public class ReverseOfString extends CountLengthOfString {
    public static void main(String[] args) throws IOException {
        ReverseOfString r = new ReverseOfString();
        String s = "ABC tech";
        System.out.println("String is : "+ s);
        System.out.println("reverse string is : "+ r.reverseOfString(s));
    }
    String reverseOfString(String str)
    {
        char[] a= str.toCharArray();
        int length = lengthFind(str);
        String s ="";
        int i  =length-1;
        while (i>=0)
        {
            s = s+a[i];
            i--;
        }

        return s;
    }
}
