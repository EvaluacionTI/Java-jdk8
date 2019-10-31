<%-- 
    Document   : jsp05if
    Created on : 31/01/2017, 04:12:39 PM
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
        <h3>Condicional: if </h3>
        
        <co:set var="vEvaluar" value="120"/>

        <co:if test="${vEvaluar > 100}">
            La variable 
            <co:out value="${vEvaluar}"/>
            <b></b> es <b>mayor</b> que 100.
        </co:if>

        <co:if test="${vEvaluar < 100 }">
            La variable 
            <co:out value="${vEvaluar}"/>
            <b></b> es <b>menor</b> que 100.
        </co:if>

    </body>
</html>
