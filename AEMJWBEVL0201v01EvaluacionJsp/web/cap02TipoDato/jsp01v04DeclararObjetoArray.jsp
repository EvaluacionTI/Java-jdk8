<%-- 
    Document   : jsp01v04DeclararObjetoArray
    Created on : 02-jun-2013, 21:38:15
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%@page import="java.util.Vector"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h1 id="idTitulo">Declarar Objetos y Arrays</h1>

        <%!            
            String name;
            String[] telefono = {"356-0652", "346-0131"};
            String oCompania = new String();
            Vector oListaDatos = new Vector();
            int[] oGrados = {5, 1, 29, 7, 6, 8};

        %>

    </body>
</html>
