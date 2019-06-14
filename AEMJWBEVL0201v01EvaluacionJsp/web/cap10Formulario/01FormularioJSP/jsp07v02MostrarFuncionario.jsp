<%-- 
    Document   : jsp02v01RegistroFuncionario
    Created on : 12/01/2017, 05:31:20 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssSesion09.css" rel="stylesheet"/>
        <title>..[ Formulario ]..</title>

    </head>
    <body>
        
         <table id="idTabla">
             <tr>
                 <th colspan="4">Datos del Funcionario</th>
             </tr>
             <tr>
                 <td>Nombre </td>
                 <td><%=request.getParameter("txtNombre")%></td>
                 <td>Apellido </td>
                 <td><%=request.getParameter("txtApellido")%></td>
             </tr>
             <tr>
                 <td>Edad </td>
                 <td><%=request.getParameter("txtEdad")%></td>
                 <td>Cargo </td>
                 <td><%=request.getParameter("cbxFuncionario")%></td>
             </tr>
             <tr>
                 <td>Preferencia </td>
                 <td><%=(String)request.getParameter("rbPreferencia")%></td>
             </tr>             
         </table>
         
    </body>
</html>
