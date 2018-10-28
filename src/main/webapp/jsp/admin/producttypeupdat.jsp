<%--
  Created by IntelliJ IDEA.
  User: S6203-1-08
  Date: 2018/10/26
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="<%=basePath%>plugins/layui/css/layui.css"  media="all">
    <%--<link href="<%=basePath%>jsp/admin/css/main.css" rel="stylesheet" type="text/css" />--%>
    <script>
        var message='${requestScope.myMessage}';
        //如果没有收到服务端发来的信息，那么就不弹出对话框
        if(message!=''){
            alert(message);
        }

    </script>
</head>
<body>
<form action="<%=basePath%>admin/doUpdateProductType" method="post">

    <input name="id" type="text" value="${requestScope.p.id}"/>
    <div class="layui-form-item">
        <div class="layui-inline">
        <label class="layui-form-label">甜品</label></label>
        <div class="layui-input-block">
            <input name="dessert" type="text" class="dfinput" value="${requestScope.p.dessert}"/><i></i></li>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
        <label class="layui-form-label">中餐</label>
        <div class="layui-input-block">
            <input name="chinese" type="text" class="dfinput" value="${requestScope.p.chinese}"/><i></i></li>
        </div>
    </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">西餐</label>
            <div class="layui-input-inline">
                <input name="west" type="text" class="dfinput" value="${requestScope.p.west}"/><i></i></li>
            </div>
        </div>
    </div>
        <div class="layui-form-item">
            <div class="layui-inline">
            <label class="layui-form-label">饮料</label>
            <div class="layui-input-inline">
                <input name="drinks" type="text" class="dfinput" value="${requestScope.p.drinks}"/><i></i></li>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">酒水</label>
            <div class="layui-input-inline">
                <input name="wine" type="text" class="dfinput" value="${requestScope.p.wine}"/><i></i></li>
            </div>
        </div>
    </div>
        <div class="layui-form-item">
            <div class="layui-inline">
            <label class="layui-form-label">凉菜</label>
            <div class="layui-input-inline">
                <input name="cold" type="text" class="dfinput" value="${requestScope.p.cold}"/><i></i></li>
              </div>
            </div>
        </div>
       <div class="layui-form-item">
         <div class="layui-inline">
            <label class="layui-form-label">鱼类</label>
            <div class="layui-input-inline">
               <input name="fish" type="text" class="dfinput" value="${requestScope.p.fish}"/><i></i></li>
            </div>
        </div>
    </div>

   <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">冰淇淋</label>
        <div class="layui-input-block">
            <input name="lce" type="text" class="dfinput" value="${requestScope.p.lce}"/><i></i></li>
        </div>
      </div>
   </div>
    <div class="layui-form-item">
       <div class="layui-inline">
        <label class="layui-form-label">茶水</label>
        <div class="layui-input-inline">
            <input name="tea" type="text" class="dfinput" value="${requestScope.p.tea}"/><i></i></li>
        </div>
       </div>
    </div>
     <div class="layui-form-item">
        <div class="layui-inline">
        <label class="layui-form-label">面食</label>
        <div class="layui-input-block">
            <input name="noodle" type="text" class="dfinput" value="${requestScope.p.noodle}"/><i></i></li>
           </div>
        </div>
     </div>

      <div class="layui-form-item">
         <div class="layui-inline">
            <div class="layui-input-block">
                <input name="" type="submit" class="btn" value="确认修改"/>
            </div>
        </div>
      </div>

<script src="<%=basePath%>plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->





<%--<form action="<%=basePath%>admin/doUpdateProductType" method="post">
    <ul class="">
        <li><label>甜品</label><input name="dessert" type="text" class="dfinput" value="${requestScope.p.dessert}"/><i></i></li>
        <li><label>中餐</label><input name="chinese" type="text" class="dfinput" value="${requestScope.p.chinese}"/><i></i></li>
        <li><label>西餐</label><input name="west" type="text" class="dfinput" value="${requestScope.p.west}"/><i></i></li>
        <li><label>饮料</label><input name="drinks" type="text" class="dfinput" value="${requestScope.p.drinks}"/><i></i></li>
        <li><label>酒水</label><input name="wine" type="text" class="dfinput" value="${requestScope.p.wine}"/><i></i></li>
        <li><label>凉菜</label><input name="cold" type="text" class="dfinput" value="${requestScope.p.cold}"/><i></i></li>
        <li><label>鱼类</label><input name="fish" type="text" class="dfinput" value="${requestScope.p.fish}"/><i></i></li>
        <li><label>冰淇淋</label><input name="lce" type="text" class="dfinput" value="${requestScope.p.lce}"/><i></i></li>
        <li><label>茶水</label><input name="tea" type="text" class="dfinput" value="${requestScope.p.tea}"/><i></i></li>
        <li><label>面食</label><input name="noodle" type="text" class="dfinput" value="${requestScope.p.noodle}"/><i></i></li>
        <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认修改"/></li>

    </ul>
</form>--%>
</body>
</html>
