package dsabootcamp.recursion.questions;

public class Practice {
    public static void main(String[] args) {
      int a = 1234;
      String str= String.valueOf(a);
      int a1 =Integer.parseInt(str);
        System.out.println(a1);
     int  i =0;
     int sum=0;
      while (i !=str.length())
      {
          sum = sum+Integer.parseInt(String.valueOf(str.charAt(i)));
          i++;
      }
        System.out.println(sum);
    }

}
