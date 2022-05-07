package dsabootcamp.collection.mapDatastructure;

import dsabootcamp.practice.BufferReaders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;


public class FindStringUnique {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string : ");
        String str = r.readLine();
        StringBuilder b = new StringBuilder();
        FindStringUnique f = new FindStringUnique();
        f.checkStringUnique(str);
    }

    void checkStringUnique(String str)
    {
        str =str.toLowerCase();
        char[] arr = str.toCharArray();
        HashMap<Character ,Integer> map  = new LinkedHashMap<>();
        for(char c : arr )
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
//        int mapSize = map.size();
//        System.out.println("MAp size Is : "+ mapSize);
//        int length = str.length();
//        System.out.println("String size: "+ length);
//        if(mapSize !=length) {
//            System.out.println("String is not unique...");
//        }
//        else {
//            System.out.println("String is unique....");
//        }
        // check string all char is unique are not
        int count=0;
        for (HashMap.Entry<Character,Integer> entry : map.entrySet())
        {
//            System.out.println(entry.getKey() + " "+ entry.getValue());
            if(entry.getValue()>1)
            {
                count++;
                System.out.println("String does unique ....");
                System.exit(0);
//                return;
            }
        }
        System.out.println("String is unique...");

    }
}
