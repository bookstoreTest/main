<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/10/25
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 动态获取服务器地址-->
<%
    String basePath = request.getScheme()+"://"+request.getServerName()
            +":"+request.getServerPort()+request.getContextPath()+"/";
%>
<base href="<%=basePath%>">
<link href="static/css/style.css" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>