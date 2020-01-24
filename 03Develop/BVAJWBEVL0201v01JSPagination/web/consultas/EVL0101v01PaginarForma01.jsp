<%-- 
    Document   : EVL0101v01PaginarForma01
    Created on : ene 23, 2020, 9:56:32 p.m.
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>....: Banco Continental :.....</title>
    </head>
    <body>
        <h1>Paginar solo con JSP sin CSS and BD Embebida Postgres</h1>
        <hr>
        <form id="idQueryPagination" method="GET" action="paginarBDEmbebido">
            <table>
                <thead>
                    <tr>
                        <td>First</td>
                        <td>Next</td>
                        <td>Previous</td>
                        <td>Last</td>
                    </tr>
                    <tr><td>N°</td>
                        <td>Código</td>
                        <td>Descripción</td>
                    </tr>
                </thead>
                <tbody>
                    
                </tbody>
                <tfoot>
                    <tr>
                        <td>First</td>
                        <td>Next</td>
                        <td>Previous</td>
                        <td>Last</td>
                    </tr>                    
                </tfoot>
            </table>
        </form>
    </body>
</html>
