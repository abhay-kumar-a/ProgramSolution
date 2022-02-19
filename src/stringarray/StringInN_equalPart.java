package stringarray;
import java.util.Scanner;
import java.util.Arrays;

public class StringInN_equalPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s =sc.nextLine();
        int l = s.length();
        int n =3;
        int c = l/n;
        int temp = 0;
        String[] mn = new String[n];
        if(l%n!=0)
        {
            System.out.println("Sorry for that given string is not" +n+ " equal part.");
        }
        else {
            for(int i = 0; i<l;i=i+c)
            {
                String part = s.substring(i,i+c);
                mn[temp] = part;
                temp++;
            }
            for(int j = 0;j<n;j++)
            {
                System.out.println(mn[j]);
            }
    }
    }
}
