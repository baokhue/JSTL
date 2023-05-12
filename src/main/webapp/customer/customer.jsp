<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Thu Nguyen
  Date: 5/10/2023
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A</title>
</head>
<body>
<form action="/list">
    <h1>Customer List</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Date of birth</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        <c:forEach items="${customers}" var="cst" >
            <tr>
                <td>${cst.name}</td>
                <td>${cst.birthday}</td>
                <td>${cst.address}</td>
                <td style="">
                    <img src="${cst.image}" alt="anh" width="100px" height="auto">
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
