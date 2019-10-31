<%-- 
    Document   : jsp07v01ObjetopageContext
    Created on : 18/01/2017, 05:06:07 PM
    Author     : ALEDIA
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <%!
            String sCadena ="";
            String sValor = "";
        %>
        <%
            Enumeration oEnumerar = pageContext.getAttributeNamesInScope(pageContext.SESSION_SCOPE);
            while (oEnumerar.hasMoreElements()){
                sCadena = (String)oEnumerar.nextElement();
                sValor = (String)pageContext.getAttribute(sCadena, pageContext.SESSION_SCOPE);
                out.println("Cadena = " + sCadena + " valor = " + sValor);
            }
        %>
    </body>
</html>
