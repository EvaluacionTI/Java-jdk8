<%-- 
    Document   : jsp01v03Cuerpo
    Created on : 18/01/2017, 11:29:34 AM
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
        <h6>Recibe datos de transferencia</h6>
        
        <%=request.getParameter("txtTransferencia")%>
        
    </body>
</html>
