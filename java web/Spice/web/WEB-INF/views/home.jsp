<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 01/12/2019
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Sandwich</title>
  </head>
  <body>
   <form action="display" method="post">
     <h1> Sandwich Condiments</h1>
       <input type="checkbox" name="condiment" value="Lettuce" >Lettuce
       <input type="checkbox" name="condiment" value="Tomato" >Tomato
       <input type="checkbox" name="condiment" value="Mustard" >Mustard
       <input type="checkbox" name="condiment" value="Sprouts" >Sprouts
       <input type="checkbox" name="condiment" value="chess" >Chess </br>
     <hr>
     <input type="submit" value="save">
   </form>
  Các gia vi chọn là:
  <c:forEach items="${condiment}" var ="result">
    <li>${result}</li>
  </c:forEach>
<%--  ${condiment[0]}   ${condiment[1]}--%>
<%--   ${condiment[2]}   ${condiment[3]}--%>




  </body>
</html>
