package stringarray;

class Practice
{
    public static void main(String[] args) {
        String s = "ABHAY";
        for(int  i = 0 ; i<s.length();i++)
        {
            System.out.println(( s.charAt(i)) + " : " + (int)s.charAt(i));
        }
    }
}