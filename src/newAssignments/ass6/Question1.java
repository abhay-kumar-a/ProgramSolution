package newAssignments.ass6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Question1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1001,"Abhay","Dev","SE", 10000));
        list.add(new Employee(1002,"Vivek","Dev","SD", 20000));
        list.add(new Employee(1003,"Rajan","Testing","SE", 30000));
        list.add(new Employee(1004,"Harish","Testing","SE", 40000));
        Employee e1 = new Employee(1005,"Abhishek","Testing","tester",10000);
        list.add(e1);

        // q1. Create list of employees and filter the elements where salary &gt; 10000 using predicate interface.

        // predicate interface
        Predicate<Employee> predicate = emp-> emp.getSalary()>10000;
        list.stream().filter(predicate).forEach(System.out::println);

        // Q2. Create a Function interface identifier and add 20000 salary increment to each employee in the list.
        Function<Employee ,Integer> function = employee -> employee.getSalary()+20000;
        list.stream().map(function).forEach(System.out::println);
        // Q3. Create a function interface identifier to get employees whose names begin with ‘H’.
        System.out.println();


        Function<Employee,String> name1 = empName -> String.valueOf(empName.getName().startsWith("H"));
        list.stream().map(name1).forEach(System.out::println);   // it will return tru and false value
        // by using predicate
        Predicate<Employee> predicate1 = employee -> employee.getName().startsWith("H");
        list.stream().filter(predicate1).forEach(System.out::println);


    }
}
