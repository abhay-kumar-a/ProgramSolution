package stringarray.newPragrams;

import java.io.IOException;

// problem is that
// 1. we did not have any null value at end of string
//  2. there is no any process to access individual character of string without using method called charAt();
public class CountLengthOfString {
    public static void main(String[] args) throws IOException {
String s = "Abhay";
CountLengthOfString c = new CountLengthOfString();
       int length =  c.lengthFind(s);
        System.out.println("Length of string is : "+ length);
        // using builtin method
        System.out.println("using built in function : "+s.length());
    }
    int lengthFind(String name)
    {
        //  take string and put null = '\0' at end of string
        String s = name.concat("\0");
        // convert string to array
        char[] arr = s.toCharArray();
        int i =0,count = 0;
        while ( arr[i] != '\0')
        {
            count++;
            i++;
        }
    return count;
    }
}

