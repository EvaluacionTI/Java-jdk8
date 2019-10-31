<%-- 
    Document   : jsp06switch
    Created on : 31/01/2017, 04:17:55 PM
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
        <h3>Condicional: switch </h3>

       <co:set var="vEvaluar" value="50"/>
        <co:choose>
            <co:when test="${vEvaluar == 1}">
                <b>a</b> es 1.
            </co:when>
            <co:when test="${vEvaluar == 2 }">
                <b>a</b> es 2.
            </co:when>
            <co:otherwise>
                <b>a</b> tiene un valor diferente de 1 y de 2.
            </co:otherwise>
        </co:choose>        
    </body>
</html>
