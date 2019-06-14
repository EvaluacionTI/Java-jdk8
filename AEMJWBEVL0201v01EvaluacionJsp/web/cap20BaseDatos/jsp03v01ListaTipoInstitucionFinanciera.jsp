<%-- 
    Proyecto        :   
    Objetivo        :   Visualizar una lista de datos con uso de taglib
    Descripcion   :   Separar la conexion de informacion a partir de controlador de informacion
                              a) Al utilizar el request declaramos un objeto en el DOM para HTML con setAttribute
                              b) En el DOM utilizamos lo que hemos recibido
--%>

<%@page import="java.util.List"%>
<%@page import="aemsa.entidad.CETipoInstitucion"%>
<%@page import="aemsa.controladora.CCTipoInstitucion"  %>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>

        <title>....: Banco Comercio - Comercio Exterior :....</title>

        <%

            List<CETipoInstitucion> lista = CCTipoInstitucion.cargarTablaTipoInstitucionv1();
            request.setAttribute("oLstTipoCartaCredito", lista);

            System.out.println(CCTipoInstitucion.cargarTablaTipoInstitucionv1().size());

        %>
    </head>

    <body>
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
        <h5 id="idTitulo">Lista de tabla-Forma2: Tipo de Institución Financiera</h5>

        <co:if test="${oLstTipoCartaCredito!=null}">
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Abreviatura</th>
                        <th>Descripción</th>
                        <th>Id Idioma</th>
                    </tr>
                </thead>
                <tbody>
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
