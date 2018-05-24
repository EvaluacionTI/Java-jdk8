<%-- 
    Proyecto        :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.sql.Connection" %>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page import = "aemsa.modelo.CDConexion" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>

        <title>Lista de moneda</title>
    </head>
    <body>
        <h1 id="idTitulo">Consulta de tabla</h1>

        <%            
            Connection oCxn;
            Statement oSt = null;
            ResultSet oRs = null;
            
            CDConexion oCDCxn = new CDConexion();
            oCxn = oCDCxn.abrirBDMySQL();
            
            
            oSt = oCxn.createStatement();
            oRs = oSt.executeQuery("SELECT * FROM VTAt04_moneda");
        %>

        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Abreviatura</th>
                    <th>Descripción</th>
                    <th>Id Idioma</th>
                </tr>
            </thead>
            <tbody>
                <%while (oRs.next()) {
                %>
                <tr>
                    <td><%out.print(oRs.getByte(1));%></td>
                    <td><%out.println(oRs.getString(2));%></td>
                    <td><%out.println(oRs.getString(3));%></td>
                    <td><%out.println(oRs.getByte(4));%></td>                    
                </tr>
                <%                        
                    }
                    
                    oRs.close();
                    oSt.close();
                    oCxn.close();

                %>
            </tbody>            
        </table>

    </body>
</html>
