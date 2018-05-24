<%-- 
    Document   : jsp01v02MostrarMensaje
    Created on : 31/01/2017, 03:27:54 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v02DeclararJSTLdeJSP.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="aemsa.entidad.jstl.CEMensaje" id="vmensaje"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        
        <h5>Etiqueta: out con referencia a una clase entidad(CEMensaje)</h5>
        
        <p>1. Sin asignar ningun valor a la variable</p>
         El valor en la variable <b>texto</b> es: <br/>
        <b>&quot<co:out value="${vmensaje.msMensaje}" default="valor_nulo"/>&quot</b>

        <br>
        <p>2. Asignando valor a la variable de la clase</p>
        <jsp:setProperty name="vmensaje" property="msMensaje" value="Arrendamiento Financiero"/>
        El valor en la variable <b>texto</b> es: <br/>
            <b>&quot<co:out value="${vmensaje.msMensaje}" default="El valor es null"/>&quot</b>
    </body>
</html>