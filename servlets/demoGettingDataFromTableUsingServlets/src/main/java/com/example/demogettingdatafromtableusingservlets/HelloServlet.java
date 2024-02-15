package com.example.demogettingdatafromtableusingservlets;

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
        try {

            String query = "select * from Students where name = ? and password = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,name);
            stmt.setString(2,password);
            ResultSet res = stmt.executeQuery();
            if(res.next()) {
                req.getRequestDispatcher("/drives").forward(req,resp);
            }
            else{
                RequestDispatcher rd = req.getRequestDispatcher("InvalidDetails.html");
                rd.forward(req,resp);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
