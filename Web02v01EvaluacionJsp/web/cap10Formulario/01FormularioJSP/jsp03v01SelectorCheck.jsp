<%-- 
    Document   : jsp03v01SelectorCheck
    Created on : 20/01/2017, 10:55:36 AM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssFormulario.css" rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h3 id="idTitulo">Selector ON/OFF - Checkbox</h3>
        <%!
            String lsFlag;
        %>
        <%
            if (request.getParameter("chkComisionActivacion")==null && 
                request.getParameter("chkComisionCobranza")==null){
        %>
       <form action="jsp03v01SelectorCheck.jsp" method="post">
            <table><tr>
                <td>Comisión</td>
                <td><input type="checkbox" name="chkComisionActivacion" value="Activacion">Activacion
                    <br>
                    <input type="checkbox" name="chkComisionCobranza" value="Cobranza">Cobranza
                </td></tr>
                <tr>
                    <td><input type="submit" value="Evaluar"></td>
                </tr>
            </table>
        </form>
        <%
            } else {
                out.println("Activacion : " + request.getParameter("chkComisionActivacion"));
                out.println("Cobranza : " + request.getParameter("chkComisionCobranza"));
            }
        %>
    </body>
</html>
