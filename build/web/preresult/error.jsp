<%-- 
    Document   : error
    Created on : 29-jul-2014, 12:34:19
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PreResult</title>
    </head>
    <body>
        <h1>Caso de error</h1>
        <p>
            Lo siento, <s:property value="nombre"/>, has entrado en un lenguaje de programación
            no válido.
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
            <a href="index.jsp">Selección</a>
        </p>
    </body>
</html>
