import java.sql.*;

// JDBC is an api it is used to make connection to the application and database for that purpose we can use jdbc it is acting like a mediator  we have 7 steps
// 1. import packages 2. load driver 3. register driver 4. make connection 5. create statement 6. execute query 7. close connections
public class JDBCConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sql_hr";
        String username = "root";
        String password = "9754";
        Connection con = null;
        ResultSet res = null;
        Statement stmt = null;


        try {
            con = DriverManager.getConnection(url,username,password);
            stmt = con.createStatement();
            String query = "select * from employees";
            res = stmt.executeQuery(query);


            while(res.next()) {
                System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(5));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
                res.close();
                stmt.close();
                con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
