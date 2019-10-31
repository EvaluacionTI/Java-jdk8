<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%! 
        int lIntNumeroAccesos=0; 
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    
    <body>
        <table>
            <tr><td>Numero</td></tr>
            <% for (int i=0;i<10;i++){%>
            
            <tr><td> <%=i%></td></tr>
            
            <% } %>
        </table>

        <%=
                "La página ha sido accedida "+(++lIntNumeroAccesos)+
                " veces desde el arranque del servidor"
        %>
    </body>
</html>
