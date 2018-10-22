<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=basePath%>jsp/admin/signin.jsp">后台</a>
<a href="<%=basePath%>jsp/shop/index.jsp">前台</a>
</body>
</html>
