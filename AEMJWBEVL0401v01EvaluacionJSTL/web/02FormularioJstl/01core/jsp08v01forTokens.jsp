<%-- 
    Document   : jsp07v01forTokens
    Created on : 30/01/2017, 06:46:22 PM
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
        <h5>Etiqueta: forTokens</h5>
        <co:forTokens items="Mery, Rosa, Esteban, Alexander" delims=", " var="vNombre">
            <co:out value="${vNombre}"/><br>
        </co:forTokens>
    </body>
</html>

