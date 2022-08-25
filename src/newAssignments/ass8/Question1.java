package newAssignments.ass8;
import java.util.*;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {

        Person p1 = new Person("Abhay",1);
        Person p2 = new Person("Aniket",2);
        Person p3 = new Person("Anshika",1);
        Person p4 = new Person("Anuj",3);
        Person p5 = new Person("Ankur",3);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
    //1.  ( i.) Write a program that extracts all persons (students), grouped by
      //  GroupName and then prints them on the console.

        Map<Integer,List<Person>> mapList = personList.stream().collect(Collectors.groupingBy(o ->o.getGroup()));
        Iterator<Integer> iterator = mapList.keySet().iterator();
        while (iterator.hasNext())
        {
            Integer key = iterator.next();
            List<Person> value = mapList.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("--------------------------------------------------------------------------------------");

       /* 1.  (ii.) Print all group names along with the students in each group. Use the
        group by Stream operations. You will be given an input on the console.
                Output format : {group} - {name1}, {name2}, {name3}, ... */

        Map<Integer,List<String>> listMap =  personList.stream().
                collect(Collectors.groupingBy(o -> o.getGroup() , Collectors.mapping(o1 -> o1.getName(),Collectors.toList())));
        Iterator<Integer> iterator1 = listMap.keySet().iterator();
        while (iterator1.hasNext())
        {
            Integer key = iterator1.next();
            List<String > value = listMap.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("--------------------------------------------------------------------------------");
      /*  2. Write a program using stream api that returns the average of a list of
        following integers,
        [100,60,32,98,154] */

        List<Integer> list = Arrays.asList(100,60,32,98,154);
       // average of list
        Long aLong =list.stream().reduce(0,(o2, o3) -> o2+o3) / list.stream().count() ;
        System.out.println(aLong);


        System.out.println("-----------------------------------------------------------------");
        /*
        3. For the following list of list of integers create and print the flattened stream.
        [ [10,344,658,966], [340,67,233,109], [404,501,200,201] ]
        */

        List<Integer> list1 = Arrays.asList(10,344,658,966);
        List<Integer> list2 = Arrays.asList(340,67,233,109);
        List<Integer> list3 = Arrays.asList(404,501,200,201);

        List<List<Integer>> listOfList= new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);
        List<Integer> collectElements =  listOfList.stream().flatMap(innerLists -> innerLists.stream()).collect(Collectors.toList());
        System.out.println(collectElements);
    }
}
