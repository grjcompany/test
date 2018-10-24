<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>layUi后台布局</title>

		<script type="text/javascript" src="<%=basePath%>jsp/admin/js/jquery-1.11.0.js" ></script>
		<link rel="stylesheet" href="<%=basePath%>plugins/layui/css/layui.css">
	</head>

	<body class="layui-layout-body">
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header">
				<div class="layui-logo">七个人点餐系统后台管理</div>
				<!-- 头部区域（可配合layui已有的水平导航） -->
				<ul class="layui-nav layui-layout-left">
					<li class="layui-nav-item">
						<a href="">首页</a>
					</li>
					<li class="layui-nav-item">
						<a href="<%=basePath%>admin/login">账号登录</a>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">其它系统</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="">邮件管理</a>
							</dd>
							<dd>
								<a href="">消息管理</a>
							</dd>
							<dd>
								<a href="">授权管理</a>
							</dd>
						</dl>
					</li>
				</ul>
				<ul class="layui-nav layui-layout-right">
					<li class="layui-nav-item">
						<a href="javascript:;">
							<img src="http://t.cn/RCzsdCq" class="layui-nav-img">${sessionScope.admin.name}
						</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="">基本资料</a>
							</dd>
							<dd>
								<a href="">修改密码</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="<%=basePath%>admin/logout">注销</a>
					</li>
				</ul>
			</div>

			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item layui-nav-itemed">
							<a class="" href="javascript:;">产品管理</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="<%=basePath%>jsp/admin/product.jsp">添加产品</a>
								</dd>
								<dd>
									<a href="javascript:;">产品列表</a>
								</dd>
						</li>	
						<li class="layui-nav-item layui-nav-itemed">
							<a class="" href="javascript:;">订单管理</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="order.jsp">添加订单</a>
								</dd>
								<dd>
									<a href="javascript:;">订单列表</a>
								</dd>
						</li>	
						<li class="layui-nav-item layui-nav-itemed">
							<a class="" href="javascript:;">分类管理</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="table.html">添加分类</a>
								</dd>
								<dd>
									<a href="javascript:;">分类列表</a>
								</dd>
						</li>	
						<li class="layui-nav-item">
							<a href="">购物车</a>
						</li>
						<li class="layui-nav-item">
							<a href="">订单</a>
						</li>
					</ul>
				</div>
			</div>

			<div id="main_div" class="layui-body">
				<!-- 内容主体区域 -->
				<iframe id="main_frame" src="<%=basePath%>jsp/admin/main.html" width="100%" height="100%" frameborder="no"></iframe>
			</div>
			<div class="layui-footer">
				<!-- 底部固定区域 -->
				© 七个人团队- 版权所有
			</div>
		</div>
		<script src="<%=basePath%>plugins/layui/layui.js"></script>
		<script>
			//JavaScript代码区域
			layui.use('element', function() {
				var element = layui.element;
			});
			$(".layui-nav-item a").click(function(){
			   var url=$(this).attr("href");
				$("#main_frame").attr("src",url);
				return false;//不让链接事件自动生效
			});
		</script>
	</body>
</html>