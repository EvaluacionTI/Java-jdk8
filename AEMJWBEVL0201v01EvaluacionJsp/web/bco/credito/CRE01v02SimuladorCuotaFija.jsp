<%-- 
    Document   : jsp03v01SimuladorCuotaFija
    Created on : 07-jun-2013, 10:33:54
    Author     : background21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>

        <title>....: Banco Comercio - Préstamos :....</title>
    </head>
    <body>

        <div id="RegistroMantenimientoTabla"> <!-- Inicio de Registro Tabla Simulador -->
            <form method="GET" action="SimuladorCuotaFija">
                <table>
                    <thead>
                        <tr>
                            <td id="idTitulo" colspan="2">
                                Simulador de Maxi Préstamos / Cuota Fija
                            </td>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                            <td>Fecha Emisión</td>
                            <td><input type="text" name="txtFechaEmision" value ="${mFechaEmision}" readonly=""/></td>
                        </tr>
                        <tr>
                            <td>Base de Cálculo</td>
                            <td>
                                <select name="txtCboBaseCalculo">
                                    <co:forEach var="mVar" items="${oLstComboBaseCalculo}">
                                        <option value="${mVar.mid_base_calculo}">${mVar.mtxt_abrv}</option>
                                    </co:forEach>
                                </select>

                            </td>
                        </tr>
                        <tr>
                            <td>Moneda</td>

                            <td>
                                <co:forEach var="mVar" items="${oLstComboMoneda}">
                                    <co:if test="${mVar.mid_mon=='1'}">
                                        <input type="radio" name="txtMoneda" checked="checked" value="${mVar.mid_mon}"/>${mVar.mtxt_abrv}
                                    </co:if>

                                    <co:if test="${mVar.mid_mon!='1'}">
                                        <input type="radio" name="txtMoneda"  value="${mVar.mid_mon}"/>${mVar.mtxt_abrv}
                                    </co:if>
                                </co:forEach>
                            </td>

                        </tr>
                        <tr>
                            <td>Frecuencia</td>
                            <td>
                                <select name="txtCboFrecuencia">
                                    <co:forEach var="mVar" items="${oLstComboFrecuencia}">
                                        <option value="${mVar.mid_frecuencia}">${mVar.mtxt_desc}</option>
                                    </co:forEach>
                                </select>

                            </td>
                        </tr>
                        <tr>
                            <td>Plazo</td>
                            <td><input type="text" name="txtPlazo" value="${mPlazo}"/></td>
                        </tr>
                        <tr>
                            <td>TEA</td>
                            <td><input type="text" name="txtTea" value="${mTea}" />%</td>
                        </tr>
                        <tr>
                            <td>Monto Préstamo</td>
                            <td><input type="text" name="txtMontoPrestamo" /></td>
                        </tr>
                        <tr>
                            <td>Comisión por Portes</td>
                            <td><input type="text" name="txtMontoComisión" value ="${mMontoComisión}" readonly=""/></td>
                        </tr>
                        <tr>
                            <td>Gastos por Portes</td>
                            <td><input type="text" name="txtMontoGastos" value ="${mMontoGastos}" readonly=""/></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" name="txtGenerar" value ="Genera Cronograma"/></td>
                        </tr>                        
                    </tbody>
                </table>
            </form>

        </div> <!-- Fin de Registro Tabla Simulador -->
        
        <div> <!-- Inicio de Cronograma -->
            <table id="idTablaMantenimiento">
                <thead>
                    <tr>
                        <td colspan="9">
                            Cronograma de Pago
                        </td>
                    </tr>
                    <tr>
                        <td>N°</td>
                        <td>Fecha Inicio</td>
                        <td>Fecha Vencimiento</td>
                        <td>N° Dias</td>
                        <td>N° Dias Acumulado</td>
                        <td>Factor Normal</td>
                        <td>Factor Inversa</td>
                        <td>Cantidad de pagos por meses</td>
                        <td>Factor Doble</td>
                    </tr>
                </thead>
                <tbody>
                    
                </tbody>
                <tfoot>
                </tfoot>
            </table>
        </div> <!-- Fin de Cronograma -->
    </body>
</html>
