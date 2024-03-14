package com.example.application;

import com.example.models.Customer;
import com.example.models.CustomerDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Customer.class);
        config.addAnnotatedClass(CustomerDetails.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session  = sessionFactory.openSession();

        Transaction transaction  = session.beginTransaction();

//        Customer c1 = new Customer(1,"Haritha");
//        CustomerDetails cd = new CustomerDetails(101,2345678,"haritha@gmail.com","Rajampet");
//        c1.setCustomerDetails(cd);
//        session.save(c1);

//        Retrieve data
//
//        Customer c2 = session.get(Customer.class,1);
//        System.out.println(c2);

        CustomerDetails cd1 = session.get(CustomerDetails.class,101);
        Customer c = cd1.getCustomer();
        System.out.println(c);


        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
