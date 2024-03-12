package com.example.implementaion;

import com.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

        public static void main(String[] args) {

            Configuration config = new Configuration();
            config.configure();
            config.addAnnotatedClass(Student.class);

            SessionFactory sessionFactory = config.buildSessionFactory();
            Session session  = sessionFactory.openSession();

            Transaction transaction  = session.beginTransaction();
//            Student student1 = new Student(1,"Haritha","haritha@gmail.com");
//            session.save(student1);
//
//            Student student2 = new Student(2,"Reddi","reddi@gamil.com");
//            session.save(student2);

//            Retrieve data

            Student student = session.get(Student.class,1); // here we mention id name is 1 so it read only one record
            System.out.println(student);
//            to read entire data set
            String query = "from Student";
            List<Student> students = session.createQuery(query,Student.class).list();
            for(Student stu : students)
               System.out.println(stu);
//            based on condition write like this

            String query1 = "from Student s where s.marks <=70 ";
            List<Student> students1 = session.createQuery(query1,Student.class).list();
            for(Student stu : students1)
                System.out.println(stu);

//            update data
            Student student3 = session.get(Student.class,1);
            student3.setMarks(80);
            session.update(student3);

//            String quer = "update Student s  set s.marks = 45"; //it updates all because we are mention particular one
//            session.createQuery(quer).executeUpdate();

            Student s1 = new Student(6,"virat","kingkohli@gmail.com",97);
            session.saveOrUpdate(s1); //here what happends means if we have id then it will update else it will insert

//            delete

            Student student4 = session.get(Student.class,2);
            session.delete(student4);

            String qu = "delete Student s where s.marks = 97";
            session.createQuery(qu).executeUpdate();


            transaction.commit();
            session.close();
            sessionFactory.close();

        }
    }


