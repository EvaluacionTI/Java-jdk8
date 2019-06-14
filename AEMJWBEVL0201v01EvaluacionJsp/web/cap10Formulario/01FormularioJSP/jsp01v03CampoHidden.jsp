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
            int liEdad;
        %>
        <h4 id="idTitulo">Campo oculto : Hidden</h4>
        <%
            if (request.getParameter("txtEdad") == null &&
                request.getParameter("btnTasa") == null){
        %>
        <form action="jsp01v03CampoHidden.jsp" method="POST">
            <label>Edad: <input name=txtEdad type=number min=0></label>
            <input type="hidden" name="btnTasa" value="13.025%">
            <input type="submit" value="Enviar">
        </form>
        <%
            } else {
                liEdad = Integer.parseInt(request.getParameter("txtEdad"));
                out.println("Edad registrada: " + liEdad);
        %>
        <br>
        Tasa Efectiva: <%=request.getParameter("btnTasa")%>
        <% } %>
    </body>
</html>
