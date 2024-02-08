package org.example;
// previously we are implementing all in one class now we are implementing different classes for understand and easy readability purpose
//here we have three classes that are dto--data transfer object it is used to whatever the data have it will be transfer for one module to other module in this class available all the data in private mode we can access using getters and setters
// dao -- data access object it is actually interface have it tak a connection and implementing all the method or operations in the concrete class
// connector class it is used it load a driver and make connection to the driver and rdbms and return connection to the dao class
import org.example.com.dao.EmployeeDAOImp;
import org.example.com.dto.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DAO_DesignPatternAndDAODriver {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EmployeeDAOImp employeeDAOImp = new EmployeeDAOImp();
        List<Employee> employees = employeeDAOImp.getEmployees();

        for(Employee e : employees) {
            System.out.println(e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        int id = sc.nextInt();
        Employee e1 = employeeDAOImp.getemployee(id);
        System.out.println(e1);

        System.out.println("enter the salary to be updated");
        int newSalary = sc.nextInt();
        e1.setSalary(newSalary);
        System.out.println( employeeDAOImp.updateEmployee(e1));

      //  System.out.println(employeeDAOImp.insertEmployee(16,"Ram","actor",35000));
       // System.out.println(employeeDAOImp.deleteEmployee(4));

    }
}
