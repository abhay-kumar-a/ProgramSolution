package newAssignments.ass9.second;

import java.time.LocalDate;
import java.util.Set;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private Customer customer;
    Set<Product> products;

//    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, Set<Product> products) {
//        this.id = id;
//        this.orderDate = orderDate;
//        this.deliveryDate = deliveryDate;
//        this.products = products;
//    }

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, Customer customer, Set<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.customer = customer;
        this.products = products;
    }
    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }


}
