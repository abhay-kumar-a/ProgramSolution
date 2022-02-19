package stringarray;

public class PunctuationFind {
    public static void main(String[] args) {
        int count = 0;
        String s = "Hello;bro,how.are'\\',you-";

        for(int i = 0 ;i<s.length();i++)
        {
            if(s.charAt(i)==';' || s.charAt(i)== ',' || s.charAt(i)=='.'|| s.charAt(i)=='\\' || s.charAt(i)=='-')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
