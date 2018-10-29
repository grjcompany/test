<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8" />
	<title></title>
	<link rel="stylesheet" href="<%=basePath%>plugins/bootstrap/css/bootstrap.min.css">
	<script src="<%=basePath%>plugins/bootstrap/jquery.min.js"></script>
	<script src="<%=basePath%>plugins/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="<%=basePath%>jsp/shop/css/qqq.css" type="text/css" />
	<link rel="stylesheet" href="<%=basePath%>jsp/shop/css/global.css" type="text/css" />

	</head>

	<body>

		<div id="containerr">
			<!--	<img src="img/ipad.png" width="1000px" height="730px" />-->

			<div class="nav">

				<ul>
					<img src="img/logo.png" />
					<li>
						<a href="index.jsp">首页</a>
					</li>
					<li>
						<a href="jieshao.html">餐厅介绍</a>
					</li>
					<li>
						<a href="#">开台</a>
					</li>
				</ul>
			</div>


			<div id="you">
				<div class="nan">

			<ul>
				<li>
					<a href="fen.jsp"><img src="img/llll.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;全部菜单</a>
				</li>
				<li>
					<a href="fen1.html"><img src="img/甜点-1.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;甜点类</a>
				</li>
				<li>
					<a href="fen2.html"><img src="img/中餐(1).png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;中餐类</a>
				</li>
				<li>
					<a href="fen3.html"><img src="img/餐品会-西餐.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;西餐类</a>
				</li>
				<li>
					<a href="fen4.html"><img src="img/饮料-2.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;饮料类</a>
				</li>
				<li>
					<a href="fen5.html"><img src="img/酒水收入.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;酒水类</a>
				</li>
				<li>
					<a href="fen6.html"><img src="img/llll.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;凉菜类</a>
				</li>
				<li>
					<a href="fen7.html"><img src="img/鱼-1.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;鱼类类</a>
				</li>
				<li>
					<a href="fen8.html"><img src="img/冰淇淋.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;冰淇淋</a>
				</li>
				<li>
					<a href="fen9.html"><img src="img/茶水饮料.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;茶水类</a>
				</li>

				<li>
					<a href="fen10.html"><img src="img/面食.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;面食类</a>
				</li>
			</ul>
		</div>

			</div>

	<div id="healer">
		<c:forEach var="p" items="${requestScope.newProduct}">
			<div class="tp1">

					<div class="tl1">

                        <dl>
                            <dt>
                                <div class="box">
                                    <img src="img/x2.jpg" >
                                    <div class="box-content">
                                        <span class="post">五香加八大味共计十三种香料，而是多种乃至几十种香料的结合。口感丰富有层次，有营养</span>
                                    </div>
                                </div>
                            </dt>
                            <dd>${p.name}<br/>
                                <ul>
                                    <li class="yiyi">${p.price }</li>
                                </ul>
                            </dd>
                        </dl>

				</div>
				<ul>
					<li class="xq">
						<a href="xq.html">
							<font color="#FFFFFF">详情</font>
						</a>
					</li>
				</ul>
				<ul>
					<li class="jia">
						<a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
					</li>
				</ul>
			</div></c:forEach>
	</div>




	<ul class="pagination">
		<li>
			<a href="" onclick="">«</a>
		</li>
		<li>
			<a href="">1</a>
		</li>
		<li>
			<a href="">1</a>
		</li>
		<li>
			<a href="">1</a>
		</li>
		<li>
			<a href="">1</a>
		</li>
		<li>
			<a href="">1</a>
		</li>
		<li>
			<a href="">1</a>
		</li>
		<li>
			<a href="#">»</a>
		</li>
	</ul>

	<div id="top2">
		<div class="anniu6">
			<a href="shopping.html">
				<div class="dibuzi">我的菜单</div>
			</a>
		</div>
		<div class="anniu5">
			<a href="#">
				<div class="dibuzi">下一页</div>
			</a>
		</div>
		<div class="anniu4">
			<a href="#">
				<div class="dibuzi">上一页</div>
			</a>
		</div>
		<div class="anniu3">
			<a href="zeng.html">
				<div class="dibuzi">折扣商品</div>
			</a>
		</div>
		<div class="anniu2">
			<a href="#">
				<div class="dibuzi">今日推荐</div>
			</a>
		</div>
		<!--1-->
		<div class="anniu1">
			<a href="#">
				<div class="dibuzi">返回</div>
			</a>
		</div>

			</div>
		</div>
	</body>

</html>