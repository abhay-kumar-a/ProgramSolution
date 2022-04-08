package dsabootcamp.collection.mapDatastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindAllDuplicateChar {
    public static void main(String[] args) {
     FindAllDuplicateChar f = new FindAllDuplicateChar();
     String str = "abhbccdttmmmmmmmmmmmmay";
     f.findDuplicates(str);
    }
    void findDuplicates(String str)
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
        // get all repeated char..........
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
                          if(entry.getValue() > 1)
                          {
                              System.out.println(entry.getKey() + " " + entry.getValue());
                          }
        }
    }

}
