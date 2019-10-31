<%-- 
    Document   : jsp01v01VisualizarFecha
    Created on : 02-abr-2013, 17:40:45
    Author     : background21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body bgcolor="ffffcc">
        <h1>Fecha y Hora del sistema</h1>
        
        <%  
            java.util.Date oFecha = new java.util.Date();
        
            out.println("La fecha de hoy es "+oFecha);
        %>
    </body>
</html>
