package recursion;

import java.util.*;

public class A3 {
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
        int[] arr = new int[arrayList.size()];
        for(int i = 0 ;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i) +"     :   " +   (arrayList.get(i).length()-1));

        }
    }
}
