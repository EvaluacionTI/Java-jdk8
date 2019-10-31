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
        <h1>SENTENCIAS : SWITCH</h1>
        
        <%! int iGrado=70;%>
        
        <p>Utilizacion del Switch</p>
        <% switch (iGrado) {
                case 90: %>
                <p>Su nota final es una A</p>
        <%      break;
                case 80: %>
                <p>Su nota final es una B</p>
        <%      break;
                case 70: %>
                <p>Su nota final es una C</p>       
        <%      break;
                case 60: %>
                <p>Su nota final es una F</p>
        <%      break;
               }
        %>        
    </body>
</html>
