package stringarray.newPragrams;

import javax.swing.text.View;

public class VerifyIntegerString {
    public static void main(String[] args) {
        String s ="234534654s6";
        VerifyIntegerString v = new VerifyIntegerString();
        System.out.println(v.verifyStringInteger(s));

    }
    boolean verifyStringInteger(String str)
    {
        int i = 0;
        while (i != str.length())
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9') //  we put 0 and 9 as character not as value;
            {
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
