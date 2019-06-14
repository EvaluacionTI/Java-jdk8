<%-- 
    Document   : index
    Created on : 23/01/2011, 02:52:18 AM
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="aemsa.entidad.CEPersona" errorPage=""%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <div> Manejo de clases con JSP </div>
        <br>
        <p>Se asigna al objeto los datos con el scriptle</p>
        
        <%
                CEPersona oCEPersona = new CEPersona();
                
                oCEPersona.setmNombre("Banco de Comercio");
                oCEPersona.setmCiudad("San Isidro - Lima - Perú");
                oCEPersona.setmId(458);
         %>
       
        <h1>Datos del Cliente</h1>
        
        <table>
            <tr>
                <td>Identificador</td>
                <td>Nombre</td>
                <td>Ciudad</td>
            </tr>
            <tr>
                <td><%=oCEPersona.getmId()%></td>
                <td><%=oCEPersona.getmNombre()%></td>
                <td><%=oCEPersona.getmCiudad()%></td>
            </tr>
        </table>
    </body>
</html>
