<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>用户登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<%=basePath%>jsp/admin/css/main.css">
</head>
<body class="signin">
<form action="<%=basePath%>admin/login" method="post">
	<div class="container">
		<img alt="" src="<%=basePath%>jsp/admin/img/logo.png" width="500px" height="200px">
		<label class="title">用户登录（登录人数${requestScope.count}）</label>
		<div class="form">
			<input class="phone" type="text" name="username" placeholder="请输入您的手机号码">
			<input class="password" type="password" name="password" placeholder="请输入您的登录密码">
			<button class="btn" type="submit">登录</button>
		</div>
		<div class="ext">
			<a class="signup" href="signup.jsp">没有账号?立即注册</a>
			<a class="backpass" href="backpass.jsp">忘记密码?</a>
		</div>
	</div></form>
</body>
</html>