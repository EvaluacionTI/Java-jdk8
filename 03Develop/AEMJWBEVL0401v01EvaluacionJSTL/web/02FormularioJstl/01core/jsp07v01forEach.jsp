<%-- 
    Document   : jsp01v01ContadorNumeros
    Created on : 30/01/2017, 06:30:12 PM
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
        <h3>Bucle: forEach </h3>
        <co:forEach var="i" begin="1" end="17">
            Contador <co:out value="${i}"></co:out><br>
        </co:forEach>
            <br>
            <br>
        <co:forEach var="i" begin="1" end="17">
            Contador <co:out value="${i}"/><br>
        </co:forEach>
            
    </body>
</html>
