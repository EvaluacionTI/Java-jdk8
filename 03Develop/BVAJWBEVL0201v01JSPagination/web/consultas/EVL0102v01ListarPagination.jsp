<%-- 
    Document    : EVL0102v01ListarPagination
    Created on  : ene 23, 2020, 9:56:32 p.m.
    Author          : ALDV

http://zetcode.com/articles/javaservletpagination/
http://es.voidcc.com/question/p-tlgrfvyx-b.html
https://www.lawebdelprogramador.com/foros/JSP-Java-Server-Page/829649-codigo-para-hacer-la-paginacion-con-JSP.html
http://www.cristalab.com/tutoriales/listado-con-paginacion-en-jsp-con-ajax-y-sql-server-c105048l/
http://www.easywayserver.com/java/jsp-pagination/
https://www.w3schools.com/java/java_operators.asp
https://www.tutorialspoint.com/jsp/jsp_environment_setup.htm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>....: Banco Continental :.....</title>
    </head>
    <body>
        <h1>Paginar solo con JSP sin CSS and BD Embebida Postgres</h1>
        <hr>
        <div id="idListPagination">
            <tr><th>Código</th>
                <th>Descripción</th>
            </tr>
            <co:forEach items="${vListCanal}" var="vItem">
                <tr><td>${vItem.getCodigoCanal}</td>
                    <td>${vItem.getDescripcion}</td>
                </tr>
            </co:forEach>
        </div>
        
        <div id="idNavegation">
            <co:if test="${vCurrentPage!=1}">
                <a href="frmPaginarBDEmbebido?vRecordPage=${vRecordPage}&vCurrentPage=${vCurrentPage - 1}">Previos</a>
            </co:if>

            <!-- Display Number Pages -->
            <co:forEach begin="1" end="${noOfPages}" var="vNumberPage">
                <co:choose>
                    <co:when test="${vCurrentPage eq vNumberPage}">
                        <a>${vNumberPage}</a>
                    </co:when>
                    <co:choose>
                        <a href="frmPaginarBDEmbebido?vRecordPage=${vRecordPage}&vCurrentPage=${vNumberPage}">${vNumberPage}</a>
                    </co:choose>
                </co:choose>

            </co:forEach>
            <!-- Display Next Link -->
            <co:if test="${vCurrentPage lt noOfPages}">
                <a href="frmPaginarBDEmbebido?vRecordPage=${vRecordPage}&vCurrentPage=${vCurrentPage + 1}">Next</a>
            </co:if>
        </div>
    </body>
</html>
