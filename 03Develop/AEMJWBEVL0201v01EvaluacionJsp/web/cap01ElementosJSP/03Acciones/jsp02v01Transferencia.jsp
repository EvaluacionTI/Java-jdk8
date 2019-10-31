<%-- 
    Document   : jsp02v01Transferencia
    Created on : 18/01/2017, 12:01:25 PM
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
        <h1>Transferencia</h1>
        <jsp:forward page="jsp02v02Mostrar.jsp">
            <jsp:param name="txtTransferencia" value="Transferencia de datos"/>
        </jsp:forward>
    </body>
</html>
