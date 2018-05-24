<%-- 
    Fecha       :   12/01/2017
    Objetivo    :   Control de la clase LinkedList
    Descripción :   1. Crear una hoja de estilo para el manejo de tablas denominada cssSesion09
                    2. Crear una clase entidad moneda denominada (CEMoneda) el cual debe tener
                       los siguientes atributos (id, abreviatura, codigonumero, codigoletra, descripcion)
                       2.1 Encapsular para generar los get/set
                       2.2 Crear el constructor con todos su atributos y sin atributos
                    3. En la página JSP generar los objetos de la tabla moneda según el punto 4.
                        Utilidar la clase LinkedList y for para poder iterar la información a mostrar
                    4. Información de moneda
                    Id	Abreviatura	ISO Numero	ISO Letra   Descripción
                    1       S/          604             PEN         SOLES
                    2       S/.         604             PEN         NUEVOS SOLES
                    3       I           604             PEI         INTI
                    4       US$         840             USD         DOLARES AMERICANOS
                    5       E           978             EUR         EUROS
                    6       R           986             BRL         REAL
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.LinkedList"%>

<%@page import="aemsa.entidad.colecciones.CEMoneda"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
 
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <%--    
            1. Declaración de Variables
        --%>

        <%!
           CEMoneda oCEMoneda = new CEMoneda();
           LinkedList<CEMoneda> oLista = new LinkedList<CEMoneda>();
        %>

        <%--    
            2. Declarar los objetos en la clase moneda
        --%>        
        <% 
            oCEMoneda.setId(1);
            oCEMoneda.setAbreviatura("S/");
            oCEMoneda.setCodigoNumero("604");
            oCEMoneda.setCodigoLetra("PEN");
            oCEMoneda.setDescripcion("SOLES");
            oLista.add(oCEMoneda);
            oCEMoneda = new CEMoneda();
            
            oCEMoneda.setId(2);
            oCEMoneda.setAbreviatura("S/.");
            oCEMoneda.setCodigoNumero("604");
            oCEMoneda.setCodigoLetra("PEN");
            oCEMoneda.setDescripcion("NUEVOS SOLES");
            oLista.add(oCEMoneda);
            oCEMoneda = new CEMoneda();
            
            oCEMoneda.setId(3);
            oCEMoneda.setAbreviatura("I");
            oCEMoneda.setCodigoNumero("604");
            oCEMoneda.setCodigoLetra("PEI");
            oCEMoneda.setDescripcion("INTI");
            oLista.add(oCEMoneda);
            oCEMoneda = new CEMoneda();
            
            oCEMoneda.setId(4);
            oCEMoneda.setAbreviatura("US$");
            oCEMoneda.setCodigoNumero("840");
            oCEMoneda.setCodigoLetra("USD");
            oCEMoneda.setDescripcion("DOLARES AMERICANOS");
            oLista.add(oCEMoneda);
            oCEMoneda = new CEMoneda();
            
            oCEMoneda.setId(5);
            oCEMoneda.setAbreviatura("E");
            oCEMoneda.setCodigoNumero("978");
            oCEMoneda.setCodigoLetra("EUR");
            oCEMoneda.setDescripcion("EUROS");
            oLista.add(oCEMoneda);
            oCEMoneda = new CEMoneda();
            
            oCEMoneda.setId(6);
            oCEMoneda.setAbreviatura("R");
            oCEMoneda.setCodigoNumero("986");
            oCEMoneda.setCodigoLetra("BRL");
            oCEMoneda.setDescripcion("REAL");
            oLista.add(oCEMoneda);
            oCEMoneda = new CEMoneda();
            
        %>

        <h1 id="idTitulo">Lista de Moneda: LinkedList - Iterator</h1>
        
        <table id="idTabla">
            <tr>
                <th>Id</th>
                <th>Abreviatura</th>
                <th>ISO Numero</th>
                <th>ISO Letra</th>
                <th>Descripción</th>
            </tr>
            <%
                Iterator<CEMoneda> oRow = oLista.iterator();
                while(oRow.hasNext()){
                    oCEMoneda = oRow.next();
            %>
            <tr>
                <td><%=oCEMoneda.getId()%></td>
                <td><%=oCEMoneda.getAbreviatura()%></td>
                <td><%=oCEMoneda.getCodigoNumero()%></td>
                <td><%=oCEMoneda.getCodigoLetra()%></td>
                <td><%=oCEMoneda.getDescripcion()%></td>
            </tr>
            <%
                }
            %>
            <tr>
                <td colspan="4">Total de Filas</td>
                <td><%=oLista.size()%></td>
            </tr>
        </table>
    </body>
</html>
