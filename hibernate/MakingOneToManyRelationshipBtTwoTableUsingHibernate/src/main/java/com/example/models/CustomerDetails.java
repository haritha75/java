package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "customerDetails")
public class CustomerDetails {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "phone")

    private int phone;
    @Column(name = "email")

    private String email;
    @Column(name = "address")

    private String address;
//    actually we are making relationship in customer have customer details right so that's why we are created one column in customers table but here to get the details about custome also i am created this column
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "customerDetails")
    private Customer customer;

    public CustomerDetails() {
    }

    public CustomerDetails(int id, int phone, String email, String address) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "id=" + id +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
