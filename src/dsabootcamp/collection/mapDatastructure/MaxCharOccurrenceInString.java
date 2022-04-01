package dsabootcamp.collection.mapDatastructure;

import dsabootcamp.linearsearch.MaxValueSearchInRange;
import dsabootcamp.opps.packages.a.Hello;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxCharOccurrenceInString {
    public static void main(String[] args) {

        String str = "bbbcccaa";
        MaxCharOccurrenceInString m = new MaxCharOccurrenceInString();
        m.getMaxOccurrenceOfCharacterInString(str);
    }
    void  getMaxOccurrenceOfCharacterInString(String str)
    {
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        for( char c : arr)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println("All Key and Value: ");
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
        //
        int maxValue =0 ;
        char MaxKey = ' ';
        System.out.println("Max Occurrence of character in String : ");
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()> maxValue)
            {
                maxValue = entry.getValue();
                MaxKey = entry.getKey();
            }
        }
        System.out.println(MaxKey + " " + maxValue );
        // if two are more character have same occurrence.....
        System.out.println("All char key and value which have same max occurrence");
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == maxValue)
            {
                System.out.println(entry.getKey() + " "+ entry.getValue());
            }
        }
    }
}
