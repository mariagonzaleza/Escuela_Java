<%-- 
    Document   : estilos
    Created on : 26-sep-2019, 9:30:42
    Author     : alumno
--%>

<%@page contentType="text/css" pageEncoding="UTF-8"%>
.menup {
    display: inline-block;
    border: 2px solid black; 
    margin: 3px;
}
<% for (int i=0; i<10; i++){%>

    .tipo-letra-<%="tam-" + i%>{
        font-size: <%=10 + i*2 %>px; 
        font-weight: <%= i*100 %>; 
        background-color: #FF33AE<%= i*10 %> ;
    }

<% }%>
 
