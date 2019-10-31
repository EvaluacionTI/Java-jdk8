<%-- 
    Document   : jsp06v01ObjetoConfig
    Created on : 18/01/2017, 04:46:44 PM
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
            String sNombreConfiguracion, sNombreContext;
        %>
        
        <%
            sNombreConfiguracion = config.getServletName();
            sNombreContext = config.getServletContext().getContextPath();
        %>
        Nombre del Servlet: <%=sNombreConfiguracion%>
        <br>
        <%
            out.println("Nombre del Context :" + sNombreContext);
        %>
    </body>
</html>
