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
					<img src="<%=basePath%>jsp/shop/img/logo.png" />
					<li>
						<a href="<%=basePath%>shop/index">首页</a>
					</li>
					<li>
						<a href="<%=basePath%>jsp/shop/jieshao.html">餐厅介绍</a>
					</li>
					<li>
						<a href="<%=basePath%>jsp/shop/signin1.html">开台</a>
					</li>
				</ul>
			</div>


			<div id="you">
				<div class="nan">

			<ul>
				<li>
					<a href="<%=basePath%>jsp/shop/fen.html"><img src="<%=basePath%>jsp/shop/img/zwt.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;全部菜单</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen1.html"><img src="<%=basePath%>jsp/shop/img/zwt1.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;甜点类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen2.html"><img src="<%=basePath%>jsp/shop/img/zwt2.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;中餐类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen3.html"><img src="<%=basePath%>jsp/shop/img/zwt.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;西餐类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen4.html"><img src="<%=basePath%>jsp/shop/img/zwt3.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;饮料类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen5.html"><img src="<%=basePath%>jsp/shop/img/zwt4.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;酒水类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen6.html"><img src="<%=basePath%>jsp/shop/img/zwt5.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;凉菜类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen7.html"><img src="<%=basePath%>jsp/shop/img/zwt6.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;鱼类类</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen8.html"><img src="<%=basePath%>jsp/shop/img/zwt7.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;冰淇淋</a>
				</li>
				<li>
					<a href="<%=basePath%>jsp/shop/fen9.html"><img src="<%=basePath%>jsp/shop/img/zwt8.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;茶水类</a>
				</li>

				<li>
					<a href="<%=basePath%>jsp/shop/fen10.html"><img src="<%=basePath%>jsp/shop/img/zwt9.png" width="20px" height="20px" />&nbsp;&nbsp;&nbsp;&nbsp;面食类</a>
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

                                    <img src="<%=basePath%>${p.picture }" >
                                    <div class="box-content">
                                        <span class="post">${p.total }</span>
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
						<a href="<%=basePath%>jsp/shop/xq.html">
							<font color="#FFFFFF">详情</font>
						</a>
					</li>
				</ul>
				<ul>
					<li class="jia">
						<a href="<%=basePath%>jsp/shop/shopping.html"><img src="<%=basePath%>jsp/shop/img/b796a067e769.jpg" /></a>
					</li>
				</ul>
			</div></c:forEach>
	</div>




	<ul class="pagination">
		<li>
			<a href="" onclick="">«</a>
		</li>
		<c:forEach var="index" begin="1"  end="${requestScope.maxPage}" step="1">
		<li>
			<a href="<%=basePath%>shop/index?page=${index}">${index}</a>
		</li>
		</c:forEach>
		<li>
			<a href="#">»</a>
		</li>
	</ul>

	<div id="top2">
		<div class="anniu6">
			<a href="<%=basePath%>jsp/shop/shopping.html">
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
			<a href="<%=basePath%>jsp/shop/zeng.html">
				<div class="dibuzi">折扣商品</div>
			</a>
		</div>
		<div class="anniu2">
			<a href="<%=basePath%>jsp/shop/enen.html">
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