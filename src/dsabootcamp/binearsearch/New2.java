package dsabootcamp.binearsearch;

import java.util.Arrays;
import java.util.Locale;

//public class New2 {
//    public static void main(String[] args) {
//        String s= "I love my india";
////        System.out.println(rever(s));
//        String[] str = s.split(" ");
//        System.out.println(Arrays.toString(str));
//        for(int i = 0;i<s.length()-1;i++)
//        {
//            char ch;
//            String add=" ";
//            for(int j = 0;j<str[i].length();j++)
//            {
//                ch = str[i].charAt(j) ;
//                add = ch+add;
//
//            }
//            System.out.println(add);
//        }
//
//    }
////    public static String rever(String str)
////    {
////        String world[] = str.split("\\s");
////        String re="";
////        for(String w:world)
////        {
////            StringBuilder sb = new StringBuilder(w);
////            sb.reverse();
////            re = re+sb.toString()+" ";
////        }
////        return re.trim();
////    }
//}

// Java program for the above approach
class New2 {
    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str)
    {

        // Create an array of size 256
        // i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];

        int len = str.length();

        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(
                        "Number of Occurrence of "
                                + str.charAt(i)
                                + " is:" + count[str.charAt(i)]);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "good";
        getOccuringChar(str);
    }
}
