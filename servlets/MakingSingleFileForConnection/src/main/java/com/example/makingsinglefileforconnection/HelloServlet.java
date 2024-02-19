package com.example.makingsinglefileforconnection;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//till now we are establish connection in each file right let see how to establish connect in single file
public class HelloServlet extends HttpServlet {


    Connection con = null;
//to access name and value from the inti params tag we need one object called servlet config object it is created whenever create inti method req,res and servlet config objects created automatically
//    servlet config object contain inti param name and values and also we cannot access that values and names to access that values we need one method called getInitParameter(
    @Override
    public void init(ServletConfig sc) throws ServletException {

        try {
//            only difference is we are establish connection in one file to access that values to servlet pages we need one object called servlet config
            String url = sc.getInitParameter("url");
            String username = sc.getInitParameter("username");
            String password = sc.getInitParameter("password");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        resp.setContentType("text/html");
        PrintWriter write = resp.getWriter();
//        till now we are printing data manually now print the data which is from table in database
        try {

            String query = "select * from Students where Name = ? and Password = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,name);
            stmt.setString(2,password);
            ResultSet res = stmt.executeQuery();
            if(res.next()) {
                req.getRequestDispatcher("/drives").include(req,resp);

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