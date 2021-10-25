<%@page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>会员注册页面</title>
    <base href="http://localhost:3355/onlineBookStore/">
    <link href="static/css/style.css" rel="stylesheet" type="text/css">
    <style type="text/css">
        .login_form {
            height: 420px;
            margin-top: 25px;
        }

    </style>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="static/script/verifyRegister.js"></script>
</head>
<body>
<div id="login_header">
</div>

<div class="login_banner">

    <div id="l_content">
        <span class="login_word">欢迎注册</span>
    </div>

    <div id="content">
        <div class="login_form">
            <div class="login_box">
                <div class="tit">
                    <h1>Register MemberShip</h1>
                    <span class="errorMsg"></span>
                </div>
                <div class="form">
                    <form action="register" method="post">
                        <label>用户名称：</label>
                        <input autocomplete="off" class="itxt" id="username"
                               name="username" placeholder="请输入用户名" tabindex="1" type="text"/>
                        <br/>
                        <br/>
                        <label>用户密码：</label>
                        <input autocomplete="off" class="itxt" id="password"
                               name="password" placeholder="请输入密码" tabindex="1" type="password"/>
                        <br/>
                        <br/>
                        <label>确认密码：</label>
                        <input autocomplete="off" class="itxt" id="repwd"
                               name="repwd" placeholder="确认密码" tabindex="1" type="password"/>
                        <br/>
                        <br/>
                        <label>电子邮件：</label>
                        <input autocomplete="off" class="itxt" id="email"
                               name="email" placeholder="请输入邮箱地址" tabindex="1" type="text"/>
                        <br/>
                        <br/>
                        <label>验证码：</label>
                        <input class="itxt" name="code" id="code" style="width: 150px;" type="text"/>
                        <img alt="" src="static/img/code.bmp" style="float: right; margin-right: 40px">
                        <br/>
                        <br/>
                        <input id="sub_btn" type="submit" value="注册"/>

                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
<div id="bottom">
			<span>
				Turing Book Store.Copyright &copy;2021
			</span>
</div>
</body>
</html>