<%-- 
    Document   : jsp02v01RecuperarCampos
    Created on : 02-jun-2013, 22:05:59

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
        <%!
            String lsDescripcion;
        %>
        <h5 id="idTitulo">Recuperar campos con getParameter</h5>
        <%
            if (request.getParameter("maDescripcion") == null){
        %>
        <form action="jsp01v02CampoTextArea.jsp" method="POST">
            Descripción <textarea name="maDescripcion" rows="10" cols="30"></textarea>
            <input type="submit" value="Enviar">
        </form>
        <%
            } else {
                lsDescripcion = request.getParameter("maDescripcion");
                out.println("Resultado generado: " + lsDescripcion);
            }
        %>
    </body>
</html>
