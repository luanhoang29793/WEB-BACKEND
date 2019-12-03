<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/11/2019
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert USD</title>
</head>
<body>
<form action="/convert1.form" method="post">
    Nhap so tien VND
    <input type="number" name="input1" value="${input1}" placeholder="Input Number"/></br>
    Nhap ti gia
    <input type="number" name="rate1" value="${rate1}" placeholder="Input rate"/></br>
    <input type="submit" name="submit" value="Convert ">
</form>
Result: So tien duoc doi la ${result1}USD;

</body>
</html>
