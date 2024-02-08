package org.example.com.dao;

import org.example.com.connector.ConnectorFactory;
import org.example.com.dto.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImp implements  EmployeeDAO {

    @Override
    public List getEmployees()  {
        ArrayList<Employee>  empList = null;
        try {
            Connection con = ConnectorFactory.requestConnection();
            String query = "select * from emp";
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query);

            empList = new ArrayList<>();

            while(res.next()) {
                int id = res.getInt(1);
                String name = res.getString(2);
                String design = res.getString(3);
                int salary = res.getInt(4);

                Employee employee= new Employee(id,name,design,salary); // here normal data converted in to the object data
                empList.add(employee);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return empList;
    }

    @Override
    public Employee getemployee(int id1) throws SQLException, ClassNotFoundException {
        Connection con = ConnectorFactory.requestConnection();
        String query = "select * from emp where id = ?";
        PreparedStatement ptmt = con.prepareStatement(query);
        ptmt.setInt(1,id1);
        ResultSet res =  ptmt.executeQuery();
        res.next();
        int id = res.getInt(1);
        String name = res.getString(2);
        String design = res.getString(3);
        int salary = res.getInt(4);

        Employee e = new Employee(id,name,design,salary);

        return e;
    }

    @Override
    public boolean insertEmployee(int id, String name, String design, int salary) throws SQLException, ClassNotFoundException {
        Connection con = ConnectorFactory.requestConnection();
        String query = "insert into emp (id,name,design,salary) values (?,?,?,?)";
        PreparedStatement ptmt = con.prepareStatement(query);
        ptmt.setInt(1,id);
        ptmt.setString(2,name);
        ptmt.setString(3,design);
        ptmt.setInt(4,salary);

        return ptmt.execute(); //here it gives false by default it is in false if the data insert it return false
    }

    @Override
    public boolean updateEmployee(Employee e) throws SQLException, ClassNotFoundException {

        Connection con = ConnectorFactory.requestConnection();
        String query = "update emp set salary = ? where id =?";
        PreparedStatement ptmt = con.prepareStatement(query);
        ptmt.setInt(1,e.getSalary());
        ptmt.setInt(2,e.getId());
        int i = ptmt.executeUpdate();
        if(i == 1)
             return true;
        return false;

    }

    @Override
    public boolean deleteEmployee(int id1) throws SQLException, ClassNotFoundException {

        Connection con = ConnectorFactory.requestConnection();
        String query = "delete from emp where id = ?";
        PreparedStatement ptmt = con.prepareStatement(query);
        ptmt.setInt(1,id1);

        return ptmt.execute();

    }
}
