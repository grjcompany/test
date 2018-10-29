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
<a href="<%=basePath%>admin/toLogin">后台</a>
<a href="<%=basePath%>shop/index">前台</a>
<a href="<%=basePath%>ceshi.jsp">上传图片</a>
</body>
</html>
