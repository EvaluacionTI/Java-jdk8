<%-- 
    Document   : jsp01v02ElementoScript
    Created on : 15-may-2013, 13:20:19
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h1>Elementos script</h1>
        <p>

            <br>
            a) De expresion
            <%
                out.println("Imprimo un texto: Elemento de Expresion");
            %>    
            <br>
        <p>b) De asignacion a variable o Scriptles</p>
        <%
            double lDblImporte = 100;
        %>

        <%=lDblImporte%>

        <br>
        <p>c) De declaracion
            <%!            private int lIntContador;
            %>
            Se ha accedio a la pagina : <%=++lIntContador%>
            <br>

    </body>
</html>
