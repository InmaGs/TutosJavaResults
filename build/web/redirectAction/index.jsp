<%-- 
    Document   : index
    Created on : 29-jul-2014, 9:30:42
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RedirectAction</title>
    </head>
    <body>
        <h1>Ejemplo de redireccionamiento de un action.</h1>
        <p>
            <s:a action="redirect-action">Redireccionar</s:a>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
