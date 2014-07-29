<%-- 
    Document   : index
    Created on : 28-jul-2014, 14:38:13
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redirect</title>
    </head>
    <body>
        <h1>Ejercicio de redireccionamiento</h1>
        <p>
            Se redirecciona al primer ejercicio del tutorial, dispatcher:<br/>
            <s:a action="redirect">Redireccionar</s:a>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
