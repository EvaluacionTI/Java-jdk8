<%-- 
    Document   : jsp0101DeclaraUtilizarVariable
    Created on : 09-jun-2011, 22:35:51
    Author     : AEMSA
--%>

<%--
    Formato de declaracion de un directiva
    La directiva le indica al motor JSP que realice una tarea determinada

    <%@page import="java.util" %>
    <%@include file = "" %>
    <%@taglib uri= "" %>
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    
    <body>
        <h1>Programacion JSP: DECLARAR VARIABLES!</h1>
        <h2>Formato de declaracion de una variable</h2>
        
        <%-- Etiqueta de comentario--%>
        
        <%-- Formato de declaración de una etiqueta de DECLARACIÓN --%>
        <%! int iaaaa=41;
        %>

        <%-- Formato de declaración de una expresión --%>
        <h3>Format de uso de las expresiones</h3>
        <p>Su edad es : <%=iaaaa%> </p>
        
        
    </body>
</html>
