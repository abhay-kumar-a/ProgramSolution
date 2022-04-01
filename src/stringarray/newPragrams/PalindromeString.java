package stringarray.newPragrams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// palindrome :  if a string equals to reverse of itself;   // like  Madam and reverse is madam also so its palindrome;
public class PalindromeString extends ReverseOfString{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string : ");
        String s =r.readLine();
        s=s.toLowerCase();
        PalindromeString p = new PalindromeString();
        RemoveSpacesFromString p1 = new RemoveSpacesFromString();

        String s2 = p1.removeSpace(s);
        p.checkPalindrome1(s2);
    }
    void checkPalindrome1(String str)
    {
        String s = reverseOfString(str);
        int length = lengthFind(str);
        int i = 0; int count = 0;
        while (i != length)
        {
            if(str.charAt(i) != s.charAt(i))
            {
                count ++;
                break;

            }
            i++;
        }
        if(count>0)
        {
            System.out.println("Not palindrome ");
        }
        else {
            System.out.println("Palindrome !");
        }
    }
    boolean checkPalindrome(String str)
    {
      String s =   reverseOfString(str);
      if(str.equals(s))
      {
          return true;
      }
        return false;
    }
}
