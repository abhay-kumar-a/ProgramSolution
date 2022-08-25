package newAssignments.streamAPI;

import newAssignments.ass9.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1L, "Ram", "29", 10000L);
        Employee employee2 = new Employee(2L, "Sam", "23", 20000L);
        Employee employee3 = new Employee(3L, "Rakesh", "28", 30000L);
        Employee employee4 = new Employee(4L, "Wilson", "29", 40000L);

        //// store these data into List

        List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4);
//        for(Employee e: list)
//        {
//            System.out.println(e);
//        }

        // count use
        Long list1 = list.stream().count();
        System.out.println(list1);


        // groupingBy
       Map<String,List<Employee>>  listMap= list.stream().collect(Collectors.groupingBy(name -> name.getAge()));
        System.out.println(listMap);
        //
        for(Map.Entry<String,List<Employee>> entry : listMap.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());  // print all data
        }

        // try to print like that
        //group by age and display all the employees of that group
        //29 - ram,wilson
        //23 - sam,Suresh
        //28- rakesh

        System.out.println("\n printing in the formation of age and name  ");

        Map<String,List<String>> map = list.stream().collect(Collectors.groupingBy(age->age.getAge(), Collectors.mapping(name -> name.getName(), Collectors.toList())));
        for(Map.Entry<String,List<String>> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());  // print all data
        }

    }


static void reduceMethod()
{
    List<Integer> list1 = Arrays.asList(23,543,23,65,4,3,42,543,675);
    Integer sum =  list1.stream().reduce(0, (o1,o2) -> (o1+o2));
    System.out.println(sum );
    // for count elements
    Long count = list1.stream().count();
    System.out.println(count);
    // count employee data
    //list.stream().filter()

}
static void peekUse()
    {
        Employee employee1 = new Employee(1L, "Ram", "29", 10000L);
        Employee employee2 = new Employee(2L, "Sam", "23", 20000L);
        Employee employee3 = new Employee(3L, "Rakesh", "28", 30000L);
        Employee employee4 = new Employee(4L, "Wilson", "29", 40000L);

        //// store these data into List

        List<newAssignments.ass9.Employee> list = Arrays.asList(employee1, employee2, employee3, employee4);
        for(newAssignments.ass9.Employee e: list)
        {
            System.out.println(e);
        }

        // use of peek
        System.out.println();
        // change name of employee whose salary is greater than 10000L using peek method in stream api
        List<Employee> employees = list.stream().filter(employee -> employee.getSalary()>10000L)
                .peek(employee -> employee.setName(employee.getName()+ "_Kumar" )).collect(Collectors.toList());

        //  System.out.println(employees);

        // use peek() to increase the salary of every employee's by 10%
        list.stream().filter(employee -> employee.getSalary() == employee.getSalary()).
                peek(employee -> employee.
                        setSalary(employee.getSalary()+(employee.getSalary()*10)/100)).forEach(System.out::println);

        List<Integer> list1 =Arrays.asList(2,5,4,1,8,9,3,5,4);
        // using peek method  //
        list1.stream().filter(integer -> integer%2==0).map(integer -> integer*10)
                .peek(System.out::println).map(integer -> integer*100).forEach(System.out::println);

    }

    static void filterAndMap()
    {
        List<Integer> list1 =Arrays.asList(2,5,4,1,8,9,3,5,4);
        Predicate<Integer> predicate  = integer -> integer%2==0;
        Function<Integer,Integer> function = integer -> integer*3;
        // we can also pass predicate and function in filter and map using stream api .
        // take even number and multiply with 3 in data

        list1.stream().filter( integer -> integer%2==0).forEach(System.out::println); // print even number
        List<Integer> list2 = list1.stream().filter(integer -> integer%2==0).map(integer -> integer*2).collect(Collectors.toList());
        System.out.println(list2);
        list1.stream().map(integer -> integer>3).forEach(System.out::println);  // return true and false values
    }
}
