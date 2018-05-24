<%-- 
    Document   : jsp1102v01redirigida
    Created on : 31/01/2017, 05:16:47 PM
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
        <h5>Etiqueta: formatNumber</h5>
        
        El parametro enviado es : <br/>
        <b><co:out value="${param.vParametro}"/></b>
    </body>
</html>
