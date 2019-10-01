<%-- 
    Document   : listUsers
    Created on : 01-oct-2019, 17:17:50
    Author     : alumno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sinensia.modelo.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="listaUsersBean" type="java.util.ArrayList<User>" scope="request">
    <jsp:getProperty property="*" name="usersList"></jsp:getProperty>
</jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Users List</h1>
        <table>
            <c:forEach items="${listUserBean}" var="user">
                <tr>
                    <td>$(user.id)</td>
                    <td>$(user.password)</td>
                    <td>$(user.name)</td>
                    <td>$(user.age)</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
