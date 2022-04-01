package dsabootcamp.collection.mapDatastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        FirstNonRepeatedChar r = new FirstNonRepeatedChar();
        String str = "SILLYSPIDER";
        System.out.println("length are : " +str.length());
        r.getFirstNotRepeatedChar(str);
    }
    void getFirstNotRepeatedChar (String str)
    {
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c : arr)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        // find all key and value...
        System.out.println("All Key and values Are.....");
        for(Map.Entry<Character,Integer> entry  : map.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        /// print first non_repeated char
        System.out.println("First Non_repeated character: ");
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() ==1)
            {
                System.out.println(entry.getKey() + " " + entry.getValue());
                System.exit(0);  //  it is also use for // exit loop..
//                return;  // also can use over here...
            }
        }
        System.out.println(map.size());
     }
}
