package patterns;

import java.util.*;

public class prac1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        ArrayList<String > arrayList = new ArrayList<>();

        for(int i = 0 ; i<n;i++)
        {
            if (n <= s.length()) {
                arrayList.add(s.substring(i,n));
                n++;

            }

        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size()-1));
    }
}