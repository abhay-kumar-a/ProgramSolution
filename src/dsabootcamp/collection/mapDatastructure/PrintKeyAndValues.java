package dsabootcamp.collection.mapDatastructure;
import java.util.HashMap;
import java.util.Map;


public class PrintKeyAndValues {
    public static void main(String[] args) {
String s = "AbhayKumar";
//getKeyAndValue(s);
PrintKeyAndValues p = new PrintKeyAndValues();
p.getKeyAndValueForLoop(s);
    }
     static void  getKeyAndValue(String str)
     {
         str= str.toLowerCase();
         char[] arr = str.toCharArray();
         Map<Character, Integer> map = new HashMap<>();
         // apply for each loop to get and put value in hashMap
         for( char c :arr)
         {
             if(map.containsKey(c))
             {
                 System.out.println(map.get(c));
                 map.put(c,map.get(c)+1);
             }
             else {
                 map.put(c,1);
             }
         }


         // for access data from map
         // also apply for each loop;
         for( Map.Entry entry  : map.entrySet())
         {
             System.out.println(entry.getKey() + " " + entry.getValue() );
         }
     }
     void getKeyAndValueForLoop(String str)
     {
         Map<Character,Integer> map = new HashMap<>();
         for (int i = 0 ;i<str.length();i++)
         {
             char c = str.charAt(i);

             if(map.containsKey(c))
             {
                 map.put(c,map.get(c)+ 1);
             }
             else {
                 map.put(c,1);
             }
         }
         // for loop for assess data from HashMap;
         for (Map.Entry  entry : map.entrySet())
         {
             System.out.println(entry.getKey() + " " + entry.getValue());
         }
     }

    }

