<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 12/9/2021
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product Management</h1>
<p><a href="/products?action=create">Create a product</a></p>
<%--<p><a href="/products?action=orderByQuantity">Order product by quantity</a></p>--%>
<p><a href="/products">Back to list</a></p>
<p>
<form method="get" action="/products">
    <input type="text" name="key">
    <button>Find by name</button>
</form>
</p>
<table border="1" cellpadding="5">
    <caption><h2>List of products</h2></caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Color</th>
        <th>CategoryId</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>View</th>
    </tr>
    <c:forEach var="i" begin="0" end="${product.size() -1}">
        <tr>
            <td>${product.get(i).id}</td>
            <td>${product.get(i).name}</td>
            <td>${product.get(i).price}</td>
            <td>${product.get(i).quantity}</td>
            <td>${product.get(i).color}</td>
            <td>${category.get(i).name}</td>
            <td><a href="/products?action=edit&id=${product.get(i).id}">Edit</a></td>
            <td><a onclick="return confirm('Are you sure?')"
                   href="/products?action=delete&id=${product.get(i).id}">Delete</a></td>
                <%--            <td><a href="" >Delete</a></td>--%>
            <td><a href="">View</a></td>
                <%--            <td><a href="/products?act=edit&id=${product.id}">Edit</a></td>--%>
                <%--            "onclick="return confirm('Are you sure?')"--%>
                <%--            href="/products?action=delete&id=${product.id}"--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
