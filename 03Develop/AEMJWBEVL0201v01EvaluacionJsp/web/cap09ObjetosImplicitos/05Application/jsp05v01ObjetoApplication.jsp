<%-- 
    Document   : jsp05v01ObjetoApplication
    Created on : 18/01/2017, 04:08:28 PM
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
        <%! 
            Integer iNumeroVeces;
        %>

        <%
            iNumeroVeces= (Integer)application.getAttribute("txtNumeroVisitas");
            if( iNumeroVeces == null || iNumeroVeces == 0 ){
                //Para la primera vistia
                iNumeroVeces = 1;
            }else{
                //Para otras visitas
                iNumeroVeces = iNumeroVeces+ 1;
            }
            application.setAttribute("txtNumeroVisitas", iNumeroVeces);
        %>
        <h3>Total del numero de veces en la página: <%= iNumeroVeces%></h3>
    </body>
</html>