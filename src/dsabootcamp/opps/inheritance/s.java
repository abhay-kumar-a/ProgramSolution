package dsabootcamp.opps.inheritance;

public class s {
    public static void main(String[] args) {
        String  a = " ";
        String  b = "xyz";
        char[] c1= new char[a.length()];
        char[] c2= new char[b.length()];
        for(int i = 0 ;i<a.length();i++)
        {
          c1[i] =a.charAt(i);
        }
        for(int i = 0 ;i<b.length();i++)
        {
             c2[i] =b.charAt(i);
//            System.out.println(c);
        }

    for (int i =0;i<b.length() || i<a.length();i++)
    {
        System.out.println(String.valueOf(c1[i])+String.valueOf(c2[i]));
    }
    }
}
