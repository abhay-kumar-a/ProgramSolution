package dsabootcamp.binearsearch.practice.stringQuestion;

public class CapitalLetterFind {
    public static void main(String[] args)
    {
        String s = "AbhayKumar";
        CapitalFind(s);
        System.out.println((int)'A');
        System.out.println((int)'Z');
    }

    static void CapitalFind(String str)
    {
        int count = 0;
        String s = " ";
        for (int i = 0; i<str.length();i++)
        {
if( str.charAt(i)>=65 && str.charAt(i)<=90)
{
    count++;
    s = s+str.charAt(i);

}
        }
        System.out.print ("String is: "+ str);
        System.out.println("\ntotal number of capital letter are : "+ count);
        System.out.println("New String is : "+ s);
    }

}
