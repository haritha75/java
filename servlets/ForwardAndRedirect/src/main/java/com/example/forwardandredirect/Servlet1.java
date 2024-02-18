package com.example.forwardandredirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//in redirect method each servlet take req and response  and new object will be created each time calls happening means each time it takes req and send response here also response will be overrides  but forward it takes only one req and send one response whenever send response to another server page it overrides
@WebServlet("/serv1")
//in forward method we cannot come back but in include we can come back also ,
// in format data will override when send response to the other servlet page but include not like that it include the previous and current response in the current servlet page.
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h1 style=\"color:red\">Servlet1, Response 1 </h1>");
        req.getRequestDispatcher("/serv2").forward(req,resp);
//        req.getRequestDispatcher("/serv2").include(req,resp);

        writer.println("<h1 style=\"color:red\">Servlet1, Response 2 </h1>");


    }
}
