<%--
  Created by IntelliJ IDEA.
  User: S6203-1-08
  Date: 2018/9/19
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=basePath%>backstage/login" method="post">
账户名：<input name="username" type="text">
密码：<input name="password" type="text">
<input type="submit" value="登录">
</form>
</body>
</html>
