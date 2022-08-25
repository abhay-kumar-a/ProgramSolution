package newAssignments.streamAPI.sessionCode;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

            List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
            Map<Boolean, List<Integer>> isEven = intList.stream().collect(
                    Collectors.partitioningBy(i -> i % 2 == 0));
            System.out.println(isEven);
            checkGroupBy();

        }

        private void printList(){
        List<Integer> list = Arrays.asList(1,2,4,6,7);
        list.stream().filter(s -> s!=null).forEach(integer -> System.out.println(integer));
        }

    private static void printFunction(){
        Function<Integer, String> fun = integer -> integer.toString() + "_" + "String data";
        String stringData = fun.apply(12);
        System.out.println(stringData);
    }

    private static  Predicate<String> checkPredicate(){
        Predicate<String> predicate = s -> s!=null;
        //boolean isNull = predicate.test("Stream API");
        //boolean isNullData = predicate.test(null);
        //System.out.println(isNullData);
        return  predicate;
    }

    private static Consumer<String> checkConsumer(){
        Consumer<String> consumer = s -> System.out.println(s);
        return consumer;
    }

    private static void checkSupplier(){
        Supplier<Long> supplier = () ->  100L;
        Long supplierData = supplier.get();
        System.out.println(supplierData);
    }

    private static void checkBiFun(){
        BiFunction<String, String, String> biFun = (s, s2) -> s + " "+ s2;
        System.out.println(biFun.apply("Hello", "World"));

        BinaryOperator<String> binaryOperator = (s, s2) -> s + " "+ s2;
        System.out.println(binaryOperator.apply("Hello", "World"));
    }

    private void doFiletrMap(){

        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        Function<Integer, Integer> fun = integer -> integer *2 ;
        List<Integer> list = Arrays.asList(1,2,4,6,7);
        list.stream().filter(predicate).map(fun).forEach(System.out::println);
    }

    private void checkPeek(){
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        Function<Integer, Integer> fun = integer -> integer *2 ;
        List<Integer> list = Arrays.asList(1,2,4,6,7);
        list.stream().filter(predicate).map(fun).peek(System.out::println).map(integer -> integer * 3).forEach(System.out::println);

    }

    private void doPeekWithEmployee(){
        // use peek() to increase the salry of every employees by 10%
        Employee employee1 = new Employee(1L,"Ram","29",10000L);
        Employee employee2 = new Employee(2L,"Sam","23",20000L);
        Employee employee3 = new Employee(3L,"Rakesh","28",30000L);
        Employee employee4 = new Employee(4L,"Wilson","29",40000L);

        List<Employee> listEmployee = Arrays.asList(employee1,employee2,employee3,employee4);
        listEmployee.stream().filter(employee -> employee.getSalary() > 10000L)
                .peek(employee -> employee.setName(employee.getName() + "_new"))
                .forEach(System.out::println);
    }

    private void checkReduce(){
        List<Integer> list = Arrays.asList(1,2,4,6,7);
        int counter = 0;
        for (Integer i: list){
            counter = counter + i;
        }
        System.out.println(counter);

        Integer sum = list.stream().reduce(2, (i1, i2) -> i1 + i2);
        System.out.println(sum);
    }

    private void checkReduceOnString(){
        List<String> list =  Arrays.asList("Hello","World","Welcome","to","Java 8","Stream Api");
        Optional<String> concatenatedStringOpt = list.stream().reduce((s1, s2) -> s1 + " " +s2 );
        if(concatenatedStringOpt.isPresent()){
            System.out.println(concatenatedStringOpt.get());
        }
    }

    private  static void checkGroupBy(){
        //groupingBy
        Employee employee1 = new Employee(1L,"Ram","29",10000L);
        Employee employee2 = new Employee(2L,"Sam","23",20000L);
        Employee employee3 = new Employee(3L,"Rakesh","28",30000L);
        Employee employee4 = new Employee(4L,"Wilson","29",40000L);
        Employee employee5 = new Employee(4L,"Suresh","23",40000L);
        List<Employee> listEmployee = Arrays.asList(employee1,employee2,employee3,employee4, employee5);
        //group by age and display all the employees of that group
        //29 - ram,wilson
        //23 - sam,Suresh
        //28- rakesh

        Map<String, List<Employee>> empListByAge = listEmployee.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        Map<String, List<String>> empListByAgeName = listEmployee.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge(),
                        Collectors.mapping(employee -> employee.getName(),Collectors.toList())));

        System.out.println(empListByAge);
        System.out.println(empListByAgeName);
    }

}
