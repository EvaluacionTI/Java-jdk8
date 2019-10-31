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
            sUsuario=request.getParameter("txtUsuario");
            sPassword=request.getParameter("txtPassword");
            
            out.println("Usuario "+sUsuario);
            pageContext.setAttribute("oWebUsuario", sUsuario, PageContext.SESSION_SCOPE);
            pageContext.setAttribute("oWebPassword", sPassword, PageContext.SESSION_SCOPE);
        %>
        <br>
        <a href="jsp08v03MostrarpageContext.jsp">Pulsar para visualizar datos PageContext </a>
    </body>
</html>
