<%-- 
    Document   : jsp07v02ListaNombres
    Created on : 31/01/2017, 04:27:00 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v02DeclararJSTLdeJSP.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="vLista" class="aemsa.entidad.jstl.CEListaNombre"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h3>Bucle: foreach </h3>
        <p>Los elementos en la lista son: </p>
        <p>
            <co:forEach var="vNombreActual" items="${vLista.listaNombre}">
                <b><co:out value="${vNombreActual}"/></b> <br/>
            </co:forEach>
        </p>
    </body>
</html>
