package practice.generics.newPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass1 {

    public static <T> void iterateList(ArrayList<T> list)
    {
        Iterator<T>  iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
