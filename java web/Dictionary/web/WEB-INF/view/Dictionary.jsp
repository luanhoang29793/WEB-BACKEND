<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/11/2019
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="/translate.form" method="post">
    Input text
    <input type="text" name="text" value="${text}"  placeholder="Input text">
</br>
    <input type="submit" name="submit" value="Search"/>
</form></br>
Result: ${text} ${result};
</body>
</html>
