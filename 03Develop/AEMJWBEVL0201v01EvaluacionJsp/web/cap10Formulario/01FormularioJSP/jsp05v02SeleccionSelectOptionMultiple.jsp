<%-- 
    Document   : jsp05v01SeleccionSelectOption
    Created on : 20/01/2017, 12:23:38 PM
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
        <h3 id="idTitulo">Selecciones : Etiqueta select-option</h3>
         <%
             String[] aSeleccion = request.getParameterValues("cbxFuncionario");
             if (request.getParameter("cbxFuncionario")==null){
         %>
        <form action="jsp05v02SeleccionSelectOptionMultiple.jsp" method="post">
            Cargo:
            <select name="cbxFuncionario" multiple="multiple">
                <option value="Asistente de Negocios Leasing">Asistente de Negocios Leasing
                <option value="Funcionario de Negocios Leasing" selected>Funcionario de Negocios Leasing
                <option value="Funcionario Soporte Comercial Leasing">Funcionario Soporte Comercial Leasing
                <option value="Jefe de Soporte Comercial Leasing">Jefe de Soporte Comercial Leasing
                <option value="Jefe Comercial Leasing">Jefe Comercial Leasing
                <option value="Asistente de Contabilidad">Asistente de Contabilidad
                <option value="Analista Programador">Analista Programador
            </select>
            <br/>
            <p><input type="submit" value="Enviar"></p>
        </form>
        <%
            }else{
                out.println("Elementos Seleccionados:\n");
        %><br><%        
                for(int i=0;i<aSeleccion.length;i++){
        %>
        
        <%=aSeleccion[i]%>
        <br>
        <%
            }}
        %>
    </body>
</html>
