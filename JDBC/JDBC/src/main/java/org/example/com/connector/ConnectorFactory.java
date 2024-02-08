package org.example.com.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorFactory {

    static String  url = "jdbc:mysql://localhost:3306/employee";
    static String userName = "root";
    static String password = "9754";

    static Connection con = null;

   public static Connection requestConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url,userName,password);
        return con;

    }
}
