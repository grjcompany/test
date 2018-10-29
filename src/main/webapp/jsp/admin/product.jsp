<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <legend>产品列表</legend>
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
      <th  style="text-align: center;">id</th>
      <th  style="text-align: center;">产品名称</th>
      <th style="text-align: center;">产品图片</th>
      <th style="text-align: center;">产品价格</th>
      <th style="text-align: center;">促销价</th>
      <th style="text-align: center;">产品数量</th>
      <th style="text-align: center;">累计销量</th>
      <th style="text-align: center;">总计</th>
      <th style="text-align: center;">产品分类</th>
      <th style="text-align: center;">操作</th>
    </tr>
    </thead>


    <tbody>
    <c:forEach var="p" items="${requestScope.list}">
    <tr>
      <td style="text-align: center;">${p.id }</td>
      <td style="text-align: center;">${p.name }</td>
      <td style="text-align: center;">${p.picture }</td>
      <td style="text-align: center;">${p.price }</td>
      <td style="text-align: center;">${p.promotion }</td>
      <td style="text-align: center;">${p.num }</td>
      <td style="text-align: center;">${p.sales }</td>
      <td style="text-align: center;">${p.total }</td>
      <td style="text-align: center;">${p.productTypeId }</td>


      <td><a href="<%=basePath%>admin/toUpdateProduct?id=${p.id}"class="tablelink">修改</a ></a >
        <a href="<%=basePath%>admin/doDeleteProduct?id=${p.id}" name="delete" alt="${p.id}" class="tablelink"> 删除</a >
      </td>

    </tr></c:forEach>
  </table>


</body>
</html>