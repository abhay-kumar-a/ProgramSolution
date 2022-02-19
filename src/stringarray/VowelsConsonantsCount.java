package stringarray;

import java.util.Locale;

public class VowelsConsonantsCount {
    public static void main(String[] args) {
        int countV=0;
        int countC=0;
        for(int i = 65;i<'Z'+1;i++)
        {
            System.out.print((char)i+" ");
        }
        String s = "A B C D E F G H I J K L M N O AllDisappearNumber2 Q R S T U V W X Y Z ";
        s=s.toLowerCase();
        for (int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o' ||s.charAt(i)=='u')
            {
                countV++;
            }
            else if(s.charAt(i)>'a' && s.charAt(i)<'z')
            {
                countC++;
            }

        }
        System.out.println(" ");
        System.out.println("Constants present in given String is: "+countC);
        System.out.println("Vowels present in given String is: "+countV);
    }
}
