<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%-- in login page we are enter the values right that value send  to one file to another file we are using pageContext object--%>

<%
    int a  = Integer.parseInt(request.getParameter("a"));
    int b  = Integer.parseInt(request.getParameter("b"));

    pageContext.setAttribute("aVal",a,PageContext.SESSION_SCOPE);
    pageContext.setAttribute("bVal",b,PageContext.SESSION_SCOPE);

%>

<form action="Addition.jsp">
    <input type="submit" value="add">
</form>
<form action="subtraction.jsp">
    <input type="submit" value="sub">
</form>
<form action="Multiplication.jsp">
    <input type="submit" value="mul">
</form>
<form action="Divison.jsp">
    <input type="submit" value="div">
</form>
<form action="Modulo.jsp">
    <input type="submit" value="mad">
</form>

</body>
</html>