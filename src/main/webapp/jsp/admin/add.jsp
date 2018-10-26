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
<h3>添加产品</h3>
<form class="form-horizontal">
  <div class="form-group">
    <label for="name" class="col-sm-2 control-label">产品名称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name">
    </div>
  </div>
  <div class="form-group">
    <label for="picture" class="col-sm-2 control-label">产品图片</label>
    <div class="col-sm-10">
      <input class="form-control" id="picture" type="file" >
    </div>
  </div>
  <div class="form-group">
    <label class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
      <img class="img-thumbnail" id="pic-view" alt="" src="#" style="width: 90px;height: 90px;">
    </div>
  </div>
  <div class="form-group">
    <label for="price" class="col-sm-2 control-label">产品价格</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="price">
    </div>
  </div>
  <div class="form-group">
    <p><label for="promotion" class="col-sm-2 control-label">促销价</label><font size="1"></font></p>
    <div class="col-sm-10">
      <select class="form-control" id="promotion">
        <option>5折</option>
        <option>6折</option>
        <option>7折</option>
        <option>8折</option>
        <option>9折</option>
        <option>10折</option>
      </select>
    </div>
  </div>


  <div class="form-group">
    <label for="num" class="col-sm-2 control-label">产品数量</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="num">
    </div>
  </div>

  <div class="form-group">
    <label for="sales" class="col-sm-2 control-label">累计销量</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="sales">
    </div>
  </div>



  <div class="form-group">
    <label for="total" class="col-sm-2 control-label">总计</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="total">
    </div>
  </div>
  <div class="form-group">
    <label for="type" class="col-sm-2 control-label">产品分类</label>

  </div>


  <div class="form-group">
    <label class="col-sm-2 control-label"></label>
    <div class="col-sm-10">
      <button class="btn"><a href="<%=basePath%>/admin/product">确认</a></button>
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
                    $('#promotion-view').attr({'src': e.target.result});
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