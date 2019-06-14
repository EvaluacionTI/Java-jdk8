<%-- 
    Document   : jsp03v02LeerCookie
    Created on : 02-jun-2013, 23:47:17
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        
        <title>JSP Page</title>

    </head>

    <body>
        <h1 id="idTitulo">Leer cookie</h1>
        
        <%!
            String lStrNombreCookie = "adiaz";
            String lStrValorCookie;
            String lStrNombre, lStrValor;
            int lIntEncontrar=0;
            
            Cookie[] oCookies = request.getCookies();
            
            for (int i=0;i<oCookies.length; i++){
                lStrNombre = oCookies[i].getName();
                lStrValor = oCookies[i].getValue();
                
                if(lStrNombreCookie.equals(oCookies[i])){
                    lIntEncontrar = 1;
                    lStrValorCookie = lStrValor;
                }
            }
            
        %>

        
        
    </body>
</html>
