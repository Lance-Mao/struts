<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 17-5-29
  Time: 上午11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="c"%>
<html>
<head>
    <title>下载页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
</head>
<body>
<%
    request.getParameter("info");
%>
<table border="1" align="center">
    <tr>
        <td>编号</td>
        <td>文件名</td>
        <td>操作</td>
    </tr>
    <%@taglib uri=" " prefix="c" %>
    <c:forEach var="fileName" items="${fileNames}" varStatus="vs">
        <tr>
            <td>${vs.count }</td>
            <td>${fileName }</td>
            <td>
                <!-- 构建一个url -->
                <c:url var="url" value="down_down">
                    <c:param name="fileName" value="${fileName}"></c:param>
                </c:url>

                <a href="${url }">下载</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
