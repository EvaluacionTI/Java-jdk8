<%-- 
    Document   : jsp03v01SimuladorCuotaFija
    Created on : 07-jun-2013, 10:33:54
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>

        <title>:.... Banco Comercio - Préstamos ....:</title>
    </head>
    <body>
        <h3 id="idTitulo">Simulador de Cronograma</h3>
        <!--
            Clase Servlet "CRE01v01SimuladorCuotaFija"
            
            Acction Form  "../SimuladorCuotaFijav01"
        -->
        <div id="RegistroMantenimientoTabla"> <!-- Inicio de Registro Tabla Simulador -->
            <form  method="GET" action="SimuladorCuotaFijav01">
                <input type="hidden" name="opcion" value="2"/>
                <table>
                    <thead>
                        <tr><td id="TituloTablaMantenimiento" colspan="2">
                                Simulador de Maxi Préstamos / Cuota Fija
                            </td>
                        </tr>
                    </thead>

                    <tbody>
                        <tr><td>Fecha Emisión</td>
                            <td><input type="text" name="txtFechaEmision" value ="${mFechaEmision}" /></td>
                        </tr>
                        <tr>
                            <td>Base de Cálculo</td>
                            <td><select name="txtCboBaseCalculo">
                                    <option value="360">360</option>
                                </select>
                            </td>
                        </tr>
                        <tr><td>Moneda</td>
                            <td><input type="radio" name="txtMoneda" checked="checked" value=1/>S/.
                                <input type="radio" name="txtMoneda" value=2/>US$
                                <input type="radio" name="txtMoneda" value=3/>EUR
                            </td>
                        </tr>
                        <tr><td>Frecuencia</td>
                            <td><select name="txtCboFrecuencia">
                                    <option value="30">Mensual</option>
                                </select>
                            </td>
                        </tr>
                        <tr><td>Número Meses de Periodo de Gracia</td>
                            <td><input type="text" name="txtNumeroMesesGracia" value="${mNumeroMesesGracia}"/>
                            </td>
                        </tr>                        

                        <tr><td>Impuesto General a las Ventas</td>
                            <td><input type="text" name="txtTemIGV" value="${mTemIGV}" />%</td>
                        </tr>                        
                        <tr><td>Tasa Efectiva Anual (TEA)</td>
                            <td><input type="text" name="txtTea" value="${mTea}" />%</td>
                        </tr>
                        <tr><td>Tasa Seguro Desgravamen - Mensual</td>
                            <td><input type="text" name="txtTemSD" value="${mTemSD}" />%</td>
                        </tr>
                        <tr><td>Tasa Derecho Emisión Seguro Desgravamen - Mensual</td>
                            <td><input type="text" name="txtTemDerEmiSD" value="${mTemDerEmiSD}" />%</td>
                        </tr>
                        <tr><td>Monto del Préstamo</td>
                            <td><input type="text" name="txtMontoPrestamo" /></td>
                        </tr>
                        <tr><td>Plazo</td>
                            <td><input type="text" name="txtPlazo" value="${mPlazo}"/></td>
                        </tr>

                        <tr><td>Comisión por Portes</td>
                            <td><input type="text" name="txtMontoComisión" value ="${mMontoComision}" readonly=""/></td>
                        </tr>
                        <tr><td>Gastos por Portes</td>
                            <td><input type="text" name="txtMontoGastos" value ="${mMontoGastos}" readonly=""/></td>
                        </tr>
                        <tr><td colspan="2">
                                <input type="submit" name="txtGenerar" value ="Genera Cronograma"/>
                            </td>
                        </tr>                        
                    </tbody>
                </table>
            </form>

        </div> <!-- Fin de Registro Tabla Simulador -->

        <div> <!-- Inicio de Cronograma -->
            <table id="idTablaMantenimiento">
                <thead>
                    <tr><td colspan="9">
                            Cronograma de Pago
                        </td>
                    </tr>
                    <tr><td>N°</td>
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
                    <co:forEach var="mVar" items="${mListaCronograma}">
                        <tr>
                            <td>${mVar.mNumeroCuota}</td>
                            <td>${mVar.mFechaInicio}</td>
                            <td>${mVar.mFechaVencimiento}</td>
                            <td>${mVar.mNumeroDias}</td>
                            <td>${mVar.mAcumuladoDias}</td>
                            <td>${mVar.mFactorNormal}</td>
                            <td>${mVar.mFactorInversa}</td>
                            <td>${mVar.mNumeroMesesPago}</td>
                            <td>${mVar.mFactorDoble}</td>
                        </tr>

                    </co:forEach>
                </tbody>
                <tfoot>
                    <tr><td>Total Filas</td>
                        <td><co:out value="${mVar.mNumeroCuota}"/></td>
                    </tr>
                </tfoot>
            </table>
        </div> <!-- Fin de Cronograma -->
    </body>
</html>
