<%-- 
    Document   : jsp02v02ListaTipoCartaCredito
    Created on : 06-jun-2013, 10:20:14
    Author     : background21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>

        <title>....: Banco Comercio - Comercio Exterior :....</title>
   
    </head>

    <body>
        <br>
        a) Esta pagina se ejecuta en conjunto con la definicion de ANOTACIONES directamente<br>
        b) Se ha definido un contex denominado: EvaluacionJsp<br>
        c) Luego del context se asigna el nombre Logico del Jsp a traves de las anotaciones en el programa java - servlet, que redirecciona a la pagina en su ubicación fisica.<br>
        d) Estructura: <br>
        
        "Url =  http://localhost:8084/" 
         "Context = EvaluacionJsp/"
         "Pagina Jsp: ListaTipoInstitucionFinancierAnotacion"
        
         
         e) Se puede crear un archivo index en Web Pages el cual se puede indicar que redireccione a que pagina debe redireccionar para inicia su ejecucion.
         
        <br>
        <h4 id="idTitulo">Lista de tabla-Forma2: Tipo de Institución Financiera</h4>

        <co:if test="${oLstTipoCartaCredito!=null}">
            <table border="1">
                <thead id="TituloTablaMantenimiento">
                    <tr>
                        <th>Id</th>
                        <th>Abreviatura</th>
                        <th>Descripción</th>
                        <th>Id Idioma</th>
                    </tr>
                </thead>
                <tbody id="idTablaMantenimiento">
                    <co:forEach var="mVar" items="${oLstTipoCartaCredito}">
                        <tr>
                            <td>${mVar.mid_tipo_institucion}</td>
                            <td>${mVar.mtxt_abrv}</td>
                            <td>${mVar.mtxt_desc}</td>
                            <td>${mVar.mid_idioma}</td>
                        </tr>
                    </co:forEach>
                </tbody>
            </table>

        </co:if>

    </body>
</html>
