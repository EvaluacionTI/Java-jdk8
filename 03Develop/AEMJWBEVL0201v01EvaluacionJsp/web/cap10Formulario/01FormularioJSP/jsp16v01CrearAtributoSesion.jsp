<%-- 
    Document   : jsp04v01CrearAtributoSesion
    Created on : 03-jun-2013, 0:05:39
    Author     : AEMSA
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
            String lStrProducto = "Laptop";
            String lStrCodigo = "10394";
            
            session.setAttribute(lStrProducto,lStrCodigo);
         %>    
        
    </body>
</html>
