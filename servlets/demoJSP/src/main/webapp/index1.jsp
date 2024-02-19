<%--
  Created by IntelliJ IDEA.
  User: haritha
  Date: 19/02/24
  Time: 9:43 am
  To change this template use File | Settings | File Templates.
--%>
<%--jsp means java server pages it is used for to mention html,java logic in single file we can jsp file if you use html file it does allow java logic  and also
if you write html code in servlet pages it is look like difficult so use jsp file we can make easy to understand--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label>UserName</label>
<input type="text" name="name"><br>
<label>Password</label>
<input type="password" name="password"><br>
<input type="submit">
<br>
<h3>Max Value : <%=Integer.MAX_VALUE%> </h3><br>
<%--this tag is called scriplet tag it used to write java code or logic--%>
<h3>Min Value : <%=Integer.MIN_VALUE%>
</h3>
</body>
</html>
