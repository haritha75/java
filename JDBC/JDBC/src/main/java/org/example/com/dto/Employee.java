package org.example.com.dto;
// it is used take the row wise data and accessing using getter and setters and also it transfer on module to another module for that purpose we can use this layer
//this class duty is it convert whatever data from the database to the object but it connot do the operations on the database if you want do the operations on the database we can use dao class
public class Employee {

    private int id;
    private String name;
    private String designation;
    private int salary;
    public Employee() {

    }

    public Employee(int id, String name, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+designation+" "+salary;

    }
}
