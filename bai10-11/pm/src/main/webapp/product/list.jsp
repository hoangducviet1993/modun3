<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 11/30/2021
  Time: 8:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh Sách Sản Phẩm</h1>
<a href="/products?action=create">Tạo Mới Sản Phẩm</a>

<c:forEach items='${danhSach}' var="sanPham">
    <h3>${sanPham.id},${sanPham.name},${sanPham.price}
        <a href="/products?action=edit&id=${sanPham.id}">Sửa</a>
        <a href="/products?action=delete&id=${sanPham.id}">Xóa</a>
    </h3>
</c:forEach>

</body>
</html>
