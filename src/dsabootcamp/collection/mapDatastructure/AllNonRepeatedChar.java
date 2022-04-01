package dsabootcamp.collection.mapDatastructure;

import dsabootcamp.opps.interfaces.nested.A;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AllNonRepeatedChar {
    public static void main(String[] args) {
String str ="SILLYSPIDERS";
AllNonRepeatedChar a = new AllNonRepeatedChar();
a.getAllNonRepeatedCharacter(str);
    }

    void getAllNonRepeatedCharacter(String str)
    {
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
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
        // print all non repeated char....
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println(entry.getKey() +" " + entry.getValue());
            }
        }
    }
}
