<%-- 
    Document   : index
    Created on : 28-jul-2014, 13:49:06
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dispatcher</title>
    </head>
    <body>
        <h1>Formulario para el uso de Dispatcher</h1>
        <p>
            <s:form action="dispatcher">
                <s:textfield name="nombre" label="Nombre"/>
                <s:select name="lenguaje" label="Lenguaje de programación"
                          list="{'Java','PHP','.Net'}"/>
                <s:submit value="Enviar"/>
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
