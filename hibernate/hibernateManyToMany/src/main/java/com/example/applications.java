package com.example;

import com.example.models.Employee;
import com.example.models.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class applications {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        config.addAnnotatedClass(Employee.class);
        config.addAnnotatedClass(Project.class);

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session  = sessionFactory.openSession();

        Transaction transaction  = session.beginTransaction();


        Employee haritha = new Employee(100,"haritha","haritha@gmail.com");
        Employee reddi = new Employee(220,"reddi","reddi@gmail.com");
        Employee hari = new Employee(230,"hari","hari@gmail.com");

        Project free = new Project(110,"free");
        Project premium = new Project(220,"premium");
//
//        List<Employee> freeEmployee = new ArrayList<>();
//        List<Employee> premiumEmployee = new ArrayList<>();
//
        List<Project> harithaProject = new ArrayList<>();
        List<Project> reddiProjects = new ArrayList<>();
        List<Project> hariProject = new ArrayList<>();
        harithaProject.add(free);
        hariProject.add(free);
        reddiProjects.add(premium);

//        freeEmployee.add(haritha);
//        freeEmployee.add(hari);
//
//        premiumEmployee.add(reddi);
//
//        free.setEmployeeList(freeEmployee);
//        premium.setEmployeeList(premiumEmployee);

        haritha.setProjectList(harithaProject);
        hari.setProjectList(hariProject);
        reddi.setProjectList(reddiProjects);


        session.save(haritha);
        session.save(hari);
        session.save(reddi);
        session.save(free);
        session.save(premium);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
