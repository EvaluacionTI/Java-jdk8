<%-- 
    Document   : jsp02v01RegistroFuncionario
    Created on : 12/01/2017, 05:31:20 PM
    Author     : ALEDIA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../styleSheet/cssSesion09.css" rel="stylesheet"/>
        <title>..[ Formulario ]..</title>

    </head>
    <body>
        <%!
            double ldImporte = 0;
            double ldComision = 0;
            double ldTotal = 0;
            String lsTipoComision, lsTipoComisionAsignada;
        %>
                     
         <table id="idTabla">
             <tr>
                 <th colspan="4">Datos de la Solicitud</th>
             </tr>
             <tr><td>Nombre </td>
                 <td><%=request.getParameter("txtCliente")%></td>
             </tr>
             <tr><td>Fecha Solicitud </td>
                 <td><%=request.getParameter("dteFechaSolicitud")%></td>
                 <td>Fecha Desembolso </td>
                 <td><%=request.getParameter("dteFechaDesembolso")%></td>                 
             </tr>
             <tr><td>Tipo Tasa Interes </td>
                 <td><%=request.getParameter("rbTipoTasaInteres")%></td>
                 <td>Tasa </td>
                 <td><%=request.getParameter("numTasa")%></td>
             </tr>
             <tr><td>Moneda </td>
                 <td><%=request.getParameter("cbxMoneda")%></td>
                 <td>Importe </td>
                 <td><%=request.getParameter("txtImporte")%></td>
             </tr>
             <tr><td>Tipo Comisión</td>
                 <td><%
                        lsTipoComision = (String)request.getParameter("chkComisionActivacion");
                        if (lsTipoComision == "Activacion"){
                            lsTipoComisionAsignada = "Activacion";
                            ldComision = 1000;
                        }else{
                            lsTipoComision = (String)request.getParameter("chkComisionCobranza");
                            lsTipoComisionAsignada = "Cobranza";
                            ldComision = 500;
                        }
                     %>
                     <%=lsTipoComisionAsignada%>
                 </td>                 
                 <td>Comisión </td>
                 <td><%=ldComision%></td>
             </tr>
             <tr><td>Descripcion </td>
                 <td><%=(String)request.getParameter("txtaDescripcion")%></td>
                 <td>Total </td>
                 <td>
                     <%
                        ldImporte = Double.parseDouble(request.getParameter("txtImporte"));
                        ldTotal = Double.parseDouble(request.getParameter("txtImporte")) + ldComision;
                     %>
                     <%=ldTotal%>
                 </td>
             </tr>             
         </table>
         
    </body>
</html>
