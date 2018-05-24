<%-- 
    Document   : jsp0201v01formatDate
    Created on : 31/01/2017, 06:48:12 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v01DeclararJSTL.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="vFecha" class="java.util.Date"></jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h3>Etiqueta - formatDate</h3>
        <br>
        Se está utilizando el JSTL standar
        <br>
        
        
        <br><b>1. Tipo de Fecha</b>
        <br>
        Sep 5, 2004
        <br>        
        <fm:formatDate value="${vFecha}" type="date"/>
        <br>
        5:00:30 PM
        <br>        
        <fm:formatDate value="${vFecha}" type="time"/>
        <br>
        Sep 5, 2004 5:00:30 PM
        <br>        
        <fm:formatDate value="${vFecha}" type="both"/>
        <br>        
        <br><br>
        
        <br><b>2. Estilo Fecha</b>
        <br>
        Sep 5, 2004
        <br>        
        <fm:formatDate value="${vFecha}" type="date" dateStyle="default"/>
        <br>
        9/5/04
        <br>        
        <fm:formatDate value="${vFecha}" type="date" dateStyle="short"/>
        <br>
        Sep 5, 2004
        <br>        
        <fm:formatDate value="${vFecha}" type="date" dateStyle="medium"/>
        <br>
        September 5, 2004
        <br>        
        <fm:formatDate value="${vFecha}" type="date" dateStyle="long"/>
        <br><br>
        
        <br><b>3. Estilo Hora</b>
        <br>
        5:25:33 PM
        <br>
        <fm:formatDate value="${vFecha}" type="time" timeStyle="default"/>
        <br>
        5:25 PM
        <br>        
        <fm:formatDate value="${vFecha}" type="time" timeStyle="short"/>
        <br>
        5:25:33 PM
        <br>        
        <fm:formatDate value="${vFecha}" type="time" timeStyle="medium"/>
        <br>
        5:25:33 PM CEST
        <br>        
        <fm:formatDate value="${vFecha}" type="time" timeStyle="long"/>
        <br>        
    </body>
</html>
