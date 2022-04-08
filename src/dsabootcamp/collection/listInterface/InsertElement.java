package dsabootcamp.collection.listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InsertElement {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        boolean b = l.add(4);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(4);
        l.add(5);
        // delete list element with help of value
        Integer a = l.indexOf(3);
        l.remove(a);
        System.out.println(l.get(4));
        // call iterator for iterate the method
        System.out.println("Elements present in list are by iterator  : ");
        Iterator iterator = l.iterator();
        while (iterator.hasNext()){
            Object b1 = iterator.next();
            System.out.println(b1);
        }
        System.out.println(l);
        System.out.println("Traverse element preset in list by for each loop");
        for (Integer  r : l)
        {
            System.out.println(r);
        }

    }
}
