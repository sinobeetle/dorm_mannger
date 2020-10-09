
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>商洛学院宿舍管理系统</title>
  <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <!--    移动设备自适应-->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>


<body style=" background: url('img/L~NN_~[ZINEQH@YUJ8YWEWX.jpg') no-repeat fixed ; background-size: 100% 100%;">
<div class="modal-dialog" action="http://www.baidu.com" style="margin-top: 10%;">
  <div class="modal-content">
    <div class="modal-header">
      <h4 class="modal-title">
        登录
      </h4>
    </div>
    <div class="modal-body">
      <form role="form" autocomplete="off" method="post" action="loginServlet" id="formlogin">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="用户名" name="username" autofocus >
        </div>
        <div class="form-group">
          <input type="password" class="form-control" placeholder="密码" name="password">
        </div>
      </form>
    </div>
    <div class="modal-footer">
      <div>
        <button type="submit" class="btn btn-primary" form="formlogin">登录</button>
      </div>
      <div>
        <button class="btn btn-default" data-toggle="modal" data-target="#regist">注册</button>
      </div>
    </div>
  </div>
</div>
<!--注册modal-->
<div class="fade modal" id="regist" aria-labelledby="registmodal" aria-hidden="true" style="margin-top: 5%">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title text-center" id="Register-title">注册</h4>
      </div>
      <div class="modal-body">
        <form role="form" action="loginServlet" method="post" autocomplete="off" id="formregist">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="请输入用户名" name="username"
                   autofocus required>
          </div>
          <div class="form-group">
            <input type="password" class="form-control" placeholder="请输入密码"
                   name="password"
                   required>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" placeholder="请输入手机号"
                   name="phone_number"
                   required>
          </div>
          <div class="form-group">
            <input type="text" class="form-control" placeholder="请输入职工号" name="id"
                   required>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-primary" form="formregist">确认注册</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>
