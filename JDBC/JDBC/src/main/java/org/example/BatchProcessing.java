package org.example;

import java.sql.*;

public class BatchProcessing {

        public static void main(String[] args)  {

            String  url = "jdbc:mysql://localhost:3306/employee";
            String userName = "root";
            String password = "9754";
            Connection con1 = null;
            Statement stmt1 = null;
            ResultSet res1 = null;


            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver successfully loaded ");
                Connection con = DriverManager.getConnection(url,userName,password);
                System.out.println("Connection  is established");

                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);


                String query1 = "insert into emp (`id`,`name`,`design`,`salary`) values (06,'josh','CMO',25000)";
                stmt.execute(query1);
                String query2 = "insert into emp (`id`,`name`,`design`,`salary`) values (07,'josh','CMO',25000)";
                stmt.execute(query2);
                String query3 = "insert into emp (`id`,`name`,`design`,`salary`) values (08,'josh','CMO',25000)";
                stmt.execute(query3);

                //here we are every creating query and send to the rdbms and it executed that query and hard disk will hit it and send to the result every time it happends so that it takes time and also performance also slowly reduces

                //then you can use batch files process that means we can send all queries into batch file after at a time  we send batch file into the the hard disk here only one time we can hit the hard disk

                String query4 = "insert into emp (`id`,`name`,`design`,`salary`) values (09,'jo','CEO',20000)";
                String query5 = "insert into emp (`id`,`name`,`design`,`salary`) values (10,'jam','CCO',15000)";

                // whenever creating the statement on that time jdbc automatically provides the batch file

                stmt.addBatch(query4); //her we adding queries into the batch file
                stmt.addBatch(query5);

                stmt.executeBatch();
                System.out.println("queries executed successfully");




            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                res1.close();
                stmt1.close();
                con1.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }



        }
    }

