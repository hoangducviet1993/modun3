<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 11/30/2021
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="text" name="id" value="${hsCanSua.id}">
    <input type="text" name="name" value="${hsCanSua.name}">
    <input type="text" name="mathScore" value="${hsCanSua.mathScore}">
    <input type="text" name="physicsScore" value="${hsCanSua.physicsScore}">
    <input type="text" name="chemistryScore" value="${hsCanSua.chemistryScore}">
    <button>Sửa!!!! </button>
    <a href="/students"> Quay lại</a>
</form>
</body>
</html>
