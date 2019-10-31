<%-- 
    Document   : JSP02v01set
    Created on : 31/01/2017, 02:59:10 PM
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
        <h4>Asignar variable: set </h4>
        <%-- graba la variable cuatro=4 en el ámbito page --%>
        <br>
        Graba la variable creada "cuatro" en el ámbito page
        <br>
        <co:set var="cuatro" value="${2 + 2}"/>
        <co:out value="${cuatro}"/>
        <%-- equivalente al anterior pero con ámbito session --%>
        <br><p>
            Graba la variable creada "cuatro" en el ámbito session
            Forma 1:
        </p>
          <co:set var="cuatro" scope="session">
          4
        </co:set>
          <co:out value="${cuatro}"/>
          <br>
          Forma 2:
        <%-- equivalente al anterior --%>
        <co:set var="cuatro" scope="session">
          <co:out value="4"/>
        </co:set>
        <br>
          <co:out value="${cuatro}"/>
    </body>
</html>
