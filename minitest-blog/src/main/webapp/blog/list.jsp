<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 12/8/2021
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="5">
    <caption><h2>List of products</h2></caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Content</th>
        <th>CategoryId</th>
<%--        <th>Edit</th>--%>
<%--        <th>Delete</th>--%>
        <%--        <th>View</th>--%>
    </tr>
    <c:forEach var="i" begin="0" end="${blog.size() -1}">
        <tr>
            <td>${blog.get(i).id}</td>
            <td>${blog.get(i).name}</td>
            <td>${blog.get(i).content}</td>
            <td>${category.get(i).name}</td>
<%--            <td><a href="/products?act=edit&id=${product.id}">Edit</a></td>--%>
<%--            <td><a href="/products?act=delete&id=${product.id}">Delete</a></td>--%>
<%--            <td> <a onclick="return confirm('Are you sure?')"--%>
<%--                    href="/products?act=delete1&id=${product.id}">delete1</a></td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
