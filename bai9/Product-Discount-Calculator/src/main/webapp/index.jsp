<%--
  Created by IntelliJ IDEA.
  User: vieth
  Date: 11/26/2021
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:300px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<form action="/convert" method="post">
  <div class="converter">
    <h2> Product Discount Calculator</h2>
    <label>Product Description: </label><br/>
    <input type="text" name="productDescription" placeholder="Product Description" /><br/>
    <label>List Price: </label><br/>
    <input type="text" name="listPrice" placeholder="List Price" /><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discountPercent" placeholder="Discount Percent" /><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </div>
</form>
</body>
</html>