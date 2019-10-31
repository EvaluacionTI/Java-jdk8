<%-- 
    Document   : jsp1701v01AccesoUsuario
    Created on : 29/04/2017, 12:03:36 PM
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
        <h4 id="idTitulo" style="background-color: #FF8800; align-content: center">Clave de acceso</h4>
         
        <%!
            String lsUsuario = "";
            String lsClave = "";
            String lsMensaje = "";
        %>
                
         <%
             if (request.getParameter("vUsuario")==null && request.getParameter("vClave")==null){
         %>
                <form action="jsp1701v01AccesoUsuario.jsp" method="get">
                    <br/>
                    Usuario<input type="text" name="vUsuario">
                    <br/>
                    Clave<input type="password" name= "vClave">
                    <br/>
                    <input type="reset" name= "vIniciar">
                    <br/>
                    <p><input type="submit" value="Enviar"></p>
                </form>
        <% 
            } else {
        %>

            <%
                lsUsuario = request.getParameter("vUsuario");
                lsClave = request.getParameter("vClave");

                out.println("lsMensaje " + lsMensaje);

                if (lsUsuario=="taller" && lsClave =="sw"){
                    lsMensaje="Acceso autorizado";
                }else{
                    lsMensaje="Intruso";
                }
            %>
            <br>
            El mensaje mostrado : <%=lsMensaje%>
                
        <% } %>  
       
        
    </body>
</html>
