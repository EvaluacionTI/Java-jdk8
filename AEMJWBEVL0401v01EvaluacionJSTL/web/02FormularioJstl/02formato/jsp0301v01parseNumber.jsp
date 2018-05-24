<%-- 
    Document   : jsp0301v01parseNumber
    Created on : 31/01/2017, 07:08:53 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v01DeclararJSTL.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="oFecha" class="java.util.Date"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h3>Etiqueta - parseNumber</h3>
        
    <fm:formatNumber value="${oFecha.time}"></fm:formatNumber>
    </body>
</html>
