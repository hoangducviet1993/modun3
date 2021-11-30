<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 11/30/2021
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="number" name="id" value="${hsCanXoa.id}">
    <input type="text" name="name" value="${hsCanXoa.name}">
    <input type="number" name="mathScore" value="${hsCanXoa.mathScore}">
    <input type="number" name="physicsScore" value="${hsCanXoa.physicsScore}">
    <input type="number" name="chemistryScore" value="${hsCanXoa.chemistryScore}">
    <button>Xóa!!!! </button>
    <a href="/students"> Quay lại</a>
</form>
</body>
</html>
