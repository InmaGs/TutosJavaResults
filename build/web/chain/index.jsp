<%-- 
    Document   : index
    Created on : 29-jul-2014, 10:23:48
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chain</title>
    </head>
    <body>
        <h1>Resultado de una cadena de invocación de Actions.</h1>
        <p>
            En este caso no hace falta crear ninguna clase, si no que directamete
            se invoca la cadena de actions:<br/>
            <s:a action="chain">Encadenar</s:a>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
