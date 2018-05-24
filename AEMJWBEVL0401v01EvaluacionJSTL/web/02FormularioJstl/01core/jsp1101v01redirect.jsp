<%-- 
    Document   : jsp1101v01redirect
    Created on : 31/01/2017, 05:14:27 PM
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
        <h5>Etiqueta: redirect</h5>
        <br>
        <co:redirect url="jsp1102v01redirigida.jsp">
            <co:param name="vParametro" value="Reina Mery"/>
        </co:redirect>
    </body>
</html>
