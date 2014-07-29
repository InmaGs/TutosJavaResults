<%-- 
    Document   : index
    Created on : 29-jul-2014, 11:53:49
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Headers</title>
    </head>
    <body>
        <h1>Aplicación del Result Header</h1>
        <p>En este caso no es necesario crear una clase de action, tan sólo en el código 
            de struts.xml.<br/>
            Enlace: <s:a action="httpstatus301">301 - Moved Permanently</s:a>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
