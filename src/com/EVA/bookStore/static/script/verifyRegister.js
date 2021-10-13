$(function () {
    //给注册绑定单击事件
    $("#sub_btn").click(function () {
        //验证用户名：必须由字母，数字，下划线组成，并且长度为5到12位
        //1 获取用户名输入框的内容
        var usernameText = $("#username").val();
        //2 创建验证的正则表达式
        var usernamePatt = /^\w{5,12}$/;
        //3 使用test方法验证
        if (!usernamePatt.test(usernameText)) {
            //4 提示用户结果
            //层次选择器 后代元素选择器
            $("span.errorMsg").text("用户不合法");
            return false;
        }
        $("span.errorMsg").text();

        //验证密码：必须由字母，数字，下划线组成，并且长度为5到12位
        //1 获取密码输入框的内容
        var usernameText = $("#username").val();
        //2 创建验证的正则表达式
        var usernamePatt = /^\w{5,12}$/;
        //3 使用test方法验证
        if (!usernamePatt.test(usernameText)) {
            //4 提示用户结果
            //层次选择器 后代元素选择器
            $("span.errorMsg").text("密码不合法");
            return false;
        }

        $("span.errorMsg").text();

    });
})