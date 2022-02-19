package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String m = s+ " ";
        ArrayList<String > arrayList = new ArrayList<>();
        int count=0;
        int start = 0;
        for(int i = 0; i< m.length(); i++)
        {
            if(m.charAt(i) == ' ')
            {
                count=i+1;
                arrayList.add(m.substring(start,count));
                start=count;
            }
        }
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            System.out.print(arrayList.get(i));
        }
    }
}
