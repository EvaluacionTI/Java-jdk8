<%-- 
    Document   : jsp04v01SesionProducto
    Created on : 18/01/2017, 07:21:06 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <!--
            1. Configurar el servlet en el archivo web.xml

             2. En el FORM para action asignar el nombre del servlet descripto en el parrafo inicial
                 Servidor de aplicación:Puerto:Nombde Aplicación:Servlet
                 Servidor            : http://localhost
                 Puerto              : 8080
                 Aplicación          : EvaluacionJsp
                 Nombre del Servlet  : ServletIniciarMostrar

             3. Con esta dirección se inicia la página HTML en la URL
             http://localhost:8080/EvaluacionJsp/cap10Formulario/03FormularioServlet/Htm01v01IniciarMostrarEnServlet.html

             4. Cuando invoca al servlet se visualizará en la URL
             http://localhost:8080/EvaluacionJsp/ServletSesionProducto
        -->        
        <form action="http://localhost:8080/EvaluacionJsp/ServletSesionProducto">
            Código   : <input type="text" name="mTxtCodigo"><br>
            Producto : <input type="text" name="mTxtProducto"><br>
            Precio   : <input type="text" name="mTxtPrecio"><br>
            <input type="submit" value="Registro" name="mBtnRegistro">
            <input type="reset" value="Iniciar" name="mBtnIniciar">
        </form>
    </body>
</html>
