<%-- 
    Document   : registro
    Created on : 26-sep-2019, 10:36:52
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos/estilos.jsp"/>
        <title>Registro</title>
    </head>
    <body>
       <%@include file="header.jsp" %>
       

        <form name='form1' method='post' action='./param.jsp'>            
            <table border='1'>
                <tr><td>Nombre:</td>  
                    <td><input type='text' name='nombre' id='nombre'/></td></tr>
                <tr><td>Edad:</td>  
                    <td><input type='number' name='edad' id='edad'/></td></tr>
            </table>
            <input type='submit' value='Enviar'/>             
        </form>

    </body>
</html>
