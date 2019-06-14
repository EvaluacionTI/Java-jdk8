<%-- 
    Document   : jsp02v01RecuperarCampos
    Created on : 02-jun-2013, 22:05:59
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

    <body>
        <h1 id="idTitulo">Recuperar campos con getParameter</h1>
        <%
                if (request.getParameter("mNombre")==null){
         %>
        <div>
            <form action="jsp02v01EnviarDatosSubmit.jsp" method="GET" >
                Nombre <input type="text" name="mNombre" />
                <input type="submit" value ="Enviar"/>
            </form>
        </div>
        <%} else { %>         
        <%!
            String lStrNombre;
         %>
        <%
             lStrNombre = request.getParameter("mNombre");
         %>
         <p>La informacion recuperada de JSP  es : <%=lStrNombre%></p>
         <% } %>
    </body>
</html>