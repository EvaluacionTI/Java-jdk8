    <%-- 
    Document   : jsp07v01ObjetopageContext
    Created on : 18/01/2017, 05:06:07 PM
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
            String sUsuario;
            String sPassword;
        %>

        <%
            sUsuario= (String) pageContext.getAttribute("oWebUsuario", PageContext.SESSION_SCOPE);
            sPassword= (String) pageContext.getAttribute("oWebPassword", PageContext.SESSION_SCOPE);

            out.println("Hola "+sUsuario);
            out.println("Tu clave es "+sPassword);
        %>
    </body>
</html>
