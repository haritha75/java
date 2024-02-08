package org.example;

import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HowToMakeQueryBasedOnUserData {
    public static void main(String[] args)  {

        String  url = "jdbc:mysql://localhost:3306/employee";
        String userName = "root";
        String password = "9754";
        Connection con3 = null;
        PreparedStatement ptmt = null;
        ResultSet res3 =  null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver successfully loaded ");
            con3 = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection  is established");

           // let see how  it insert the dat when user enter the data using front end

            String query = "insert into emp (`id`,`name`,`design`,`salary`) values (?,?,?,?)"; //here query not completed you donot want insert user values enters right
            //so  completes this query we can use prepredSttement it can help to complete the query

            ptmt = con3.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id");
            int id = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter design");
            String design  = sc.next();
            System.out.println("Enter salary");
            int salary = sc.nextInt();

           ptmt.setInt(1,id);
           ptmt.setString(2,name);
           ptmt.setString(3,design);
           ptmt.setInt(4,salary);

           ptmt.execute(); //after adding all to the data means user data will be assign means now the query is completed after  it execute that query

           System.out.println("query executed successfully");



        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {

            res3.close();
            ptmt.close();
            con3.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}