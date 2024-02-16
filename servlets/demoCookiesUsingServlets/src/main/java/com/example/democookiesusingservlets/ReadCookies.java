package com.example.democookiesusingservlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/read")
public class ReadCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        for(int i=0;i<cookies.length;i++) {
            String name = cookies[i].getName();
            String value = cookies[i].getValue();

            writer.println("<h3> Cookie Name : "+name+"</h3");
            writer.println("<h3> Cookie Value : "+value+"</h3>");
        }
    }
}
