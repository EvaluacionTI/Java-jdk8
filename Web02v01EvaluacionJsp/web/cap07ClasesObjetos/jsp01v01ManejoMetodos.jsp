<%-- 
    Document   : jsp0103ManejoMetodos
    Created on : 09-jun-2011, 23:25:38
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
        <h1>Uso y Manejo de Metodos        </h1>
        
        <%! 
            double curva(int pintGrado){
                
            return (10 + pintGrado);
            }
        %>
        
        <p>Nota ajustada es : <%=curva(80)%></p>
    </body>
</html>
