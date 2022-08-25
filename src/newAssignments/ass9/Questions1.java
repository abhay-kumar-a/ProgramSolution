package newAssignments.ass9;

import java.util.Arrays;
import java.util.List;

public class Questions1 {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1L, "Ram", "29", 10000L);
        Employee employee2 = new Employee(2L, "Sam", "23", 20000L);
        Employee employee3 = new Employee(3L, "Rakesh", "28", 30000L);
        Employee employee4 = new Employee(4L, "Wilson", "29", 40000L);

        //// store these data into List

        List<Employee> list = Arrays.asList(employee1, employee2, employee3, employee4);
        // use peek() to increase the salary of every employee's by 10%
        list.stream().filter(employee -> employee.getSalary() != null).
                peek(employee -> employee.
                        setSalary(employee.getSalary()+(employee.getSalary()*10)/100)).forEach(System.out::println);

    }






}
