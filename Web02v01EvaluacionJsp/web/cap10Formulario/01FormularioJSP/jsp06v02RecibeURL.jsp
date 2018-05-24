<%-- 
    Document   : JSP06v01CodificacionURL
    Created on : 20/01/2017, 03:49:05 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssFormulario.css" rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h3 id="idTitulo">Recibe URL</h3>

        <%=request.getParameter("tipo")%>

    </body>
</html>
