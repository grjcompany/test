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
    <script language="JavaScript" src="<%=basePath%>jquery.js"></script>
    <script>
    $(function() {
    $("#login_button").click(function() {
    //使用ajax执行登录操作
    //第一个参数指要访问的服务端地址；
    //第二个参数，指要传递的表单的数据，$("#myForm").serialize()
    //第三个参数，function(data)用于接收服务端返回来的值，data
    $.post("<%=basePath%>backstage/login",
    $("#myForm").serialize(),
    function(data) {
    //根据服务端返回来的值，判断登录是否成功
    if(data.status==1){
        alert("登录成功");
        location.href="<%=basePath%>jsp/backstage/loginsuccess.jsp";
    }else{
    alert("登录失败");
        location.href="<%=basePath%>jsp/backstage/loginerror.jsp";
    }
    });
    });
    });
    </script>
</head>
<body>
<form id="myForm" method="post">
账户名：<input name="username">
密码：<input name="password">
<input id="login_button" type="button" value="登录">
</form>
<div>页面内容</div>
</body>
</html>
