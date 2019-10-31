<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="frm" uri="http://java.sun.com/jstl/fmt_rt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </head>
    <body>
        <jsp:useBean id="Fecha" class="java.util.Date"/>
        
        <h1 id="idTitulo">bean: uso de TAGLIB</h1> 
        <frm:formatDate value="${Fecha}" dateStyle="full"/>
    </body>
</html>
