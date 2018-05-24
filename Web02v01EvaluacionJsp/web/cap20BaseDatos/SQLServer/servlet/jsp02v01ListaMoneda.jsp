<%-- 
    Proyecto        :   EvaluacionJSP
    Objetivo        :   Visualizar una lista de datos con uso de taglib
    Descripcion     :   Separar la conexion de informacion a partir de controlador de informacion
                              a) Al utilizar el request declaramos un objeto en el DOM para HTML con setAttribute
                              b) En el DOM utilizamos lo que hemos recibido
--%>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../../styleSheet/servlet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>....: Evaluacion JSP :....</title>
    </head>

    <body>
        <h1 id="idTitulo">Lista de tabla Moneda</h1>
        
        <co:if test="${oLstMonedaDOMServlet!=null}">
            <table id="TituloTablaMantenimiento" border ="1">
                <tr>
                    <td>Id</td>
                    <td>Abreviatura</td>
                    <td>Descripción</td>
                    <td>Id Idioma</td>
                    <td>Código ISO Moneda</td>
                    <td>Id ISO Moneda</td>
                    <td>Sn Ver</td>
                    <td>Sn Actualizar</td>
                    <td>Sn Anular</td>
                    <td>Sn Eliminar</td>
                    <td>Sn Activo</td>
                    <td>Sn Default</td>
                    <td>Fecha Inicio</td>
                    <td>Fecha Término</td>
                </tr>

                <co:forEach var="mVar" items="${oLstMonedaDOMServlet}">
                    <tr>
                        <td>${mVar.mid_mon}</td>
                        <td>${mVar.mtxt_abrv}</td>
                        <td>${mVar.mtxt_desc}</td>
                        <td>${mVar.mcod_iso_idio_orgn}</td>
                        <td>${mVar.mcod_iso_mon}</td>
                        <td>${mVar.mid_iso_mon}</td>
                        <td>${mVar.msn_ver}</td>
                        <td>${mVar.msn_upd}</td>
                        <td>${mVar.msn_anu}</td>
                        <td>${mVar.msn_del}</td>
                        <td>${mVar.msn_act}</td>
                        <td>${mVar.msn_dlft}</td>
                        <td>${mVar.mfec_ini_vig}</td>
                        <td>${mVar.mfec_fin_vig}</td>
                    </tr>
                </co:forEach>
            </table>
        </co:if>

    </body>
</html>
