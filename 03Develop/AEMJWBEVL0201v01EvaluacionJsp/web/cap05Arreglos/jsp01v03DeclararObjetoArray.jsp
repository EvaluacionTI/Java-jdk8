<%-- 
    Document   : jsp0103DeclararObjetoArray
    Created on : 19/12/2011, 11:46:39 PM
    Author     : AEMSA
--%>

<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    
    <body>
        <h1>Declaración de Objetos y Arrays</h1>
        
        <%-- 
                El Objeto Vector necesita de la importación de la clase Vector del paquete util. 
                Para ello utilizamos la etiqueta tipo directiva.
        --%>
        <%! 
            String lStrNombre;
            String [] oStrTelefono={"995177172", "992767676", "3460652"};
            String oEmpresa = new  String();
            
            Vector oVector = new Vector();
            int[] lIntGrado = {100,82,99};
        %>
        
        
    <h1>Mostrar cadena sin iniciar <%=lStrNombre %></h1>
    <br>Arreglo de telefonos <%=oStrTelefono%></br>
    <br>Arreglo de telefonos <%=oStrTelefono[0]%></br>
    <br>Arreglo de telefonos <%=oStrTelefono[1]%></br>
    <br>Arreglo de telefonos <%=oStrTelefono[2]%></br>
    </body>
</html>
