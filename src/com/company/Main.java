package com.company;

public class Main {
    public static void main(String[] f) {
        String ch = "Developer";
        char c = 'm';
        boolean b =aBoolean(ch, c);
        System.out.println(b);

    }

    public static boolean aBoolean(String s, char c) {
      for(int i = 0 ; i< s.length() ; i++)
      {
          if (s.charAt(i) == c)
          {
              return true;
          }
      }
      return  false;

    }


}





