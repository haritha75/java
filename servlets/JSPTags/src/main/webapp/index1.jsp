<%--
  Created by IntelliJ IDEA.
  User: haritha
  Date: 19/02/24
  Time: 9:49 pm
  To change this template use File | Settings | File Templates.
--%>
<%--jsp file contains 4 tags this 4 tags use for code purpose
1) declarative tag -- it is used to declare vairable and methods --  start with <%!
2) directive tag -- it is used to import the packages -- start with <%@ page
3) scriplet tag -- it is used to write code or java code and also access the data from declarative tag -- start with<%
4) expression tag -- it used to access or print the data using declarative tag -- start with <%=
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- Delcarative Tag--%>
<%!
    int arr[] = {1,2,3,4,5};
    int a = 10;
    int b=20;
    String name = "Haritha";
    int mul(int a, int b) {
        return a * b;
    }

%>
<%-- Expression Tag here we are access values at the same time printing --%>
<%= a +" "+b +" "+mul(a,b) %>
<%= b %>
<%= name.length() %>
<h1>Sub string of string <%=name.substring(0,3)%></h1>
<h1> multiplication of two numbers <%= mul(a,b) %></h1>
<%-- scriptlet Tag--%>
<%-- printing number --%>

<%
    int n = 10;
    for(int i=1;i<=n;i++) {

        out.println(i+" ");
//      actually scriptlet tag print the data in console but we want web browser so use out object and println method.if you want jsp file data using scriptlet tag output in the web brwoser use out object
    }

%>
<h1></h1>
<%
    for(int i=0;i<a;i++) {
        out.println(i*i+" ");
//        in above we are declare variable in same tag but here we are acess the value from the declarative tag so we can access like this
    }
%>
<h1></h1>
<%
    int n1 = 15;
    int sum =0;
    for(int i=0;i<=n1;i++) {
        sum +=i;

    }
    out.println("sum ="+sum);
%>
<h1></h1>
<%-- directive tag --%>
<%@ page import =" java.time.LocalDateTime"%>
<%@ page import ="java.util.Arrays"%>
<%@ page import="java.time.LocalDate" %>
<h1>Current Time :  <%=LocalDateTime.now()%></h1>
<h1> current Date : <%=LocalDate.now()%></h1>

<%
    out.println(Arrays.toString(arr));

    int a[] = {1,2,3,4,5};
    out.println();
    for(int j=0;j<a.length;j++) {
        a[j] = a[j]+j;

    }
    out.println(Arrays.toString(a));
%>

</body>
</html>
