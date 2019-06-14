<%--
    Document   : index
    Created on : 22/01/2011, 11:23:58 PM
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@page import = "java.util.Date" %>

<%! 
    String lstrCadena="Llamar a una clase java: java.util.Date"; 
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>

    <body>
        <%= lstrCadena%>
                
        Fecha del Sistema:
        <% out.println(new Date()); %>
    </body>
</html>
