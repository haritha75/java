package com.example.demotomcat;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello-servlet")
//previous we are doing servlet mapping and connecting that servlet to the class right now inplace of that you can do abovee also
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("it is used to intilizing the object it also called only once");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget() method called");
        String name = req.getParameter("name");
        String design = req.getParameter("designation");
        System.out.println(name);
        System.out.println(design);
//        till now we are printing the data in console so now print in web use print writter

        PrintWriter writer = resp.getWriter();
        writer.println("name = "+name);
        writer.println("designation = "+ design);
//        till now printing the data in normal text in web to print different use

        resp.setContentType("text/html");
        writer.println("<h3> name = "+name+"<h3>");
        writer.println("<h3> designation = "+design+"<h3>");

//        thank you for your response. Your response has been saved.
//        till now we print response manually so now print using static page

//        RequestDispatcher rd = req.getRequestDispatcher("staticresonse.html");
//        rd.forward(req,resp);
//        till now we print response statically now see dynamically
        PrintWriter write = resp.getWriter();
        write.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3>thank you for your response. Your response has been saved. "+name+"</h3>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    public void destroy() {
        System.out.println("it is used to stop the server only once called whenever stopping the server");
    }
}