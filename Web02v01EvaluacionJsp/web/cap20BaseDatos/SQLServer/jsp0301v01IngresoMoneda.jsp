<%-- 
    Document   : jsp0301v01IngresoMoneda
    Created on : 17-may-2017, 22:47:55
    Author     : ALDV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:.....[Módulo Comercial].....:</title>
    </head>
    <body style = "background-color:activeborder">
        <h1 style="background-color: orange">Ingreso de Moneda</h1>
        <div>
            <form id="RegistroMantenimientoTabla" action="" method="get">
                <table>
                    <tr><td>Id</td>
                        <td><input type="text" name="vId" size=5 readonly="true"></td>
                    </tr>
                    <tr><td>Abreviatura</td>
                        <td><input type="text" name="vAbreviatura" size=10 required="true" maxlength="10"></td>
                    </tr>
                    <tr><td>Descripción</td>
                        <td><input type="text" name="vDescripcion" size="50" required="true" maxlength="50"></td>
                    </tr>
                    <tr><td>Codigo Idioma</td>
                        <td><input type="text" name="vCodigoIdioma" value="ES" size="1" readonly="true"></td>
                    </tr>
                    <tr><td>Codigo ISO Moneda</td>
                        <td><input type="text" name="vCodigoIsoMoneda" size="5" required="true" maxlength="3"></td>
                    </tr>
                    <tr><td>Id ISO Moneda</td>
                        <td><input type="text" name="vIdIsoMoneda" size="5" required="true" maxlength="3"></td>
                    </tr>
                    <tr><td>Fecha Inicio Vigencia</td>
                        <td><input type="date" name="vFechaInicio" sise="10" maxlength="10"></td>
                    </tr>
                    <tr><td>Fecha Fin Vigencia</td>
                        <td><input type="date" name="vFechaTermino" sise="10" maxlength="10"></td>
                    </tr>
                    <tr><td>Posibilidad de :</td>
                        <td><input type="checkbox" name="vChkVer" checked="true">Ver<br>
                            <input type="checkbox" name="vChkUpd" >Actualizar<br>
                            <input type="checkbox" name="vChkAnu" >Anular<br>
                            <input type="checkbox" name="vChkEli" >Eliminar<br>
                            <input type="checkbox" name="vChkAct" >Activo<br>
                            <input type="checkbox" name="vChkDflt" >Defecto<br>
                        </td>
                    </tr>
                    <tr><td colspan="2" style="background-color: red"></td>
                    </tr>
                    <tr><td><input type="reset" name="vBtnNuevo" value="Nuevo"></td>
                        <td><input type="submit" name="vBtnGrabar" value="Grabar"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
