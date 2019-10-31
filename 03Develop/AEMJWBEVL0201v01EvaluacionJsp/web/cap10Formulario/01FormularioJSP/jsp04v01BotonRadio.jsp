<%-- 
    Document   : jsp04v01BotonRadio
    Created on : 20/01/2017, 12:03:36 PM
    Author     : ALEDIA
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
         <h4 id="idTitulo">Botón : Radio</h4>
         <%
             if (request.getParameter("rbPreferencia")==null){
         %>
        <form action="jsp04v01BotonRadio.jsp" method="post">
            <br/>
            <input type="radio" name="rbPreferencia" value= "Analisis" checked>Analisis
            <br/>
            <input type="radio" name= "rbPreferencia" value="Procesos">Procesos
            <br/>
            <input type="radio" name= "rbPreferencia" value="Programacion">Programación
            <br/>
            <input type="radio" name= "rbPreferencia" value="Gestion">Gestión
            <br/>
            <p><input type="submit" value="Enviar"></p>
        </form>
        <% 
            } else {
                out.println("Valor seleccionado : " +request.getParameter("rbPreferencia"));
            }
        %>
    </body>
</html>
