<%-- 
    Document   : inicio
    Created on : 09/07/2017, 12:37:02 AM
    Author     : ALDV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="plantilla" tagdir="/WEB-INF/tags/portal/"%>

<co:set var="vContenidoBody">
    <h1>Evaluación JSTL</h1>
</co:set>

<plantilla:portal vTituloAplicacion="Evaluación JSTL" vPathCSS="portal/css0101v01DefinirTag.css">
    <jsp:body>
        {vContenidoBody}
    </jsp:body>
</plantilla:portal>
