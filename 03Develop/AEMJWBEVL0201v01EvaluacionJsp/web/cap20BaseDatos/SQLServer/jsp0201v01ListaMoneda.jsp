<%-- 
    Proyecto    :
--%>

<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.sql.Connection" %>
<%@page import= "java.sql.Statement" %>
<%@page import= "java.sql.ResultSet" %>
<%@page import = "aemsa.sqlserver.modelo.CDConexion" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../styleSheet/cssTablaMantenimiento.css" type="text/css" rel="stylesheet"/>

        <title>Lista de moneda</title>
    </head>
    <body>
        <h1 id="idTitulo">Consulta de tabla</h1>

        <%
            Connection oCxn=null;
            Statement oSt = null;
            ResultSet oRs = null;

            try{
                CDConexion oCDCxn = new CDConexion();
                oCxn = oCDCxn.getOpenSQLServer();
                
                oSt = oCxn.createStatement();
                oRs = oSt.executeQuery("SELECT * FROM VTAt04_moneda");

            }catch(SQLException exSQL){
                exSQL.getLocalizedMessage();
            }
        %>

        <table style="background-color: blue" border ="1">
            <tr id="TituloTablaMantenimiento" border ="1">
                <td>Código</td>
                <td>Abreviatura</td>
                <td>Descripción</td>
            </tr>
            <% while (oRs.next()) {
            %>
            <tr>
                <td><%out.print(oRs.getString(1));%></td>
                <td><%out.println(oRs.getString(2));%></td>
                <td><%out.println(oRs.getString(6));%></td>
            </tr>
            <% }
                oRs.close();
                oSt.close();
                oCxn.close();
            %>
        </table>
    </body>
</html>
