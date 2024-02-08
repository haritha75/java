package org.example;

import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UpdateAndDeleteDataUsingJDBCWithJava {
    public static void main(String[] args)  {

        String  url = "jdbc:mysql://localhost:3306/employee";
        String userName = "root";
        String password = "9754";
        Connection con3 = null;
        Statement stmt = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver successfully loaded ");
            con3 = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection  is established");

            // let see how  it insert the dat when user enter the data using front end

            String query = "update emp set salary = salary + salary*0.20"; //here query not completed you donot want insert user values enters right

           stmt = con3.createStatement();
           System.out.println("No.of Rows updated:" + stmt.executeUpdate(query));

           String query1 = "delete from emp where name = 'josh' ";
           System.out.println("No.of rows deleted:" + stmt.executeUpdate(query1));




        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {

            stmt.close();
            con3.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}