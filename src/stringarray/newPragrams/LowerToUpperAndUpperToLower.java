package stringarray.newPragrams;

import java.util.Arrays;

public class LowerToUpperAndUpperToLower {
    public static void main(String[] args) {
        LowerToUpperAndUpperToLower l = new LowerToUpperAndUpperToLower();
//        System.out.println(l.lowerCaseToUppercase("abhay"));
       l.upperCaseToLowerCase("ABHAY KUMAR");
       l.firstLetterCapital("abhay kumar where are you going and why do you to make some essential topic like data structure not make any content");
       l.firstLetterLower("ABHAY KUMAR BHAI");
    }


    public String lowerCaseToUppercase(String str)
    {
        String Uppercase = "";
        int count =0;
        int i = 0;
        while(i!= str.length())
        {
            count= (int)(str.charAt(i)) - 32;
            Uppercase = Uppercase +(char)count;
            i++;
        }
        return Uppercase;
    }
    //
    public void upperCaseToLowerCase(String str)
    {
        char[] c = str.toCharArray();
        String lowerCase = "";
        int i =0;
        while (i != c.length)
        {
            if(c[i] != ' ')
            {
                c[i] =  (char)(c[i] +32);

            }
            lowerCase=lowerCase+c[i];
            i++;
        }
        /// also, can print in array;
        System.out.println("String is : "+ str);
//        System.out.println("Lower case: "+ c);
        System.out.println("Lower Case is : "+ lowerCase);
//        return upperCase;
    }

    public void firstLetterCapital(String str)
    {
        String letter = "";
        letter = letter+ (char)(str.charAt(0) - 32);
        int i =1;
        while (i!= str.length())
        {
            if(str.charAt(i) == ' ')
            {
                letter=letter+" ";
                letter=letter+(char)(str.charAt(i+1)-32);
                i++;
            }
            else {
                letter+=str.charAt(i);
            }
            i++;

        }
        System.out.println("String is : "+ str);
        System.out.println("String First letter is capital : "+ letter);
    }
    public void firstLetterLower(String str )
    {
        char[] c = str.toCharArray();
        String lowerFirstLetter = "";
        c[0] = (char) (c[0]+32);
        lowerFirstLetter+=c[0];
        int i = 1;
        while(i !=c.length)
        {
            if(c[i] == ' ')
            {
                c[i+1] = (char) (c[i+1] +32);
                lowerFirstLetter+= " "+c[i+1];
                i+=2;
            }
            lowerFirstLetter+= c[i];
            i++;

        }
        System.out.println(lowerFirstLetter);
    }
}
