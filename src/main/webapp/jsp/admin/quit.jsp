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
	<script language="javascript">
        if (window!=top) {
            top.location.href =location.href;
        }
	</script>
</head>
<body class="signin">
<form action="<%=basePath%>admin/logout" method="post">
	<div class="container">
		<img alt="" src="img/logo.png" width="500px" height="200px">
		<label class="title">用户退出</label>
		<div class="form">
			<button class="btn" type="submit">注销</button>
		</div>
	</div></form>
</body>
</html>