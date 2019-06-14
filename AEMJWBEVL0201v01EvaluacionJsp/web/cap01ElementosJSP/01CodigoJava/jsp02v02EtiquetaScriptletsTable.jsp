<%-- 
    Document   : jsp02v03EtiquetaScriptlets

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Scriptles</h1>
        <table>
            <%for(int i=0;i<10;i++){%>
            <tr><td><%=i%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
