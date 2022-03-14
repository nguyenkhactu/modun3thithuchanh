<%--
  Created by IntelliJ IDEA.
  User: quan
  Date: 04/03/2022
  Time: 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <a href="/">Danh sách sản phẩm</a>
    <h1>Cập nhật sản phẩm</h1>
    <form style="position: absolute; margin-left: 90px">
        <button type="submit" class="btn btn-primary" href="/">Back</button>
    </form>
    <form action="/?action=edit&id=${product.id}" method="post">
        <button type="submit" class="btn btn-primary">Cập nhật</button>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Tên sản phẩm:</label>
            <input type="text" class="form-control" id="exampleInputPassword1" name="name" value="${product.name}" >
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Giá sản phẩm:</label>
            <input type="text" class="form-control" id="price" name="price" value="${product.price}" >
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Giá sản phẩm:</label>
            <input type="text" class="form-control" id="quantily" name="quantily" value="${product.quantily}" >
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Giá sản phẩm:</label>
            <input type="text" class="form-control" id="color" name="color" value="${product.color}" >
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Mô tả sản phẩm:</label>
            <input type="text" class="form-control" id="description" name="description" value="${product.description}" >
        </div>
        <div class="mb-3">
            <label for="category" class="form-label">Danh mục sản phẩm:</label>
            <select class="form-control" id="category" name="category">
                <c:forEach var="category" items="${categories1}">
                <option value="${category.id}">${category.name}</option>
                </c:forEach>
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
