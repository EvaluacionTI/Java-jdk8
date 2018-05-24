<%-- 
    Document   : jsp02v01ObjetoResponse
    Created on : 18/01/2017, 12:53:08 PM
    Author     : ALEDIA
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h4>Refrescar una página cada 5 segundos</h4>
        <%
            response.setIntHeader("Refresh", 5);
            
            Calendar oCalendario = new GregorianCalendar();
            String sAmPm;
            String sHoraActual;
            
            int iHora = oCalendario.get(Calendar.HOUR);
            int iMinuto = oCalendario.get(Calendar.MINUTE);
            int iSegundo = oCalendario.get(Calendar.SECOND);

            if(oCalendario.get(Calendar.AM_PM) == 0)
                sAmPm = "AM";
             else
                sAmPm = "PM";
            
            sHoraActual = iHora + ":" + iMinuto + ":" + iSegundo + " " + sAmPm;
        %>
        Hora Actual : <%=sHoraActual%>
    </body>
</html>
