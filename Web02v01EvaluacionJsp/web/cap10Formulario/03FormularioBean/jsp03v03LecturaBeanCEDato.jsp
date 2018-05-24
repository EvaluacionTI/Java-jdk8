
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="oCELectura" class="aemsa.entidad.bean.CEDato">
  
</jsp:useBean>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <link type="text/css" href="../../styleSheet/cssWebGeneral.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </head>
    <body>
        <%
            if (request.getParameter("txtNombre") ==null && request.getParameter("txtEmail")==null){
        %>
    <center>
        <h5 id="idTitulo">Lectura del Bean </h5>
        <form method="GET" action="jsp03v03LecturaBeanCEDato.jsp">
            <table id="RegistroMantenimientoTabla">
                <tr><td>Juzgado de Paz letrado</td>
                    <td><input type="text" name ="txtNombre" size="20"></td>
                </tr>
                <tr><td>Dirección Email</td>
                    <td><input type="text" name="txtEmail" size="20"></td>
                </tr>
                <tr><td colspan="2">
                        <input type="submit" value="Procesar">
                    </td>
                </tr>
            </table>
        </form>
    </center>
    
    <% } else { %>
    <p></p>
    <b>La información siguiente del Juzgado:</b>
    <p></p>
     <jsp:setProperty name="oCELectura" property="mStrNombre" value="txtNombre"/>
    <jsp:setProperty name= "oCELectura" property="mStrEmail" value="txtEmail"/> 
    
    Nombre <jsp:getProperty name="oCELectura" property="mStrNombre"/>
    <b>Email :</b> <jsp:getProperty name="oCELectura" property="mStrEmail"/>
     
    <%
        }
    %>
    </body>
</html>

