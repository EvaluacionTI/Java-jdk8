<%-- 
    Document   : jsp02v01ObjetoImplicito
    Created on : 24/01/2017, 01:21:40 PM
    Author     : ALEDIA
--%>

<%@include file="jsp01v02DeclararJSTLdeJSP.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssFormulario.css" rel="stylesheet"/>
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <h3 id="idTitulo">Objetos Implícitos</h3>
        <br>
        <table border="1" width="2" cellspacing="3" cellpadding="4">
            <thead>
                <tr>
                    <th>N°</th>
                    <th>Objeto</th>
                    <th>Descripción</th>
                    <th>Ejecución jsp</th>
                    <th>Ejecucion jstl</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>application</td>
                    <td>Variables de ámbito application</td>
                    <td></td>
                    <td></td>                    
                </tr>
                <tr>
                    <td>2</td>
                    <td>config</td>
                    <td></td>
                    <td></td>
                    <td></td>                    
                </tr>
                <tr>
                    <td>3</td>
                    <td>exception</td>
                    <td></td>
                    <td></td>                    
                </tr>
                <tr>
                    <td>4</td>
                    <td>jspContext</td>
                    <td></td>
                    <td></td>
                    <td></td>                    
                </tr>
                <tr>
                    <td>5</td>
                    <td>out</td>
                    <td></td>
                    <td></td>
                    <td></td>                    
                </tr>
                <tr>
                    <td>6</td>
                    <td>page</td>
                    <td>Variables de ámbito página.</td>
                    <td></td>
                    <td></td>                    
                </tr>
                <tr>
                    <td>7</td>
                    <td>pageContext</td>
                    <td>El objeto PageContext de la página actual</td>
                    <td><%=pageContext.getSession().getId()%></td>
                    <td><co:out value="${pageContext.session.id}"></co:out></td>                    
                </tr>
                <tr>
                    <td>8</td>
                    <td>request</td>
                    <td>Variables de ámbito request</td>
                    <td><%=request%></td>
                    <td></td>                    
                </tr>                
                <tr>
                    <td>9</td>
                    <td>response</td>
                    <td></td>
                    <td></td>
                    <td></td>                    
                </tr>                
                <tr>
                    <td>10</td>
                    <td>session</td>
                    <td>Variables de ámbito session</td>
                    <td></td>
                    <td></td>                    
                </tr>                
            </tbody>
        </table>

        <!--
        co:out value="${pageContext.request.asyncContext}"
        -->
    </body>
</html>
