package dsabootcamp.collection.arrayList;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3,5,7,54,3,3,5,65));  //  Format to add list in arrayList
//        ArrayList<Integer> arr2 = (ArrayList<Integer>) Arrays.asList(1,34,657,5,63,5,234,235);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Ruby");
        arrayList.add("Ruby");
        arrayList.add("C++");
        arrayList.add("C language");
        arrayList.add("JavaScript");
        arrayList.add("java");

        System.out.println("Using typical for loop-----------");
        // using typical for loop
        for(int i = 0; i< arr1.size() ;i++)
        {
            System.out.println(arrayList.get(i));
        }

        System.out.println("\nUsing Iterator ------------\n");
// iterate the list using iterator
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Using for each loop--------------------------");
        for(String str : arrayList)
        {
            System.out.println(str);
        }

        System.out.println("Using steam classes --------------------------------");
        arrayList.stream().forEach(e -> System.out.println(e));

        System.out.println("Using another type of  stream stream class -----------------------------------");
        arrayList.forEach(System.out::println);
        arrayList.forEach( e  -> System.out.println(e));

    }
}
