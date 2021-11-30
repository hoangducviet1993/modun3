<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 11/30/2021
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" name="id" value="${spCanXoa.id}">
    <input type="text" name="name" value="${spCanXoa.name}">
    <input type="number" name="price" value="${spCanXoa.price}">
    <br>
    <button>Xóa!!! </button>
    <br>
    <a href="/products"> Quay lại</a>
</form>
</body>
</html>
