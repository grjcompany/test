<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="<%=basePath%>plugins/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>产品分类</legend>
</fieldset>

<div class="layui-form">
    <table class="layui-table">
        <colgroup>
            <col width="150">
            <col width="150">
            <col width="200">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th>id</th>
            <th>甜品</th>
            <th>中餐</th>
            <th>西餐</th>
            <th>饮料</th>
            <th>酒水</th>
            <th>凉菜</th>
            <th>鱼类</th>
            <th>冰淇淋</th>
            <th>茶水</th>
            <th>面食</th>
            <th>编辑</th>

        </tr>
        <c:forEach var="p" items="${requestScope.list}">
        <tr>
            <th>${p.id}</th>
            <th>${p.dessert}</th>
            <th>${p.chinese}</th>
            <th>${p.west}</th>
            <th>${p.drinks}</th>
            <th>${p.wine}</th>
            <th>${p.cold}</th>
            <th>${p.fish}</th>
            <th>${p.lce}</th>
            <th>${p.tea}</th>
            <th>${p.noodle}</th>
            <td><a href="<%=basePath%>admin/toUpdateProductType?id=${p.id}"class="tablelink">修改</a>
                <a href="<%=basePath%>admin/doDeleteProductType?id=${p.id}" name="deleteProductType" alt="${p.id}" class="tablelink"> 删除</a>
            </td>
        </tr>
        </c:forEach>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>
<script src="<%=basePath%>plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
</script>
</body>
</html>

