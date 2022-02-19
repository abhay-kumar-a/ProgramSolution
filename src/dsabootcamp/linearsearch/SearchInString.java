package dsabootcamp.linearsearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {

      String s = "Abhay";
      int  l = s.length();
      char target = 'm';
      int temp=0;
       char[] m = s.toCharArray();
       System.out.println(Arrays.toString(m));
       for(int i = 0 ; i<l; i++)
       {
          if(target==s.charAt(i))
          {
              temp++;
              System.out.println("Element '"+ target + "' is find at position : "+i);
          }
       }
       if(temp>0){}
       else {
           System.out.println("Element not found");
       }
    }
}
