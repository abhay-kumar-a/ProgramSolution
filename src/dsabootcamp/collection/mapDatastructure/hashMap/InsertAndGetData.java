package dsabootcamp.collection.mapDatastructure.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class InsertAndGetData {
    public static void main(String[] args) {
        HashMap<Character , Integer>  map = new HashMap<>();
        int i =65;
        for( char ch = 'A'; ch<='Z';ch++)
        {
            map.put(ch , i);
                    i++;
        }
        System.out.println(map.get('B'));
        System.out.println(map);//{A=65, B=66, C=67, D=68, E=69, F=70, G=71, H=72, I=73, J=74, K=75, L=76, M=77, N=78, O=79, P=80, Q=81, R=82, S=83, T=84, U=85, V=86, W=87, X=88, Y=89, Z=90}

        // for get key
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

        // iterator
        Iterator<Character>  iterator=  map.keySet().iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Iterator<Integer> iterator1 = map.values().iterator();
        while(iterator1.hasNext())
        {
            System.out.print(iterator1.next()+ " ");
        }

        //method calls over her
        System.out.println("Method call over here : -----------------------------------------------------");
        String str = "Intelligence Man Always behaves like a intelligence guys";
        str = str.replaceAll(" ","");
        insetElement(str);

    }
    static void insetElement(String str)
    {
        char[] c = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c1 : c)
        {
            if(map.containsKey(c1))
            {
                map.put(c1,map.get(c1)+1);
            }
            else {
                map.put(c1,1);
            }
        }

        // print int key and value format
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }
    }
}
