<%-- 
    Proyecto    :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.util.Date" %>
<%@page import = "aemsa.sqlserver.modelo.CDConexion" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link type="text/css" href="../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        
        <title>Conexion a Base Datos</title>
    </head>
    
    <body>
        <h1 id="idTitulo">Conexion a Base Datos SQL Server</h1>
        
        <%
            try{
                CDConexion oCxn = new CDConexion();
            
                oCxn.getOpenSQLServer();
                
                out.println(new Date());
            }catch(Exception ex){
                ex.getMessage();
            }

            
            
         %>
            
    </body>
</html>
