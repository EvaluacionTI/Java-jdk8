<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import= "java.util.Date" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body BGCOLOR="ffffcc">
        <h1>Utilizando la directiva Page para importar una clave</h1>
        
        <% Date oFechaActual = new Date();
           
            String lStrFecha = oFechaActual.toGMTString();
            out.println("Fecha y Hora del Sistema : " + oFechaActual);
            
            out.println("Fecha : " + oFechaActual.getDate());
            out.println("Dia : " + oFechaActual.getDay());
            out.println("Horas : " + oFechaActual.getHours());
            
            out.println("Zona Horaria" + lStrFecha);
        %>
        
    </body>
</html>
