<%-- 
    Document   : jsp0105IntruccionControlIfswitch
    Created on : 09-jun-2011, 23:56:48
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
        <h1>SENTENCIAS : IF</h1>
        
        <%! int iGrado=70;%>
        
        <p>Utilizacion del IF </p>
        <%  if (iGrado > 69){%>
            <p>!Aprobado !</p>
        <%  } else{ %>
            <p> Mejor suerte la proxima vez</p>
        <%  }%>
        <br>
        </br>
        
    </body>
</html>
