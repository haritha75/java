package org.example;

import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ACIDProperties {
    public static void main(String[] args)  {

        String  url = "jdbc:mysql://localhost:3306/employee";
        String userName = "root";
        String password = "9754";
        Connection con3 = null;
        PreparedStatement ptmt = null;
//        ResultSet res3 =  null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver successfully loaded ");
            con3 = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection  is established");

            // let see how  it insert the dat when user enter the data using front end

            String query = "insert into emp (`id`,`name`,`design`,`salary`) values (?,?,?,?)"; //here query not completed you donot want insert user values enters right
            //so  completes this query we can use prepredSttement it can help to complete the query

            ptmt = con3.prepareStatement(query);

//            previous we can enter data from user only one time now make it how many time user wants

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of rows to the inserted: ");
            int n = sc.nextInt();

//            if your table maintain acid properties means atomicity and consistency  means atomicity means either complete all the records or rows which are wanted to the user  or not complete that means donot do partially inserted or updated or deleted means it not completed tha task  and consistency we know that.
//            in this case whenever user enter rows and give the data only one row it will be update automatically  because autocommit option in jdbc default in true level if you donot want to the that means if you want after complete the all rows or records from user then only you want updated then you can make auotcommit option false
//            for(int i=1;i<=n;i++) {
//                System.out.println("Enter id");
//                int id = sc.nextInt();
//                System.out.println("Enter name");
//                String name = sc.next();
//                System.out.println("Enter design");
//                String design  = sc.next();
//                System.out.println("Enter salary");
//                int salary = sc.nextInt();
//
//                ptmt.setInt(1,id);
//                ptmt.setString(2,name);
//                ptmt.setString(3,design);
//                ptmt.setInt(4,salary);
//
//                ptmt.execute(); //after adding all to the data means user data will be assign means now the query is completed after  it execute that query
//
//
//          }
//            here what happend we can we can execute the all rwos but not commit after loop ends at a time we commit that data once if in the middle of the loop something got error then it will not commit that means data not updated in the table this is logic behind this.
            con3.setAutoCommit(false);

            for(int i=1;i<=n;i++) {
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


            }
            con3.commit();
//            after completing all the records or rows execution then we are commit at a time once
//            this is called atomicity either complete all record not not complete that's it



        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {

//            res3.close();
            ptmt.close();
            con3.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}