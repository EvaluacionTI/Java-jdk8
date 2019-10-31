<%-- 
    Document   : CMX02v01RegistroImportacion
    Created on : 12-jun-2013, 17:07:01
    Author     : background21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        
        <title>....: Banco de Comercio :....</title>
    </head>
    <body>
        <form>
            <fieldset>
                <legend>Datos de la Carta de Crédito</legend>
                <div>
                    <label>Tipo de Carta Crédito :</label>
                    <input type="checkbox" name="txtTipoCarteCredito" checked="checked"/>Irrevocable
                    <input type="checkbox" name="txtTipoCarteCredito"/>Confirmada
                    <input type="checkbox" name="txtTipoCarteCredito"/>Intransferible
                </div>
                <div>
                    <label>Moneda</label>
                    <input type="radio" name="txtMoneda" checked="checked" disabled="disabled"/>S/.
                    <input type="radio" name="txtMoneda"/>US$
                    <input type="radio" name="txtMoneda"/>EUR
                </div>
                <div>
                    <label>Importe Carta Crédito</label>
                    <input type="text" name="txtMontoCartaCredito" />
                </div>
            </fieldset>            
        </form>
        <div>

        </div>
    </body>
</html>
