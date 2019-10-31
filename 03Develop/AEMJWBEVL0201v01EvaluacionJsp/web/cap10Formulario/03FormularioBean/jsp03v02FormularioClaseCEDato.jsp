<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="oCEDato" scope="page" class="aemsa.entidad.bean.CEDato" />
     
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </head>
    <body>
        <h1 id="idTitulo">Formulario Correo con Clase CEDato</h1>
        <%--
            1. Se valida las variables que no tiene la primera vez datos
        --%>
        
        <%
            if (request.getParameter("txtNombre")==null && request.getParameter("txtEmail")==null){
        %>
        
        <center>
        <%--
            2. Se llama a si mismo el formulario para poder mostrar los datos ingresados
        --%>
            
            <form action="jsp03v02FormularioClaseCEDato.jsp" method="get" >
                <p>Nombre : <input type="text" name="txtName" size="26"></p>
                <p>Email  : <input type="text" name="txtEmail" size="26"></p>
                <p><input type="submit" vaue="Registrar"></p>
            </form>
        </center>
    
        <%} else{ %>
            <%!
                String lStrNombre, lStrEmail;
             %>

            <% 
                lStrNombre = request.getParameter("txtName"); 
                lStrEmail = request.getParameter("txtEmail"); 
            %>
            <p><%=lStrNombre%></p>
            <p><%=lStrEmail%></p>
            <%--
                3. Valor que se asigna al objeto
            --%>
            <jsp:setProperty name="oCEDato" property="mStrNombre" value="<%=lStrNombre%>"/>
            <jsp:setProperty name="oCEDato" property="mStrEmail" value="<%=lStrEmail%>"/>
         <% } %>
    
    </body>
</html>
