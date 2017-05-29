<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-28
  Time: 下午6:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/fileUploadAction" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="username"><br>
    文件：<input type="file" name="file1"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
