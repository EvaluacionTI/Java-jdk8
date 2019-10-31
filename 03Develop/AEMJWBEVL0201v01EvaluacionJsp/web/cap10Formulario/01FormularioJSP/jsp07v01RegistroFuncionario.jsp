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
        
        <h1 id="idTitulo">Registro de Funcionario</h1>
        <form action="jsp07v02MostrarFuncionario.jsp" method="post">
            Nombre: <input type="text" name="txtNombre">
            <br/>
            Apellido: <input type="text" name="txtApellido">
            <br/>
            Edad: <input type="text" name="txtEdad">
           <br/>
            Cargo:
            <select name="cbxFuncionario">
                <option value="Asistente de Negocios Leasing">Asistente de Negocios Leasing
                <option value="Funcionario de Negocios Leasing" selected>Funcionario de Negocios Leasing
                <option value="Funcionario Soporte Comercial Leasing">Funcionario Soporte Comercial Leasing
                <option value="Jefe de Soporte Comercial Leasing">Jefe de Soporte Comercial Leasing
                <option value="Jefe Comercial Leasing">Jefe Comercial Leasing
                <option value="Asistente de Contabilidad">Asistente de Contabilidad
                <option value="Analista Programador">Analista Programador
            </select>
            <br/>
            Su preferencia es:
            <br/>
            <input type="Radio" name="rbPreferencia" value= "Analisis" checked>Analisis
            <br/>
            <input type="Radio" name= "rbPreferencia" value="Procesos">Procesos
            <br/>
            <input type="Radio" name= "rbPreferencia" value="Programacion">Programación
            <br/>
            <input type="Radio" name= "rbPreferencia" value="Gestion">Gestión
            <br/>
 
            <p><input type="submit" value="Enviar"></p>
        </form>
    </body>
</html>
