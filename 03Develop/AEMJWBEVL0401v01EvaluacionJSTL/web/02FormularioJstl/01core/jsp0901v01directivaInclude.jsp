<%-- 
    Document   : jsp0901v01directivaInclude
    Created on : 31/01/2017, 04:43:05 PM
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
        <h5>Etiqueta: include</h5>
        <br>
        Recuerda que hace la directiva include o la acción [jsp:include]
        Pues [core:import] hace básicamente lo mismo, solo con el hecho de que esta etiqueta permite
        también incluir contenido que no esté en la misma aplicación web que estemos desarrollando.
        <br>
        <co:import url="jsp0902v01include.jsp"/>
        Contenido de: <b>jsp0901v02include.jsp</b> .....
    </body>
</html>
