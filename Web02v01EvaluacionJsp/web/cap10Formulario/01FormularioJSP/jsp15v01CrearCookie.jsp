<%-- 
    Document   : jsp03v01CrearCookie
    Created on : 02-jun-2013, 23:33:13
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        
        <title>JSP Page</title>
        
    </head>
    
    <body>
        <h1 id="idTitulo">Crear cookie</h1>
        
        <%!
                String lStrNombreCookie = "adiaz";
                String lStrValorCookie = "152027";
                
                response.addCookie(new Cookie(lStrNombreCookie,lStrValorCookie));
        %>
        
    </body>
</html>
