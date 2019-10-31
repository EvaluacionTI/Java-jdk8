<%-- 
    Document   : jsp02v01ObjetoResponse
    Created on : 18/01/2017, 12:53:08 PM
    Author     : ALEDIA
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h4>Refrescar una página cada 5 segundos</h4>
        
        <%!
            SimpleDateFormat oFormatoFecha = new SimpleDateFormat("dd 'de' MMM 'de' YYYY", new Locale("es_ES"));
            SimpleDateFormat oFormatoHora = new SimpleDateFormat("hh ':' mm ':' ss", new Locale("es_ES"));
            Date dFechaHora;
            String sFecha, sHora;
        %>
        
        <%
            dFechaHora = new Date();
            sFecha = oFormatoFecha.format(dFechaHora);
            sHora = oFormatoHora.format(dFechaHora);

            out.println("<b>La fecha actual es :" + sFecha + "<br>");
            out.println("<b>La hora actual es :" + sHora + "<br>");
            response.setHeader("Refresh", "5");

        %>

    </body>
</html>
