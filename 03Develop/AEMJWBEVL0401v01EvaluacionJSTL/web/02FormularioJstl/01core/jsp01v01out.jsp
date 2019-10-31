<%-- 
    Document   : jsp01v01out
    Created on : 31/01/2017, 02:49:38 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v02DeclararJSTLdeJSP.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <co:out value="Hola mundo"/>
        <br>
        <co:out value="${variableInexistente}" default="la expresión fallo"/>
        <br>
        <co:out value="${variableInexistente}">
          la expresión fallo
        </co:out>
    </body>
</html>
