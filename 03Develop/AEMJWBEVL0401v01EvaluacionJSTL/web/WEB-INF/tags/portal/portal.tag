<%-- 
    Document   : portal
    Created on : 09/07/2017, 12:44:02 AM
    Author     : ALDV
--%>

<%@tag description="Plantilla de uso de tag" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="vTituloAplicacion" required="true" rtexprvalue="true"%>
<%@attribute name="vPathCSS"%>
<%@attribute name="message"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <title>${vTituloAplicacion}</title>
        <link type="text/css" rel="stylesheet" href="css/${vPathCSS}"
    </head>
    <body>
        <header></header>
        <main></main>
    </body>
</html>
<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>



