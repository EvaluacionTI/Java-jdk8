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
        <%! 
            String sWebNombreSesion;
        %>

        <%
            sWebNombreSesion = (String)session.getAttribute("txtWebSesion");
            
            out.print("Tiene el nombre de session :" + sWebNombreSesion);
        %>
    </body>
</html>
