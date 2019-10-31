<%-- 
    Document   : jsp01v01ConversionTea
    Created on : 14-may-2013, 10:58:19
    Author     : background21
--%>

<%@page import="aemsa.logica.CLFinanciero"%>
<%@page import="aemsa.entidad.CEConversionTasa"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <div>Conversion TEA</div>
        <form method="POST" action="ConversionTEA.bco">

            <fieldset>
                <table>
                    <tr>
                        <td>Tasa Efectiva Anual (TEA) </td>
                        <td>
                            <input type="text" name="mTea" size="5" value="<%=request.getParameter("mTea") != null ? request.getParameter("mTea") : "0"%>">%
                        </td>
                    </tr>
                    <tr>
                        <td>Tasa Seguro Desgravamen (TSD) </td>
                        <td>
                            <input type="text" name="mTsd" size="5">% sólo mensual
                        </td>
                    </tr>
                    <tr>
                        <td>Tasa Derecho Admisión de Póliza (TDA) </td>
                        <td>
                            <input type="text" name="mTda" size="5">% sólo mensual
                        </td>
                    </tr>
                    <tr>
                        <td>Frecuencia </td>
                        <td>
                            <select name="mFrecuencia">
                                <option value="0">Vencimiento</option>
                                <option value="1">Diario</option>
                                <option value="2">Semanal</option>
                                <option value="3">Quincenal</option>
                                <option value="4" selected="selected">Mensual</option>
                                <option value="5">Bimensual</option>
                                <option value="6">Trimestral</option>
                                <option value="7">Cuatrimestral</option>
                                <option value="8">Semestral</option>
                                <option value="9">Anual</option>
                            </select>

                        </td>
                    </tr>
                    <tr>
                        <td>Base de Cálculo </td>
                        <td>
                            <select name="mBaseCalculo">
                                <option value="1">Base Cálculo 360/360</option>
                                <option value="2"  selected="selected">Base Cálculo 365/360</option>
                                <option value="3">Base Cálculo 360/365</option>
                                <option value="4">Base Cálculo 365/365</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Tasa Convertida </td>
                        <td>
                            <%
                                CEConversionTasa oCEFactores = new CEConversionTasa();
                                CLFinanciero oCLCalcular = new CLFinanciero();

                                int lIntFrecuencia = 0, lIntBaseCalculo = 0;
                                double lDblTea, lDblTsd, lDblTda;
                                double lDblTasaConvertida = 0;

                                lDblTea = 0;
                                lDblTsd = 0;
                                lDblTda = 0;

                                lDblTea = Double.parseDouble(request.getParameter("mTea") != null ? request.getParameter("mTea") : "0");
                                lDblTsd = Double.parseDouble(request.getParameter("mTea") != null ? request.getParameter("mTsd") : "0");
                                lDblTda = Double.parseDouble(request.getParameter("mTea") != null ? request.getParameter("mTda") : "0");
                                lIntFrecuencia = Integer.parseInt(request.getParameter("mFrecuencia") != null ? request.getParameter("mFrecuencia") : "0");
                                lIntBaseCalculo = Integer.parseInt(request.getParameter("mBaseCalculo") != null ? request.getParameter("mBaseCalculo") : "0");
                                if (lDblTea != 0 && lDblTsd != 0 && lDblTda != 0) {
                                 //   lDblTasaConvertida = oCLCalcular..conversionTeaSegurov1(lDblTea, lDblTsd, lDblTda, lIntFrecuencia, lIntBaseCalculo) * 100;
                                } else {
                               //     lDblTasaConvertida = oCLCalcular.conversionTeav1(lDblTea, lIntFrecuencia, lIntBaseCalculo) * 100;
                                }

                            %>                                
                            <%=lDblTasaConvertida%>
                        </td>
                    </tr>

                </table>
                <input type="submit" name="calcular" value="Calcular">
            </fieldset> <!-- Fin de Fieldset -->
        </form>
    </body>
</html>
