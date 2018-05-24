<%-- 
    Document   : jsp02v02EtiquetaDeclaracion
    Created on : 02-jun-2013, 21:20:40
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>..... [ Evaluación JSP ] .....</title>
    </head>
    <body>
        <h1>Elementos JSP : Declaración</h1>
        <%!
            int iNumeroAcceso=0;
         %>
         <%=
                 "Pagina accedida " + (++iNumeroAcceso) + 
                 " veces desde el arranque del Servidor"
          %>
    </body>
</html>
