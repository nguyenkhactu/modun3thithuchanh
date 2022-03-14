<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 3/12/2022
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>danh sách sản phẩm</h1>


<div style="background: aliceblue">

    <form action="/">
        <a class="btn btn-primary" href="/?action=create">Tạo mới sản phẩm</a>
        <a class="btn btn-primary float-end" href="/">Danh sách sản phẩm</a>
        <a class="arrows-on-right-horizontal float-end">
            <input type="text" name="q" placeholder="search">
            <button>Search</button>
        </a>
    </form>
</div>

<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">tên sản phẩm</th>
        <th scope="col">giá sản phẩm</th>
        <th scope="col">số lượng sản phẩm</th>
        <th scope="col">màu sản phẩm</th>
        <th scope="col">mô tả sản phẩm</th>
        <th scope="col">danh muc</th>
        <th colspan="2"></th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${product}">
        <tr>
            <td>${product.id}</td>
            <td><a style="text-decoration: none" href="/?action=view&id=${product.id}">${product.name}</a></td>
            <td>${product.price}</td>
            <td>${product.quantily}</td>
            <td>${product.color}</td>
            <td>${product.description}</td>
            <td>${product.category}</td>
            <td>
                <a class="btn btn-info" href="/?action=edit&id=${product.id}">
                    <i class="fa fa-edit">sửa</i>
                </a>
            </td>
            <td><a class="btn btn-danger" href="/?action=delete&id=${product.id}"><i class="fa fa-trash">xóa</i></a>
            </td>
        </tr>
    </c:forEach>


    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
