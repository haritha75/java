package org.example.com.dao;

import org.example.com.dto.Employee;

import java.sql.SQLException;
import java.util.List;
//it performs crud operations but ii is a interface so that we are using another concrete class
public interface EmployeeDAO {

    List getEmployees() throws SQLException, ClassNotFoundException;
    Employee getemployee(int id) throws SQLException, ClassNotFoundException;
    boolean insertEmployee(int id,String name,String design,int salary) throws SQLException, ClassNotFoundException;
    boolean updateEmployee(Employee e) throws SQLException, ClassNotFoundException;
    boolean deleteEmployee(int id) throws SQLException, ClassNotFoundException;

}
