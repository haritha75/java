<%--
  Created by IntelliJ IDEA.
  User: haritha
  Date: 21/02/24
  Time: 7:10 am
  To change this template use File | Settings | File Templates.
--%>

<%-- till now we are seeing only how to print and code in jsp file let see how to access user data and printing it --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!
  int addTwoValues(int a,int b) {
      return a+b;
  }
  %>

<%
String x = request.getParameter("x");
String y = request.getParameter("y");
int xValue = Integer.parseInt(x);
int yValue = Integer.parseInt(y);

// we can use directly like this
    int x1 = Integer.parseInt(request.getParameter("x"));
    int y1 = Integer.parseInt(request.getParameter("y"));
    out.println("addition of two numbers : "+(x1+y1));

    out.println("addition of two numbers : "+(xValue+yValue));
%>

<h1>Addition of Two Integers : <%=addTwoValues(xValue,yValue)%></h1>


<%--  JSP Objects --%>
<%-- till now we are using object in our choice in servlet page but JSP file not like that we have to below like this only if not use like this then getting error--%>

<%--  HTTPServletRequest-->  request --%>
<%--  HTTPServletResponse-->  response --%>
<%--  PrintWriter-->  out --%>
<%--  ServletConfig-->  config --%>
<%--  ServletContext-->  application --%>
<%--  HTTPSession-->  session --%>
<%--  PageContext-->  pageContext --%>
<%--  Page-->  page --%>
<%--  Exception-->  exception --%>









</body>
</html>
