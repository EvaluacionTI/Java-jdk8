<%-- 
    Document   : jsp1001v01url
    Created on : 31/01/2017, 05:05:15 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v02DeclararJSTLdeJSP.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h5>Etiqueta: url - param</h5>
        <br>
         Click en el enlace para enviar el parametro :
         
         <a href="
            <co:url value="jsp1002v01param.jsp">
                <co:param name="vParametro" value="Reina Mery"></co:param>
            </co:url>
            ">Link de url</a>
    </body>
</html>
