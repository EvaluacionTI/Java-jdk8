<%-- 
    Document   : jsp02v01RecuperarCampos
    Created on : 02-jun-2013, 22:05:59

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h1>Recuperar campos con getParameter</h1>
        Nombre <input type="text" name="mNombre" />
        <%!
            String lStrNombre;

         %>
         <%
             lStrNombre = request.getParameter("mNombre");
             out.println(lStrNombre);
         %>
<
    </body>
</html>
