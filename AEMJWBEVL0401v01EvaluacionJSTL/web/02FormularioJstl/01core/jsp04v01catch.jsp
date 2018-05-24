<%-- 
    Document   : jsp04v01catch
    Created on : 31/01/2017, 04:07:42 PM
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
        <h3>Remover variable: remove </h3>
        <co:catch var="vExcepcion">
            <%=3/0%>
        </co:catch>
        
        <co:if test="${vExcepcion != null }">
            Ocurrió una excepción : <co:out value="${vExcepcion}"/>
        </co:if>
    </body>
</html>
