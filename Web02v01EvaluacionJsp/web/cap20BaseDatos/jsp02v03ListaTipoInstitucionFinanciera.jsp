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
        a) Esta pagina se ejecuta en conjunto con la definicion en web.xml<br>
        b) Se ha definido un contex denominado: EvaluacionJsp<br>
        c) Luego del context se asigna el nombre Logico del Jsp a traves del web, que redirecciona a la pagina en su ubicación fisica.<br>
        d) Estructura: <br>
        
        "Url =  http://localhost:8084/" 
         "Context = EvaluacionJsp/"
         "Pagina Jsp: ListaTipoInstitucionFinanciera"
        
        <h5 id="idTitulo">Lista de tabla - Forma 1: Tipo de Institución Financiera</h5>

        <co:if test="${oLstTipoCartaCredito!=null}">
            <table id="TituloTablaMantenimiento" border ="1">
                <tr>
                    <td>Id</td>
                    <td>Abreviatura</td>
                    <td>Descripción</td>
                    <td>Id Idioma</td>
                </tr>

                <co:forEach var="mVar" items="${oLstTipoCartaCredito}">
                    <tr>
                        <td>${mVar.mid_tipo_institucion}</td>
                        <td>${mVar.mtxt_abrv}</td>
                        <td>${mVar.mtxt_desc}</td>
                        <td>${mVar.mid_idioma}</td>
                    </tr>
                </co:forEach>
            </table>
        </co:if>

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
