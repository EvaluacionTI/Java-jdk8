<%-- 
    Document   : jsp0104MetodoSobrecargado
    Created on : 09-jun-2011, 23:46:42
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <%! int curva(int pintGrado){
                return 10 + pintGrado;
            }
        
            int curva(int pintGrado, int pintValorCurva){
                return pintValorCurva + pintGrado;
            }
        %>
        
        <p>Metodo sobrecargado </p>
        <p>La nota ajustada es: <%=curva(80,100)%> </p>
        
        <p>Metodo normal</p>

        <p>La nota normal es: <%=curva(70)%> </p>
    </body>
</html>
