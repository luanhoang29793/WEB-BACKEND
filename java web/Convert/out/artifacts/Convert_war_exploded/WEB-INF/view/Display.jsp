<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/11/2019
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert VND</title>
</head>
<body>
<form action="/convert.form" method="post">
    Nhap so tien USD
    <input type="number" name="input" value="${input}" placeholder="Input Number"/></br>
    Nhap ti gia
    <input type="number" name="rate" value="${rate}" placeholder="Input rate"/></br>
    <input type="submit" name="submit" value="Convert ">
</form>
    Result: So tien duoc doi la ${result}VND;

</body>
</html>
