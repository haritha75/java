package com.example.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    @JoinColumn(name = "customer_details_id")
    @OneToOne(cascade = CascadeType.ALL)
//    here if any changes happends then it will effected to the other classes also
    private CustomerDetails customerDetails;
// here we are making relationship
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Orders> orders;
    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerDetails=" + customerDetails +
                '}';
    }
}
