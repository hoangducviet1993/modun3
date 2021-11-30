<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 11/30/2021
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh Sách Sản Phẩm</h1>
<%--<a href="/students?action=create">Tạo Mới Sản Phẩm</a>--%>

<c:forEach items='${danhSach}' var="hocSinh">
    <h3>Mã Học Viên ${hocSinh.id},
          Tên  ${hocSinh.name},
            Điểm Toán ${hocSinh.mathScore},
            Điểm LÝ ${hocSinh.physicsScore},
            Điểm Hóa ${hocSinh.chemistryScore}
        <a href="/students?action=edit&id=${hocSinh.id}">Sửa</a>
        <a href="/students?action=delete&id=${hocSinh.id}">Xóa</a>
    </h3>
</c:forEach>

</body>
</html>
