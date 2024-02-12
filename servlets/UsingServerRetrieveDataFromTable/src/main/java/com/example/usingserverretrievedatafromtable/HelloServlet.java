package com.example.usingserverretrievedatafromtable;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello-servlet")
//directly here we mapping the server
public class HelloServlet extends HttpServlet {

    String url = "jdbc:mysql://localhost:3306/College";
    String username = "root";
    String password = "9754";
    Connection con = null;

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        resp.setContentType("text/html");
        PrintWriter write = resp.getWriter();
//        till now we are printing data manually now print the data which is from table in database
        try {

            String query = "select * from student where name = ? and student_id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,name);
            stmt.setString(2,password);
            ResultSet res = stmt.executeQuery();
            if(res.next()) {
                write.println("<h3> Login successful </h3>");
            }
            else{

//                to redirect html page we are using dispatcher
                RequestDispatcher rd = req.getRequestDispatcher("InvalidDetails.html");
                rd.forward(req,resp);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}