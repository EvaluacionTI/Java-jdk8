<%-- 
    Proyecto        :   
    Objetivo        :   Visualizar una lista de datos con uso de taglib
    Descripcion   :   Separar la conexion de informacion a partir de controlador de informacion
                              a) Al utilizar el request declaramos un objeto en el DOM para HTML con setAttribute
                              b) En el DOM utilizamos lo que hemos recibido
--%>
<%@page import="java.util.List" %>

<%@page import="aemsa.sqlserver.entidad.CEVTAt04_Moneda"%>
<%@page import="aemsa.sqlserver.controladora.CCVTAt04_Moneda"%>

<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>

        <title>....: Evaluacion JSP :....</title>

        <%
            List<CEVTAt04_Moneda> oLista = CCVTAt04_Moneda.cargarTablaMonedaColeccion();
            request.setAttribute("oLstMonedaDOM", oLista);

            out.println(oLista);
            out.println(oLista.size());

        %>
    </head>

    <body>
        <h1 id="idTitulo">Lista de tabla Moneda</h1>

        <co:if test="${oLstMonedaDOM!=null}">
            <table id="TituloTablaMantenimiento" border ="1">
                <tr>
                    <td>Id</td>
                    <td>Abreviatura</td>
                    <td>Descripción</td>
                </tr>

                <co:forEach var="mVar" items="${oLstMonedaDOM}">
                    <tr>
                        <td>${mVar.mid_mon}</td>
                        <td>${mVar.mtxt_abrv}</td>
                        <td>${mVar.mtxt_desc}</td>
                    </tr>
                </co:forEach>
            </table>
        </co:if>

    </body>
</html>
