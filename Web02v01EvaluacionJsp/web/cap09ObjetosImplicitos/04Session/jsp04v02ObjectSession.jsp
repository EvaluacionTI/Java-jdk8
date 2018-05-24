<%-- 
    Document   : jsp02v01ObjetoResponse
    Created on : 18/01/2017, 12:53:08 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <%!
           String sNombreSession; 
        %>
        <% 
            sNombreSession = request.getParameter("txtNombreSession").toUpperCase();

            out.println("Bienvenido a la sessión : " + sNombreSession);
            
            session.setAttribute("txtWebSesion", sNombreSession);
        %> 
        <br><a href="jsp04v03MostrarSession.jsp">Check aquí el nombre de la sesioon </a>
    </body>
</html>
