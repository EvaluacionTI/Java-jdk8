<html>
    <head>
        
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </head>

    <body>
        <h4 id="idTitulo">Lectura del Bean CEEjemplo</h4>
        
        <%! 
            int iNrofilas; 
            int iNrocolumnas;
        %>

        <jsp:useBean id="oCEReserva" class="aemsa.entidad.bean.CEEjemplo" scope="session" />

        <jsp:setProperty name="oCEReserva" property="miFilas" value="5" />
        <jsp:setProperty name="oCEReserva" property="miColumnas" value="3" />

        <P>Tabla de Salida (Filas: 
        <jsp:getProperty name="oCEReserva" property="miFilas" />
        , Columnas: 
        <jsp:getProperty name="oCEReserva" property="miColumnas" />
        )</P>

        <% iNrofilas = oCEReserva.getMiFilas(); %>
        <% iNrocolumnas = oCEReserva.getMiColumnas(); %>

        <table id="idTabla">
        <% for (int i=0; i<iNrofilas; i++) { %>
                <tr>	
                <% for (int j=0; j<iNrocolumnas; j++) { %>
                        <TD>Reserva <%=i+1%>.<%=j+1%></TD>
                <% } %>
                </tr>
        <% } %>
        </table>
        
        <form>
          <p><input type="submit" value="OK" name="btnGrabar">
             <input type="submit" value="Salir" name="btnSalir"></P>
        </form>

    </BODY>
</HTML>

