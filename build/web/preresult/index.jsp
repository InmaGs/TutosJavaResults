<%-- 
    Document   : index
    Created on : 29-jul-2014, 12:30:40
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
        <h1>Result PreResultListener</h1>
        <p>
            Este mecanismo permite realizar algún procesamiento después de que se 
            ejecuta el Action, pero antes de que se ejecute el Result.
        </p>
        <p>
            <s:form action="presult">
                <s:textfield name="nombre" label="Nombre"/>
                <s:select name="lenguaje" label="Lenguaje de Programacion" 
                          list="{'Java','PHP','.Net'}"/>
                <s:submit value="Enviar"/>
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
