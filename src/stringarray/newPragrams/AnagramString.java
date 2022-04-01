package stringarray.newPragrams;

import patterns.P;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

// anagram is s word or phases formed by rearranging in different word or phases;
// example  s1 = Humm , and s2 = mmhu ,  then s1 and s2 are anagram;
public class AnagramString {
    public static void main(String[] args) {
        String s = "Abhay";
        String s1 = "Yabha";
        //replacing spaces
        s = s.replace(" ","");
        s1 = s1.replace(" ","");

        // convert in lower case
        s =s.toLowerCase();
        s1=s1.toLowerCase();

        // convert string to array
        char[] c1= s.toCharArray();
        char[] c2 = s1.toCharArray();
        // sort both string
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean result = Arrays.equals(c1, c2);
        if(result)
        {
            System.out.println("Anagram !");
        }
        else {
            System.out.println("! Not Anagram");
        }
    }
    }

