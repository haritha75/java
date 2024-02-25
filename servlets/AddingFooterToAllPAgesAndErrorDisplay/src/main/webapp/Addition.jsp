<%--
  Created by IntelliJ IDEA.
  User: haritha
  Date: 23/02/24
  Time: 5:15 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int addition(int a, int b) {
        return a + b;
    }
%>

<%
    Integer aValue = (Integer) pageContext.getAttribute("aVal", PageContext.SESSION_SCOPE);
    int a = aValue != null ? aValue.intValue() : 0;
    Integer bValue = (Integer) pageContext.getAttribute("bVal", PageContext.SESSION_SCOPE);
    int b = bValue != null ? bValue.intValue() : 0;
%>

<h3>Addition of two numbers <%= addition(a, b) %></h3>
<%@include file="CommonFooterForContact.html"%>

</body>
</html>
