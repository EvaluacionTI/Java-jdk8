<%-- 
    Document   : jsp0102MultiplesVariables
    Created on : 09-jun-2011, 22:51:03
    Author     : AEMSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>

    <body>
        <h1>USO DE JSP</h1>
        <%! int lIntaaaa=2002;
            double  dImporteSalario = 400;
            int iNumeroEmpleado = 34566;
            String sNombreEmpleado = "Esteban";
            String[] aListaTelefonos={"239-6079", "346-0653", "992-767676", "995-177172"};
            String oEmpresa = new String();
            int[] iNotas = {10,11,12,13,14,15,16,17,18,19,20};
        %>
        
        <p> A#o <%=lIntaaaa%> </p>
        <p> Numero Empleado <%=iNumeroEmpleado%> </p>
        <p> Nombre Empleado <%=sNombreEmpleado%> </p>
        <p> Lista Telefonos <%=aListaTelefonos%> </p>
        <p> Lista Telefonos <%=aListaTelefonos[1]%> </p>
        <p> Empresa <%=oEmpresa%> </p>
        <p> Notas <%=iNotas[1]%> </p>
        
    </body>
</html>
