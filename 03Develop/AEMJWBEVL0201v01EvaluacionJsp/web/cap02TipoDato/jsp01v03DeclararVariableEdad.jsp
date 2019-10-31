<%-- 
    Document   : jsp01v03DeclararVariableEdad
    Created on : 02-jun-2013, 21:31:51
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link type="text/css" href="../styleSheet/cssWebGeneral.css" rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h1 id="idTitulo">Declarar y utilizar una variable</h1>

        <%!            int edad = 43;
        %>

        <p>La edad es de <%=edad%></p>
    </body>
</html>
