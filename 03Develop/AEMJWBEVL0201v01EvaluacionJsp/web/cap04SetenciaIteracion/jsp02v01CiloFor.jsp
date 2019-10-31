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
        <H3>FOR</h3>
        <table>
            <tr><td>Primero</td>
                <td>Segundo</td>
                <td>Tercero</td>
            </tr>
            <tr>
                <% for (int i=0;i<3; i++){ %>
                    <td> <%=iaGrado[i] %></td>
                <% }%>
            </tr>
        </table>
        
    </body>
</html>
