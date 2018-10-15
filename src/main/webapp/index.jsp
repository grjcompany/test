<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台首页页面</title>
    <link rel="stylesheet" href="<%=basePath%>plugins/bootstrap/css/bootstrap.min.css">
    <script src="<%=basePath%>plugins/jquery.js"></script>
    <script src="<%=basePath%>plugins/bootstrap/js/bootstrap.min.js"></script>
    <!--导入自定义样式文件-->
    <link rel="stylesheet" href="<%=basePath%>css/main.css">
    <link rel="stylesheet" href="<%=basePath%>css/qqq.css">
    <link rel="stylesheet" href="<%=basePath%>css/global.css">
</head>
<body>
<a href="hello">点我跳转到hello</a>
<a href="jsp/backstage/login.jsp">登录页面</a>
<div id="containerr">
    <div class="nav">
        <ul>
            <li>
                <a href="index.html">首页</a>
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
                    <a href="#">全部菜单</a>
                </li>
                <li>
                    <a href="fen1.html">甜点类</a>
                </li>
                <li>
                    <a href="fen2.html">中餐类</a>
                </li>
                <li>
                    <a href="fen3.html">西餐类</a>
                </li>
                <li>
                    <a href="fen4.html">饮料类</a>
                </li>
                <li>
                    <a href="fen5.html">酒水类</a>
                </li>
                <li>
                    <a href="#">凉菜类</a>
                </li>
                <li>
                    <a href="#">鱼类类</a>
                </li>
                <li>
                    <a href="#">冰淇淋类</a>
                </li>
                <li>
                    <a href="#">茶水类</a>
                </li>

                <li>
                    <a href="#">面食类</a>
                </li>
            </ul>
        </div>

    </div>

    <div id="healer">

        <div class="tp1">
            <div class="tl1">
                <dl>
                    <dt><img src="img/蒜蓉小龙虾.jpg" width="247px" height="210px"/></dt>
                    <dd>麻辣小龙虾<br/>
                        <ul>
                            <li class="yiyi">$50</li>
                        </ul>
                    </dd>
                </dl>

            </div>
            <ul>
                <li class="xq">
                    <a href="xq.html">详情</a>
                </li>
            </ul>
            <ul>
                <li class="jia">
                    <a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
                </li>
            </ul>
        </div>
        <div class="tp1">
            <div class="tl1">
                <dl>
                    <dt><img src="img/timg6.jpg" width="247px" height="210px"/></dt>
                    <dd>
                        <a href="#">麻辣小龙虾
                            <br/>
                            <ul>
                                <li class="yiyi">$50</li>
                            </ul>
                    </dd>
                </dl>
                <dl>
            </div>
            <ul>
                <li class="xq">
                    <a href="xq.html">详情</a>
                </li>
            </ul>
            <ul>
                <li class="jia">
                    <a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
                </li>
            </ul>
        </div>
        <div class="tp1">
            <div class="tl1">
                <dl>
                    <dt><img src="img/红烧肉.jpg" width="247px" height="210px"/></dt>
                    <dd>麻辣小龙虾<br/>
                        <ul>
                            <li class="yiyi">$50</li>
                        </ul>
                    </dd>
                </dl>
            </div>
            <ul>
                <li class="xq">
                    <a href="xq.html">详情</a>
                </li>
            </ul>
            <ul>
                <li class="jia">
                    <a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
                </li>
            </ul>
        </div>
        <div class="tp1">
            <div class="tl1">
                <dl>
                    <dt><img src="img/红烧小龙虾.jpg" width="247px" height="210px"/></dt>
                    <dd>麻辣小龙虾<br/>
                        <ul>
                            <li class="yiyi">$50</li>
                        </ul>
                    </dd>
                </dl>
            </div>
            <ul>
                <li class="xq">
                    <a href="xq.html">详情</a>
                </li>
            </ul>
            <ul>
                <li class="jia">
                    <a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
                </li>
            </ul>
        </div>
        <div class="tp1">
            <div class="tl1">
                <dl>
                    <dt><img src="img/timg7.jpg" width="247px" height="210px"/></dt>
                    <dd>麻辣小龙虾<br/>
                        <ul>
                            <li class="yiyi">$50</li>
                        </ul>
                    </dd>
                </dl>
            </div>
            <ul>
                <li class="xq">
                    <a href="xq.html">详情</a>
                </li>
            </ul>
            <ul>
                <li class="jia">
                    <a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
                </li>
            </ul>
        </div>
        <div class="tp1">
            <div class="tl1">
                <dl>
                    <dt><img src="img/th1K0K8DK4.jpg" width="247px" height="210px"/></dt>
                    <dd>麻辣小龙虾<br/>
                        <ul>
                            <li class="yiyi">$50</li>
                        </ul>
                    </dd>
                </dl>
            </div>
            <ul>
                <li class="xq">
                    <a href="xq.html">详情</a>
                </li>
            </ul>
            <ul>
                <li class="jia">
                    <a href="shopping.html"><img src="img/b796a067e769.jpg" /></a>
                </li>
            </ul>
        </div>
    </div>

    <div id="top"></div>
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
            <a href="#">
                <div class="dibuzi">新推菜品</div>
            </a>
        </div>
        <div class="anniu2">
            <a href="#">
                <div class="dibuzi">特色菜品</div>
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
