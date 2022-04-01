package stringarray.newPragrams;

public class RemoveSpacesFromString extends PalindromeString{
    public static void main(String[] args)  {
        String s =  "too hot to hoot";
        RemoveSpacesFromString p = new RemoveSpacesFromString();
       String p1 =  p.replaceMethod(s);
        System.out.println(p1);
        System.out.println("Check palindrome: ");
        p.checkPalindrome1(p1);

    }
    String removeSpace (String str)
    {
        int length = lengthFind(str);
        int i= 0;
        String newString = "";
        while( i != length)
        {
            if(str.charAt(i) != ' ')
            {
                newString += str.charAt(i);
            }
            i++;
        }
        return newString;
    }
    // are we can also use inbuilt method
    String replaceMethod(String str)
    {
         str = str.replace(" ", "");
        return str;
    }
}
