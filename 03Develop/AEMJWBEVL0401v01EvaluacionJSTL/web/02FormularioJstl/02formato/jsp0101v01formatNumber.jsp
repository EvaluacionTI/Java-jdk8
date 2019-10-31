<%-- 
    Document   : jsp0101v01formatNumber
    Created on : 31/01/2017, 06:22:15 PM
    Author     : ALEDIA
--%>
<%@include file="../jsp01v02DeclararJSTLdeJSP.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h5>Etiqueta: formatNumber</h5>
        
        <br><b>1.  Tipos de valores</b>
        <br>
        <fm:formatNumber value="1234567.89" type="number"/>
        <br>
        1,234,567.89
        <br><br>
        <fm:formatNumber value="1234567.89" type="currency"/>
        <br>
        $1,234,567.89
        <br><br>
        <fm:formatNumber value="1234567.89" type="percent"/>
        <br>
        123,456,789%
        <br><br>
        
        <br><b>2. Tipos de Moneda</b>
        <br>
        <fm:formatNumber value="1234567.89" type="currency"/>
        <br>        
        $123,456,789
        <br><br>
        
        <fm:setLocale value="es"/>
        <fm:formatNumber value="1234567.89" type="currency"/>
        <br>        
        ¤123,456,789
        <br><br>
        
        <fm:formatNumber value="1234567.89" type="currency" currencySymbol="€"/>
        <br>        
        €1,234,567.89
        <br><br>
        
        <fm:formatNumber value="1234567.89" type="currency" currencyCode="EUR"/>
        <br>        
        EUR1,234,567.89
        <br><br>
        
        <fm:formatNumber value="1234567.89" type="currency" currencyCode="EUR" currencySymbol="€"/>
        <br>        
        EUR1,234,567.89
        <br><br>
        
        <br><b>3. Agrupación y número de dígitos</b>
        <br>
        <fm:formatNumber value="1234567.89" groupingUsed="true"/>
        <br>
        1,234,567.89
        <br>
        <fm:formatNumber value="1234567.89" groupingUsed="no"/>
        <br>
        1234567.89
        <br><br>
        
        <br><b>4. Número de dígitos</b>
        <br>
        <fm:formatNumber value="1234567.89" maxIntegerDigits="5"/>
        <br>
        34,567.89
        <br>
        <fm:formatNumber value="1234567.89" minIntegerDigits="10"/>
        <br>
        0,001,234,567.89
        <br>
        <fm:formatNumber value="1234567.89" maxFractionDigits="1"/>
        <br>
        1,234,567.9
        <br>
        <fm:formatNumber value="1234567.89" minFractionDigits="5"/>
        <br>
        1,234,567.89000
        <br><br>
        
        <br><b>5. Patrón</b>   
        <br>
        1.2345679E6
        <br>
        <fm:formatNumber value="1234567.89" pattern="##0.#####E0"/>
    </body>
</html>
