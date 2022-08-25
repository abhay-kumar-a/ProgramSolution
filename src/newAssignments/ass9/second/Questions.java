package newAssignments.ass9.second;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {

        // category book
        Product p1 = new Product(1L, "Data Structure", "Book", 200D);
        Product p2 = new Product(2L, "Algorithm", "Book", 300D);
        Product p3 = new Product(3L, "Software Engineering", "Book", 100D);
        Product p4 = new Product(4L, "Operating System", "Book", 150D);
        Product p5 = new Product(5L, "Microprocessor", "Book", 90D);
        Product p6  = new Product(6L,"Helicopter","Toys",200D);
        Product p7= new Product(7L,"Robot","Toys",1000D);
        Product p8 = new Product(8L,"Car","Toys",1000D);
        Product p9 = new Product(9L,"Rocking horse","Toys",200D);
        Product p10 = new Product(10L,"Paints","Toys",2000D);
        Product p11 = new Product(11L,"baby1","Baby",100D);
        Product p12 = new Product(12L,"baby2","Baby",200D);

        List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5,p6,p7,p8,p9,p10);

        //Customer class
        Customer customer1 = new Customer(101L,"Rakesh",1);
        Customer customer2 = new Customer(103L,"Mayank",3);
        Customer customer3 = new Customer(102L,"Mohan",1);
        Customer customer4 = new Customer(104L,"Anshika",2);


        System.out.println("List of all product which price is grater than 100\n");

        //Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100

        productList.stream().filter(category -> category.getCategory().equals("Book")).
                filter(book ->book.getPrice()>100).map(name -> name.getName()).forEach(data -> System.out.println(data));


        System.out.println("------------------------------------------------------------------");
        // Exercise 2 : Obtain a list of order with products belong to category “Baby”

        Set<Product> set1 = new HashSet<>();  // for each product we need to add separate sets;
        set1.add(p11);
        Set<Product> set2 = new HashSet<>();
        set2.add(p12);
        Set<Product> set3 = new HashSet<>();
        set3.add(p10);

        // Order class
        Order order = new Order(1001L, LocalDate.of(2022,05,01), LocalDate.of(2022,05,7),customer1,set1);
        Order order1 = new Order(1002L, LocalDate.of(2021,02,04), LocalDate.of(2021,02,8),customer2,set2);
        Order order2 = new Order(1003L, LocalDate.of(2022,05,9), LocalDate.of(2022,05,15) , customer1,set2);
        Order order3 = new Order(1004L, LocalDate.of(2022,05,14), LocalDate.of(2022,05,20),customer3,set3);

        List<Order> orderList = Arrays.asList(order,order1,order2,order3);
        List<Order> list2 =  orderList.stream().filter(orders -> orders.getProducts()
                 .stream().anyMatch(product -> product.getCategory().
                         equals("Baby"))).collect(Collectors.toList());
         for(Order o : list2)
         {
             System.out.println(o);
         }

         // category toys
        // Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
        System.out.println("---------------------------------------------------------------------");
        productList.stream().filter(category -> category.getCategory().equals("Toys")).
                peek(product -> product.setPrice(product.getPrice()-(product.getPrice()*10)/100)).map(price -> price.getPrice()).
                forEach(System.out::println);


        //  Exercise 4 — Get the cheapest products of “Books” category
        //   Comparator<,Product> comparator =

        System.out.println("-----------------------------------Cheapest data------------------------");
         productList.stream().filter(category -> category.getCategory().equals("Book")).
                 sorted((o1,o2) -> o1.getPrice().compareTo(o2.getPrice())).map(price -> price.getPrice()).limit(1).forEach(System.out::println);


       // Exercise 5 — Get the 3 most recent placed order
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Get the 3 most recent placed order");
            List<Order> list3 = orderList.stream().sorted((o1,o2) -> o2.getOrderDate().compareTo(o1.getOrderDate())).limit(3).collect(Collectors.toList());
            for(Order o : list3)
            {
                System.out.println(o);
            }

      //  Exercise 6 — Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list");

            Order order4 = new Order(1005L,LocalDate.of(2021,03,15),
                    LocalDate.of(2021,03,10),customer4,set1);
            Order order5 = new Order(1006L,LocalDate.of(2021,02,15),
                    LocalDate.of(2021,03,22),new Customer(),set2);

        List<Order> orderList2 = Arrays.asList(order,order1,order2,order3,order4,order5);

            orderList2.stream().filter(order6 -> order6.getOrderDate().toString().equals("2021-03-15")).
                    peek(System.out::println).filter(product -> product.getOrderDate().toString().equals("2021-03-15")).
                    map(product12 -> product12.getProducts()).forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------------------");
            // Exercise 7 — Calculate total lump sum of all orders placed in Feb 2021
        System.out.println("Calculate total lump sum of all orders placed in Feb 2021");

       long sum=  orderList2.stream().filter(a-> a.getOrderDate().getYear()==2021 && a.getOrderDate().getMonthValue()==02).count();
        System.out.println(sum);

        System.out.println("--------------------------------------------------------------------------------");
        //Exercise 8 — Obtain a data map with order id and order’s product count from the order list.
        System.out.println(" 8. Obtain a data map with order id and order’s product count from the order list.");
        Order order6 = new Order(1006L,LocalDate.of(2021,03,16),
                LocalDate.of(2021,03,22),customer4,set1);
        List<Order> orderList3 = Arrays.asList(order,order1,order2,order3,order4,order5,order6);


        Map<Long, List<Long>> grouping = orderList3.stream().collect(Collectors.
                groupingBy(orderID -> orderID.getId(),Collectors.
                        mapping(map -> map.getProducts().stream().count(),Collectors.toList())));

        for(Map.Entry<Long,List<Long>> entry : grouping.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }


        System.out.println("-------------------------------------------------------------------------------------");
       // Exercise 9 — Produce a data map with order records grouped by customer from the order list
        System.out.println(" 9.Produce a data map with order records grouped by customer from the order list");

//        for(Order o: orderList3)
//        {
//            System.out.println(o);
//        }
        System.out.println("------------------------------------------------------------------------------------");
        List<Customer> customerList = Arrays.asList(customer1,customer2,customer3,customer4);

        Map<Customer,List<Order>> customerOrderList =   orderList3.stream().collect(Collectors.groupingBy(o -> o.getCustomer()));

        for(Map.Entry<Customer,List<Order>> entry : customerOrderList.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }

}
