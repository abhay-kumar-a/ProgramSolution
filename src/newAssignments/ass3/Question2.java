package newAssignments.ass3;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Question2 {
    public static void main(String[] args) {
        TreeMap<String, String> country = new TreeMap<>();
        country.put("Japan" , "Tokyo");
        country.put("Jordan","Amman");
        country.put("Kazakhstan" ,"Nur-Sultan");
        country.put("Kenya","Nairobi");
        country.put("Kiribati" ,"Tarawa Atoll");
        country.put("Kosovo","Pristina");
        country.put("Kuwait","Kuwait City");
        country.put("Kyrgyzstan","Bishkek");
        country.put("Laos","Vientiane");
        country.put("Latvia","Riga");
        country.put("Lebanon","Beirut");
        country.put("Lesotho","Maseru");
        country.put("Liberia","Monrovia");
        country.put("Libya","Tripoli");
        country.put("Liechtenstein","Vaduz");
        country.put("Lithuania","Vilnius");
        country.put("Luxembourg","Luxembourg");
        country.put("Madagascar","Antananarivo");

        // 1. get the first (lowest) key and the last (highest) key currently in a map
        System.out.println(country.firstEntry().getKey());
        System.out.println(country.lastEntry().getKey());

        // 2. get a reverse order view of the keys contained in a given map
           Set treeMap1= country.descendingKeySet();
        System.out.println(treeMap1);
        // or
        TreeMap<String,String>  reverseOrder = new TreeMap<>(Collections.reverseOrder());
        for(String str : country.keySet())
        {
            reverseOrder.put(str , country.get(str));
        }

        System.out.println("Reverse Order of Map: \n" + reverseOrder);

        // 3. get a new map containing countries whose name begin with ‘L’

        TreeMap<String,String> newMap = new TreeMap<>();
        Iterator iterator = country.keySet().iterator();
        while (iterator.hasNext())
        {
            String str =(String)iterator.next();
            if((str.charAt(0)) == 'L')
            {
                newMap.put(str,country.get(str));
            }
        }
        //
        System.out.println("New map with country name which start with L");
        System.out.println(newMap);

        //4. to get a collection view of the values contained in this map and sort them in descending
        //order
        TreeMap<String,String>  reverseValue = new TreeMap<>(Collections.reverseOrder());
        for(String str : newMap.keySet())
        {
            reverseValue.put(str , newMap.get(str));
        }
     //
        System.out.println("\nReverse Order of Values \n");
        for(Map.Entry<String,String> entry : reverseValue.entrySet())
        {
            System.out.println(entry.getValue());
        }

  // 5. Convert the original map into a concurrent hash map
        System.out.println("\n ConcurrentMap \n");
        ConcurrentMap<String,String> concurrentMap = new ConcurrentHashMap<>(country);
        System.out.println(concurrentMap);
    }
}
