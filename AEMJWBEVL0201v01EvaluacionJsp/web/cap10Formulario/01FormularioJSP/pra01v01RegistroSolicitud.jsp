<%-- 
    Document   : pra01v01RegistroSolicitud
    Created on : 19/01/2017, 03:55:41 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h2 id="idTitulo">Registro de Solicitud</h2>
        
        <form action="pra01v02MostrarSolicitud" method="POST">
            <table id="RegistroMantenimientoTabla">
                <tr>
                    <td>N° Solicitud</td>
                    <td><input contenteditable="true" type="text" name="txtRUC" size="10"></td>
                </tr>
                
                <tr>
                    <td>Ruc</td>
                    <td><input type="text" name="txtRUC" size="10"></td>
                    <td>Cliente</td>
                    <td><input type="text" name="txtCliente" value ="EMPRESA DE TRANSPORTES Y TURISMO BARRANCA S.A" size=50 readonly="readonly"></td>
                </tr>
                <tr>
                    <td>Funcionario</td>
                    <td colspan="3">
                        <select name="cboFuncionario">
                            <option value="AV">ORPAS CORREDORES DE SEGUROS S.R.L.</option>
                            <option value="AW">PERALES BOTTERI S.A PEBOSA AGENTES CORREDORES DE SEGUROS</option>
                            <option value="AX">CORREDORES DE SEGUROS SANTA CRUZ S.R.L.</option>
                            <option value="AY">KOSMOS CORREDORES DE SEGUROS S.A.C.</option>
                            <option value="AZ">CORREDORES DE SEGUROS MONTERRICO S.R.L.</option>
                            <option value="BA">MARTHANS ASOCIADOS S.R.L. CORREDORES DE SEGUROS </option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Aseguradora</td>
                    <td colspan="2">
                        <select name="cboAseguradora">
                            <option value="02">RIMAC INTERNACIONAL</option>
                            <option value="03">PACIFICO SEGUROS</option>
                            <option value="06">LA POSITIVA SEGUROS Y REASEGUROS</option>
                            <option value="12">MAPFRE PERU</option>
                            <option value="15">INTERSEGUROS</option>
                            <option value="20">ACE SEGUROS</option>
                        </select>
                    </td>
                </tr>                
                <tr>
                    <td>Fecha Solicitud</td>
                    <td><input type="date" name="dFecha"></td>
                    <td>Tipo de Cambio</td>
                    <td><input type="text" name="txtTipoCambio" value="3.4259" size="10" maxlength="12" ></td>
                </tr>
                <tr>
                    <td>Comisión de Activación</td>
                    <td><input type="checkbox" name="chkCmsActivacion" checked="checked"></td>
                    <td>Comisión de Cobranza</td>
                    <td><input type="checkbox" name="chkCmsCobranza"></td>
                </tr>
                <tr>
                    <td>Moneda</td>
                    <td><input type="radio" name="rbMoneda" value="S/" checked="checked">S/
                        <input type="radio" name="rbMoneda" value="US$">US$
                    </td>
                    <td>Importe</td>
                    <td><input type="text" name="txtImporte" size="10"></td>
                </tr>
                <tr>
                    <td>Descripcion</td>
                    <td colspan="3"><textarea name="txtDescripcion" rows="7" cols="70"></textarea>
                    </td>
                </tr>

                <tr><td><input type="reset" name="btnNuevo" value="Nuevo">
                    </td>
                    <td><input type="submit" name="btnGrabar" value="Adicionar">
                    </td>
                    <td><input type="submit" name="btnMostrar" value="Mostrar">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
