<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 12/1/2021
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/customers?act=create">Tạo Mới</a> <br>
<a href="/customers?act=order">Sắp xếp theo tên</a> <br>
<form action="/customers">
    <input type="text" name="key">
    <button>Tìm</button>
</form>
<form>
    <h1>Đây là danh sách</h1>
    <c:forEach var="cus" items="${dsKH}">
        <h2>${cus.id},${cus.name},${cus.age}</h2>
    </c:forEach>
</form>
</body>
</html>
