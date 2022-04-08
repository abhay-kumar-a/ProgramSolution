package dsabootcamp.collection.listInterface;

import java.util.*;

public class MethodInList {
    public static void main(String[] args) {
        List<Object>list = new ArrayList<>();
         for(int i = 12; i< 20;i++)
         {
             list.add(i);
         }
         list.add(3);
         list.add(6);
         list.add("AbhayKUmar");
         // insert null value in list : it will be added in string as well as integer
        list.add(null);

//         list.clear();
//         list.add(34);

        list.add(2,4);
        System.out.println("Size of length: "+ list.size());
        System.out.println("Values are");
        Iterator<Object> iterator  = list.iterator();
         while (iterator.hasNext())
         {
             System.out.print(iterator.next()+" ");
         }
         // traverse by for each loop
        System.out.println("\nValues Are with fro each loop: ");
        for(Object  r : list)
        {
            System.out.print(r+" ");
        }

        // insert all element from one list to another list ....
        System.out.println("\nNew List Created ...");
        List<Object> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(4);
        list1.add(34);
        list1.add(37);
        list1.add(3);
        list1.add(2);
        list1.addAll(list);
        list1.add("I am Smart Engineer");
        System.out.println("New List is : "+ list1);
        // get element from list
        System.out.println("Elements are using get method of new List");
        for(int i = 0;i<list1.size();i++)
        {
            System.out.print(list1.get(i)+", ");  // get method used over here...
        }
        // sort List by Collection.sort() method..
//        Collections.sort(list1);  /// collection only ok with generics <T> , not with object <Object>
//        System.out.println("\nNow string is sorted : "+ list1);
        // find index of any element;
        int index  = list1.indexOf(3);
        System.out.println("\nIndex of 3 is : "+ index);

        // remove element using index
        list1.remove(2);
        // remove element of list by values
        // first get index of element and remove that.
        list1.remove(list1.indexOf(4));
        System.out.println("List is After remove element : "+ list1);

        // retainAll() method in java list:   // it is a boolean type  so return true or false
        System.out.println("list using retain  : "+ list.retainAll(list1));   // return false  //list1.retainAll(list)  // then return ture....

        // sublist method in java list interface
        List<String> list2 = new ArrayList<>();
        list2.add("Abhay");
        list2.add("Vineet");
        list2.add("Aniket");
        list2.add("Rajan");
        System.out.println("Element of list 3 : ");
        for(String i : list2)
        {
            System.out.print(i+ ", ");
        }
        Collections.sort(list2);
        System.out.println("\nSorted List is : " + list2);
        List<String> subList = list2.subList(0,3);  // work like a sub string....
        System.out.println("Sublist list : "+ subList);

        /// conversion
        System.out.println("\n\n!!CONVERSION\n");

        System.out.println("List to array");
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(3);
        list3.add(2);
        list3.add(1);
        System.out.println("List Is : "  + list3 );
       Object[] objects = list3.toArray();
        System.out.println("New object type Array is : "+ Arrays.toString(objects));
        // also, can store i specific array :
        Integer[] arr = list3.toArray( new Integer[0]);     // for string, it will be (new String[0]) // same cycle for other rapper classes....
        System.out.println("New Integer type of array : " + Arrays.toString(arr));

        //convert Array to list ;
        System.out.println("\n\n Array to list : \n");
        String[] strings = new String[] {"ABHAY", "RAJAN","VINEET","HELLO"};
        System.out.println("String Array is : "+ Arrays.toString(strings));

        // conversion
        List<String> list4 =  Arrays.asList(strings);  // also, can type cast :  List<String> list4 = (List<String>)Arrays.asList(strings);
        System.out.println("List 4 is : "+ list4);

// conversion of list to set;
        System.out.println("\n\n List to set\n");
        List<Character> list5 = new Stack<>();  // here use can use as class , Like ArrayList , Vector , Stack< LinkedList:
        list5.add('A');
        list5.add('Z');
        list5.add('B');
        list5.add('K');
        System.out.println("List 5 is :  "+ list5);
//        Collections.sort(list5);
//        System.out.println("sorted List 5 is : " + list5);

        Set<Character> set = new HashSet<>();  // class can be HashSet , LinkedHashSet,TreeSet
        set.addAll(list5);
        System.out.println("Set element is by using list interface :  "+ set);

        /// isEmpty() method it is of boolean type:
        System.out.println("Check list is empty or not : "+ list5.isEmpty());
        // making empty list
        List<Integer> list6 = new Stack<>();
        System.out.println("Check list is empty or not : "+ list6.isEmpty());


//        SortedSet<Character> sortedSet = new TreeSet<>();
//        set.addAll(set);
//        System.out.println("Sorted set element is by take element from list : "+ sortedSet);  // can't store element in it ,



    }
}
