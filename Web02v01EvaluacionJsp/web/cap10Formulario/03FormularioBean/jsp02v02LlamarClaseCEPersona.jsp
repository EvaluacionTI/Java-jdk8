<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </head>
    
    <body>
        <!-- 
            Definición de la clase a utilizar utilizando el jsp:useBean
        -->
        <h1 id="idTitulo">Llamar a un bean</h1>
        
        <jsp:useBean id="oCEPersona" scope="page" class="aemsa.entidad.bean.CEPersona"/>

        <!--
            Asignar valores al objeto definido por la Clase referenciada
        -->
        <jsp:setProperty name="oCEPersona" property="msNombre" value = "Mery Cárdenas"/>
        <jsp:setProperty name="oCEPersona" property="msCiudad" value="La Victoria - Lima - Perú"/>
        <jsp:setProperty name="oCEPersona" property="miId" value="0791251"/>

       <h2 id="footer">Datos del cliente</h2>
       
       <br>
       <table id="idTabla">
           <tr>
               <th>Identificador</th>
               <th>Cliente</th>
               <th>Ciudad</th>
           </tr>
           <tr>
               <td><jsp:getProperty name="oCEPersona" property="miId"/></td>
               <td><jsp:getProperty name="oCEPersona" property="msNombre"/></td>
               <td><jsp:getProperty name="oCEPersona" property="msCiudad"/></td>
           </tr>
       </table>

    </body>
</html>
