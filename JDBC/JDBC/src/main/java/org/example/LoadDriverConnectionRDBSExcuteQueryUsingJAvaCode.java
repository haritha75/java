package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LoadDriverConnectionRDBSExcuteQueryUsingJAvaCode {
    public static void main(String[] args)  {

        String  url = "jdbc:mysql://localhost:3306/employee";
        String userName = "root";
        String password = "9754";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver successfully loaded ");
            Connection con = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection  is established");

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
            String query = "select * from emp";
            ResultSet res = stmt.executeQuery(query);
            System.out.println("query executed successfully");

            while(res.next()) { //first cursor is in table of the first row means column heading it will hear for that if you write next it will go to next row
                System.out.println(res.getInt("id")+" "+res.getString("name")+" "+res.getString("design")+" "+res.getInt("salary"));
            }

            //once printing result  you will not come back to the position here available only forward direction so if you want to that write ResultSet.TYPE_SCROLL_SENSITIVE it makes flexible to scroll in any row in a table
            res.first();
            System.out.println(res.getInt("id")+" "+res.getString("name")+" "+res.getString("design")+" "+res.getInt("salary"));

            res.absolute(2);
            System.out.println(res.getInt("id")+" "+res.getString("name")+" "+res.getString("design")+" "+res.getInt("salary"));

            // if you donot the  about the table then you want that data use metadata isnothing but data about data table

            ResultSetMetaData metaData = res.getMetaData();
            System.out.println(metaData);
            System.out.println(metaData.getColumnCount());
            System.out.println(metaData.getColumnName(1)+" "+metaData.getColumnName(2)+" "+metaData.getColumnName(3)+" "+metaData.getColumnName(4));

            //if you have more column we cannotwrite lines of code right then use like this

            for(int i=1;i<=metaData.getColumnCount();i++) {
                System.out.println(metaData.getColumnName(i)+" "+metaData.getColumnTypeName(i));
            }

            res.absolute(2);

            System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));

            res.close();
            stmt.close();
            con.close();




        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}