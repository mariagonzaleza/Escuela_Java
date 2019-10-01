<%-- 
    Document   : register
    Created on : 01-oct-2019, 15:59:14
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="register" action="users.do" method="post">
            <label for="email" > Email: </label>
            <br><input id="email" name="email" type="email" placeholder="Write your email" size="50" maxlength="255" required="required"><br/>
            <br><label for="password">Password</label><br/>
            <input id="password" name="password" type="password" placeholder="Write your password" size="50" maxlength="50" required="required"><br/>
            <br><label for="name">Name: </label>
            <br><input id="name" name="name" type="text" placeholder="Write your name" size="50" maxlength="50" required="required">
            <br> <label for="age">Age: </label>
            <br><input id="age" name="age" type="number" placeholder="Write your age" size="50" maxlength="50" required="required"><br/>
            <input type="submit" value="Register please"/>
        </form>
    </body>
</html>
