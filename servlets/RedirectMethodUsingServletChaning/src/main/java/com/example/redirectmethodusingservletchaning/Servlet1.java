package com.example.redirectmethodusingservletchaning;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//in redirect method each servlet take req and response  and new object will be created each time calls happening means each time it takes req and send response here also response will be overrides  but forward it takes only one req and send one response whenever send response to another server page it overrides
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h3> servlet1 loaded</h3>");
        resp.sendRedirect("serv2");

    }
}
