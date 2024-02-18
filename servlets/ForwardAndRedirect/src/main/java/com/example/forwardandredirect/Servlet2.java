package com.example.forwardandredirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h1 style=\"color:green\">Servlet2, Response 1 </h1>");
//        req.getRequestDispatcher("/serv3").forward(req,resp);
        req.getRequestDispatcher("/serv3").include(req,resp);

        writer.println("<h1 style=\"color:green\">Servlet2, Response 2 </h1>");


    }
}
