package com.example.connectoutsideserver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //               till now we are using forward,include an redirect method to connect local servers or servlets page
//               but if you want to connect outside the server like google server forward and include not connected you can use only redirect method it will only connect ot the outside the server
        System.out.println(req.getParameter("name"));
       // req.getRequestDispatcher("https://www.google.com").forward(req,resp);
        resp.sendRedirect("https://www.google.com");
    }
}
