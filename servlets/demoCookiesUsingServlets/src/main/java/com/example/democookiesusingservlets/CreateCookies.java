package com.example.democookiesusingservlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// based on the history we are getting relative  videos in youtube because cookies
@WebServlet("/create")
public class CreateCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("browser","chrome");
        cookie.setMaxAge(30);
        resp.addCookie(cookie);

        Cookie cookie1 = new Cookie("web","firefox");
        cookie1.setMaxAge(20);
        resp.addCookie(cookie1);

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println("<h3> Cookies Created </h3>");
    }
}
