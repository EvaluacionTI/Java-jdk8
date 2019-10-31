<%-- 
    Document   : jsp0111Formulario
    Created on : 12/01/2012, 10:24:16 AM
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssFormulario.css" rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body bgcolor="#ffffcc">
        <h2 id="idTitulo">Registro de Datos en el formulario</h2>
        <%
            if (request.getParameter("txtNombre") == null && request.getParameter("txtEmail") == null) {
        %>

        <center> <h2>Registrando Información </h2>
            <form method="get" action ="jsp02v02RecuperarFormulario.jsp">
                <p>Nombre : <input type="text" name="txtName" size="26"></p>
                <p>Email : <input type="text" name="txtEmail" size="26"></p>
                <p><input type ="submit" value="Registrar"></p>
            </form>
        </center>
        <%} else {%>
        <%!        
            String lStrNombre, lStrEmail;
        %>
        <%
            lStrNombre = request.getParameter("txtNombre");
            lStrEmail = request.getParameter("txtEmail");
        %>
        <p><b>Ud. tiene la información</b></p>
        Email : <%= lStrEmail%>
        <% }%>
    </body>
</html>
