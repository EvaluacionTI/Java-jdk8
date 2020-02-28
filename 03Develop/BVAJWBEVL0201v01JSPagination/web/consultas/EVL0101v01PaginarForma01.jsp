<%-- 
    Document    : EVL0101v01PaginarForma01
    Created on  : ene 23, 2020, 9:56:32 p.m.
    Author          : ALDV
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
        <form id="idQueryPagination" method="GET" action="frmPaginarBDEmbebido">
            <input type="hidden" name="vCurrentPage" value="1"/>
            <label for="records">Select record per page :</label>
            <select id="idRecord" name="vRecordPage">
                <option value="5">5</option>
                <option value="10" selected>10</option>
                <option value="15">15</option>
            </select>
            <input type="hidden" name="vNumberPage" value="${vNumberPage}"/>
            
                
        </form>
        <button type="submit">List Channels</button>
    </body>
</html>
