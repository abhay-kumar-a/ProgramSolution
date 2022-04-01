package dsabootcamp.collection.mapDatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PutAndGetValueInMap {
    public static void main(String[] args) {
        String data = "ARADHAY";
        PutAndGetValueInMap p =new PutAndGetValueInMap();
    }
    void getAndPutsChar(String str)
    {
        char[] c = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i != c.length)
        {
            if(!map.containsKey(c[i]))
            {
                map.put(c[i] , 1);
            }
            else {
                int oldVal = map.get(c[i]);
                int newVal = oldVal+1;
                map.put(c[i],newVal);
            }
            i++;
        }
     //    for getting key and value from map

//        Set<Map.Entry<Character,Integer>> hmap = new map.entrySet();
//        for(Map.Entry<Character,Integer> d: map.entrySet())
//        {
//            System.out.println(d.getKey() + " --- " + d.getValue());
//        }

    }
}
