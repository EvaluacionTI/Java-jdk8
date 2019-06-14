<%-- 
    Document   : jsp02v01IngresoSolicitud
    Created on : 12/01/2017, 05:25:08 PM
    Author     : ALEDIA
pattern="[a-zA-Z]$"  oninvalid="setCustomValidity('Por favor ingresa solo letras')" required
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssSesion09.css" rel="stylesheet"/>

        <title>..[ Formulario ]..</title>

    </head>
    <body>
        <h1 id="idTitulo">Ingreso de Solicitudes</h1>
        
        <form action="jsp08v02MostrarSolicitud.jsp" method="post">
            <table>
                <tr><td>Cliente</td>
                    <td><input type="text" name="txtCliente" maxlength="100"></td>
                </tr>
                <tr><td>Fecha Solicitud</td>
                    <td><input type="date" name="dteFechaSolicitud"></td>
                    <td>Fecha Desembolso</td>
                    <td><input type="date" name="dteFechaDesembolso"></td>
                </tr>
                <tr><td>Tipo Tasa Interés</td>
                    <td><input type="radio" name="rbTipoTasaInteres" value="Nominal">Nominal
                        <br>
                        <input type="radio" name="rbTipoTasaInteres" value="Efectiva" checked>Efectiva
                    </td>
                    <td>Tasa</td>
                    <td><input type="number" name="numTasa"></td>
                </tr>
                <tr><td>Moneda</td>
                    <td><select name="cbxMoneda">
                            <option value="S/">Soles</option>
                            <option value="US$">Dólares Americanos</option>
                            <option value="E">Euros</option>
                            <option value="R">Real</option>
                        </select></td>
                    <td>Importe</td>
                    <td><input type="text" name="txtImporte"></td>
                </tr>
                <tr><td>Comisión</td>
                    <td><input type="checkbox" name="chkComisionActivacion" value="Activacion">Activacion
                        <br>
                        <input type="checkbox" name="chkComisionCobranza" value="Cobranza">Cobranza
                    </td>
                    <td>Descripción</td>
                    <td><textarea name="txtaDescripcion" rows="10" cols="30"></textarea></td>
                </tr>
                <tr><td><input type="reset" value="Nuevo">
                    </td>
                    <td><input type="submit" value="Grabar">
                    </td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
