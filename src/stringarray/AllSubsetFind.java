package stringarray;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;
public class AllSubsetFind {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter String: ");
        String s =sc.nextLine();
        int temp = 0;
        int l = s.length();
        int n = l*(l+1)/2;

        System.out.print("Possible subStrings are: "+n);

        String[] arr = new String[n];
        for(int i = 0;i<l;i++)
        {
            for (int j = i ;j<l;j++)
            {
                arr[temp] = s.substring(i,j+1);
                temp++;
            }
        }
        System.out.println();
        System.out.println("Given String : "+s);
        System.out.println("SubStrings Are: "+Arrays.toString(arr));

    }
}
