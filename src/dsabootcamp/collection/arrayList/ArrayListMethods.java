package dsabootcamp.collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {


        ArrayList<Integer> arrayList =  new ArrayList<>(Arrays.asList(345,5646,5,45,3,542,34));
     //   arrayList.forEach(System.out::println); // method reference use over here
        ArrayList<String>arrayList1 = new ArrayList<>(Arrays.asList("Abhay" , "Vivek"  , "Rajan" , "Vineet"));

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Hello", "Intelligence"));

        // add method
        arrayList1.addAll(arrayList1);
        System.out.println(arrayList1);  // all element added in arrayList1
        // also can at any particular index
        arrayList2.addAll( 1,arrayList1);  // add at index =1 ;
        System.out.println(arrayList2);

        // clear method

        arrayList1.clear();
        System.out.println(arrayList1);  // it shows empty array [];

        // clone method to copy of array in another array ...  clone it object method so type casting is mandatory
        ArrayList<String> arrayList3 =  (ArrayList<String>) arrayList2.clone();
        System.out.println(arrayList3);// [Hello, Abhay, Vivek, Rajan, Vineet, Abhay, Vivek, Rajan, Vineet, Intelligence]
        arrayList3.add("Vivek");

        /// contains methods  // to check element present is list or not
        System.out.println(arrayList3.contains("Hello")); // true
        System.out.println(arrayList3.contains("Ignore"));// false

        // indexOf method  // return index of any element
        System.out.println(arrayList3.indexOf("Hello")); // 0
        System.out.println(arrayList3.indexOf("Vivek")); // 2
        System.out.println(arrayList3.indexOf("Vi"));  // if element not present so return -1;

        // lastIndexOf ()  return only last Index //
        System.out.println(arrayList3.lastIndexOf("Vivek"));//10
        System.out.println(arrayList3.lastIndexOf("Abhay"));  // 5

        ///remove method
        System.out.println(arrayList3.remove(1));  // Abhay is removed from arrayList3;
        // removeIf() method // it is of boolean we give lambda expression over here;
        System.out.println("removeIf method -------------------------------------------------------------");
        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(arrayList4);
        System.out.println(arrayList4.removeIf( n -> n%2==1)); // true
        System.out.println(arrayList4); // printed even number

        //
        ArrayList<String> str = new ArrayList<>(Arrays.asList("Predicate" , "super", "Collection","Collector","Supplier"," BiConsumer"));
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);//[ BiConsumer, Collection, Collector, Predicate, Supplier, super]
        Collections.reverse(str);
        System.out.println(str); //[super, Supplier, Predicate, Collector, Collection,  BiConsumer]









    }
}
