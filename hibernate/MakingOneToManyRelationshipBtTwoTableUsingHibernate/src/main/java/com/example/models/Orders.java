package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")

    private int price;
    @JoinColumn(name="customer_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    public Orders() {

    }
    public Orders(int id,String name,int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}
