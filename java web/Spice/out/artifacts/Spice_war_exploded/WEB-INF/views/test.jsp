<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 01/12/2019
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Các gia vi chọn là:
<c:forEach item="${condiment}" var ="result">
    <li>${result}</li>
</c:forEach>
</body>
</html>
