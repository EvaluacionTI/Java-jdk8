<%-- 
    Document   : jsp01v01ObjetoRequest
    Created on : 18/01/2017, 12:28:20 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h1>Objeto Implícito : request</h1>
        <form>
            Parámetro <input type="text" name="txtParametro" value="Huawei"/>
            <input type="submit" name="txtGrabar" value="Procesar"/>
        </form>
        <br>
        <br>
        Su IP es:<%=request.getRemoteAddr()%>
        <br>
        Su Host es: <%=request.getRemoteHost()%>
        <br>
        Su Puerto es: <%=request.getRemotePort()%>
        <br>
        <%
            if (request.getParameter("txtGrabar")!= ""){
        %>
        Parámetro ingresado:<%=request.getParameter("txtParametro")%>
        <%
            }
        %>
        <br>
    </body>
</html>
