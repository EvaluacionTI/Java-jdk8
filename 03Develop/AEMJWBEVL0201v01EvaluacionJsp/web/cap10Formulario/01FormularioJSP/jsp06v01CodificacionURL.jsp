<%-- 
    Document   : JSP06v01CodificacionURL
    Created on : 20/01/2017, 03:49:05 PM
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
        <h3 id="idTitulo">Codificación URL</h3>
        <%!
            String lsUrl, lsUrlCodificada, lsDatoEnviar;
        %>
        
        <%
            lsDatoEnviar = "cañón";
            lsUrl = "jsp06v02RecibeURL?tipo=" + lsDatoEnviar;
            lsUrlCodificada = "jsp06v02RecibeURL?tipo=" + java.net.URLEncoder.encode(lsDatoEnviar);
        %>
        
        <div><strong>
                Pulse un enlace y compruebe los parámetros en
                la barra de direcciones.
            </strong>
            <br>
            <a href="<%=lsUrl%>"/>URL sin codificar</a>
            <br>
            <a href="<%=lsUrlCodificada%>"/>URL  codificar</a>
        </div>
        
    </body>
</html>
