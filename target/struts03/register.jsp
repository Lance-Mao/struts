<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-28
  Time: 下午3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user_register.action" method="post">
    用户名：<input type="text" name="user.username"><br>
    密码：<input type="password" name="user.password"><br>
    年龄：<input type="text" name="user.age"><br>
    生日：<input type="text" name="user.birth"><br>

    <input type="submit" value="注册">

</form>
</body>
</html>
