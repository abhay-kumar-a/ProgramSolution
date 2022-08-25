package newAssignments.ass3;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        HashMap<String , String> country = new HashMap<>();
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

        // 1. Size of keys and values
        System.out.println("Size of key : "+ country.keySet().size() );
        System.out.println("Size of value : "+ country.values().size() );
        // size of map
        System.out.println("Size of map : "+ country.size());

        // 2. get a shallow copy of a HashMap instance

        HashMap<String , String> shallowCopy =  (HashMap<String, String>) country.clone(); // using the object clone we get the shallow copy on one object ito another object

        // 3.  create a set view of the mappings contained in a map 
        Set<String> set = new HashSet<>();
        // using for loop add all keyValue mapping in set
        for (Map.Entry<String, String> entry: shallowCopy.entrySet())
        {
            set.add(entry.getKey()+"="+ entry.getValue());
        }
        System.out.println("set 1\n"+ set);
        System.out.println();

        // or we can use entrySet()method
        Set set1 = country.entrySet();
        System.out.println(set1);

        // 4 to get a collection view of the values contained in this map
        System.out.println(country.values());
        // 5. convert the above map into a tree map having country and capital as keys and values
        //respectively

        TreeMap<String, String> treeMap = new TreeMap<>(country);
        // use iterator  to get key and values.
         Iterator<String> iterator=treeMap.keySet().iterator();
         while (iterator.hasNext())
         {
             String key = iterator.next();
             String values = country.get(key);
             System.out.println(key+" " + values);
         }
    }
}
