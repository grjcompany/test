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
  <base href="${pageContext.request.contextPath}/"/>
  <title>添加用户</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h3>添加餐品</h3>
<form class="form-horizontal" action="system/goods/save" method="post" enctype="multipart/form-data">

  <div class="form-group">
    <label for="name" class="col-sm-2 control-label">用户名</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="goodsName" name="goodsName">
    </div>
  </div>

  <div class="form-group">
    <label for="pic" class="col-sm-2 control-label">产品图片</label>
    <div class="col-sm-10">
      <input id="pic" type="file" name="pic">
    </div>

  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
      <img class="img-thumbnail" id="pic-view" alt="" src="#" style="width: 90px;height: 90px;">
    </div>
  </div>



  <div class="form-group">
    <label for="name" class="col-sm-2 control-label">产品价格</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="goodsPrice" name="goodsPrice" value="0">
    </div>
  </div>

  <div class="form-group">
    <label for="discount" class="col-sm-2 control-label">产品类型 </label>
    <div class="col-sm-10">
      <select class="form-control" id="goodstypeid" name="goodstype.id">
        <c:forEach var="g" items="${goodstypes }">
          <option value="${g.id }">${g.name }</option>
        </c:forEach>

      </select>
    </div>
  </div>

  <div class="form-group">
    <label for="discount" class="col-sm-2 control-label">折扣</label>
    <div class="col-sm-10">
      <select class="form-control" id="rebate" name="rebate">

        <option value="1">1.0</option>
        <option value="0.9">0.9</option>
        <option value="0.8">0.8</option>
        <option value="0.7">0.7</option>
        <option value="0.6">0.6</option>
        <option value="0.5">0.5</option>
        <option value="0.4">0.4</option>
        <option value="0.3">0.3</option>
        <option value="0.2">0.2</option>
        <option value="0.1">0.1</option>

      </select>
    </div>
  </div>

  <div class="form-group">
    <label for="detial" class="col-sm-2 control-label">销售数量</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="saleNum" name="saleNum" value="0">

    </div>
  </div>

  <div class="form-group">
    <label for="detial" class="col-sm-2 control-label">产品描述</label>
    <div class="col-sm-10">
      <textarea class="form-control" id="goodsDescripttion" name="goodsDescripttion"></textarea>
    </div>
  </div>


  <div class="form-group">
    <label class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
      <button class="btn">确认</button>
    </div>
  </div>
</form>
<script type="text/javascript">
    $(function() {
        $('#pic').change(function() {
            var files = this.files, file;
            if(files && files.length) {
                file = files[0];
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#pic-view').attr({'src': e.target.result});
                };
                reader.readAsDataURL(file);
            } else {
                $.alert("请选择图片文件");
            }
        });
    });
</script>
</body>
</html>