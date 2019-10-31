<%-- 
    Document   : jsp01v01InclusionPaginas
    Created on : 18/01/2017, 11:25:19 AM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="jsp01v02Cabecera.jsp"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <br>
        1. Página principal: jsp01v01InclusionPaginas.jsp
        <h1>Página de que llama la inclusion</h1>
        <br>
        2. Llama a la cabecera: jsp01v02Cabecera.jsp
        <br>
        3. Llama a cuerpo: jsp01v03Cuerpo.jsp y muestra el resultado
        <jsp:include page="jsp01v03Cuerpo.jsp">
            <jsp:param name="txtTipo" value="Procesando Información"/>
        </jsp:include>
    </body>
</html>
