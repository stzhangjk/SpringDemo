<%--
  Created by IntelliJ IDEA.
  com.stzhangjk.com.stzhangjk.springdemo.entity.User: stzhangjk
  Date: 2016.5.14
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>login</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red">${error}</font>
    </c:if>
    <form action="<c:url value="/loginCheck.html"/>" method="post">

        <input id="username" name="username" type="text" placeholder="Username" value/>
        <input id="password" name="password" type="password" placeholder="Password" value/>
        <input type="submit" value="登录"/>
        <input  type="reset" value="重置"/>
    </form>

</body>
</html>
