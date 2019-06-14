<%-- 
    Document   : jsp02v01ObjetoResponse
    Created on : 18/01/2017, 12:53:08 PM
    Author     : ALEDIA
--%>
<%--
    1. Establecer la propiedad session
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h4>Objeto Implícito : Session</h4>

        <form action="jsp04v02ObjectSession.jsp">
            <input type="text" name="txtNombreSession" value="Ingrese Nombre Session">
            <input type="submit" value="Pulse Click ...!">
        </form>

    </body>
</html>
