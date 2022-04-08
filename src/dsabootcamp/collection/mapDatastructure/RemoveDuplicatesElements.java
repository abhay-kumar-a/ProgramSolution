package dsabootcamp.collection.mapDatastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesElements {
    public static void main(String[] args) {
        String str = "SILLYSPIDER";
        removeDuplicates(str);
    }
    static void removeDuplicates(String str)
    {
        char[]  arr = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : arr) {
            if (map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        // remove  all repeated char..........
        String s ="";
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            s =s+entry.getKey(); // just all key from map because key always unique in map and store it into string
        }
        System.out.println("Unique string is: "+ s);
    }
}
