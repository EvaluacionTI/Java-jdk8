<%-- 
    Document   : jsp03v01remove
    Created on : 31/01/2017, 03:59:31 PM
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
        <h4>Remover variable: remove </h4>
        <p>
            <!-- Creamos la variable texto con un valor String -->
            <br>1. Crear la variable
            <co:set var="vtexto" value="valor_de_la_variable"/>
            
            <br>2. Mostrar la variable
            <!-- Mostramos el valor de la variable texto -->
            El valor de la variable <b>texto</b> es : <co:out value="${vtexto}"/>
        </p>
        <p>
            <!-- removemos la variable texto -->
            <br>3. Remover la variable
            <co:remove var="vtexto" scope="page"/>
            <!-- Mostramos nuevamente el valor -->
            <br>4. Mostrar la variable
            El valor de la variable <b>texto</b> ahora es :
            <co:out value="${vtexto}" default="Es Nulo"/>
        </p>        
    </body>
</html>
