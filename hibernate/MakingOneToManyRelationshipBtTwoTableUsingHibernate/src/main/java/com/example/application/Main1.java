package com.example.application;

import com.example.models.Customer;
import com.example.models.CustomerDetails;
import com.example.models.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Customer.class);
        config.addAnnotatedClass(CustomerDetails.class);
        config.addAnnotatedClass(Orders.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session  = sessionFactory.openSession();
        Transaction transaction  = session.beginTransaction();

        Customer c = session.get(Customer.class,2);
        Customer c1 = session.get(Customer.class,3);


//        Orders orders1 = new Orders(201,"Juice",50);
//        Orders orders2 = new Orders(111,"Burger",200);
//        Orders orders3 = new Orders(102,"Pizza",250);
//        Orders orders4 = new Orders(103,"Biryani",300);
//        Orders orders5 = new Orders(105,"Egg Puff",20);


//make sure id's will be different in every time otherwise get error
//        orders1.setCustomer(c);
//        orders2.setCustomer(c);
//        orders3.setCustomer(c1);
//        orders4.setCustomer(c1);
//        orders5.setCustomer(c1);
//
//        session.save(orders1);
//        session.save(orders2);
//        session.save(orders3);
//        session.save(orders4);
//        session.save(orders5);

        Customer c2 = session.get(Customer.class,1);
        List<Orders> list = c2.getOrders();
        for(var orderItem : list) {
            System.out.println(orderItem);
        }
//        session.delete(c2); // if you want to delete it will delete if one table make changes it effect all other tables also because we are using cascade type

        transaction.commit();

    }
}
