<%-- 
    Document   : jsp0109UsoFechaJava
    Created on : 12/01/2012, 09:52:41 AM
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        
        <h1>Utilizando el paquete util para la clase fecha</h1>
        
        <% java.util.Date oFechaActual = new java.util.Date();
            out.println("Fecha Actual" + oFechaActual);
        %>
    </body>
</html>
