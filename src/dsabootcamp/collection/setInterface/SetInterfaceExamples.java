package dsabootcamp.collection.setInterface;

import java.util.*;

public class SetInterfaceExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();  // , here we can class like HashSet, LikedHashSet , TreeSet
        boolean b = set.add(34);
        set.add(3);
        set.add(1);
        set.add(6);
        boolean b1 = set.add(43);
        boolean b12 = set.add(46);
        boolean b13 = set.add(47);
        boolean b2 = set.add(34);
        System.out.println("Set element is : " + set);

        System.out.println("Iterator element of set using Iterator Interface");
        Iterator<Integer> r = set.iterator();
        while (r.hasNext()) {
            Integer m = r.next();
            System.out.print(m + " ");
        }
        System.out.println("\n");
        System.out.println("Iterate element of set using for each loop..");
        for (Object ob : set) {
            System.out.print(ob + " ");
        }
        // contains method
        System.out.println("\n" + set.contains(4));
        System.out.println(set.contains(34));

        // set created like this
        Set<Integer> set1 = new HashSet<>();   // iterate element at any random position....
        Set<Integer> set2 = new LinkedHashSet<>();  //  iterate element in sequence ,in which we insert the element.
        Set<String> set3 = new TreeSet<>(); //  iterate element in sorted increase( ascending order) order.
        set1.add(3);
        set1.add(0);
        set1.add(33);
        set1.add(34);
        set1.add(1);
        set1.add(7);
        set1.remove(7);

        System.out.println("Element of set1 are : " + set1);
        // set.of method  // it is used to make unmodifiable (immutable ) Set instance....
      //  he Java Set static factory methods are called of() and take either zero or more parameters. Here is first an example of creating an empty, immutable Set using Set.of() :

        Set set4 = Set.of();   // with zero parameter
        Set<String> set5 = Set.<String>of(); //  provide as a generic type...
       Set<String>  set6 = Set.<String>of("Val1" ,"Val2" , "Val3");
        System.out.println("Element of set6 is : "+ set6);  // same behave like a hashSet..






    }
}
