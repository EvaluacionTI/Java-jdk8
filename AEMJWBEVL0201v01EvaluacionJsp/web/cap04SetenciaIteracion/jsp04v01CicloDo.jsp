<%-- 
    Document   : jsp0106CiloForWhileDo
    Created on : 10-jun-2011, 5:17:42
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
        <%! int[] iaGrado={100,82,93};
                int ix=0;
        %>
       
        <h1>DO</h1>
        <table>
            <tr><td>Primero</td>
                <td>Segundo</td>
                <td>Tercero</td>
            </tr>
            <tr>
                <% ix=0;
                   do{ %>
                   <td> <%= iaGrado[ix] %></td>
                <% ix++;
                   }while(ix<3); %>
            </tr>
        </table>
        
    </body>
</html>
