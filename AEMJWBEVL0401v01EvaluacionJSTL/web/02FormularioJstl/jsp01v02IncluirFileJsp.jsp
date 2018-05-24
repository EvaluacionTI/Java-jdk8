<%-- 
    Document        : jsp01v02IncluirFileJsp
    Created on      : 15-may-2013, 12:36:57
    Author          : aldv
    Descripction    : Importar las librerias JSTL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jsp01v01DeclararJSTL.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssWebGeneral.css"  rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
         <h3 id="idTitulo">Etiquetas JSTL</h3>
         <br>
         Importando archivo con la declaración de etiquetas JSTL.
         <br>
         Mostrar mensaje con la etiqueta co de core
        <co:out value="Incluir archivos JSP" />
    </body>
</html>
