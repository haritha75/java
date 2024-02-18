package com.example.forwardandredirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/serv3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h1 style=\"color:blue\">Servlet3, Response 1 </h1>");
        writer.println("<h1 style=\"color:blue\">Servlet3, Response 2 </h1>");
        writer.println("<h1 style=\"color:blue\">Servlet3, Response 3 </h1>");


    }
}
