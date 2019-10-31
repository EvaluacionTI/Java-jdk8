<%-- 
    Fecha       :   12/01/2017
    Objetivo    :   Control de la clase LinkedList
    Descripción :   Generar una tabla de información de alumnos utilizando la clase LinkedList con
                    la siguiente estructura
                    Código      Nombre
                        33	Illari
                        34	Esteban
                        35	Mery
                        36	Mery
--%>

<%@page import="aemsa.entidad.colecciones.CEAlumno"%>
<%@page import="java.util.LinkedList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.....[ Evaluación JSP ].....</title>
    </head>
    <body>
        <%!
           CEAlumno oAlumno = new CEAlumno();
           LinkedList<CEAlumno> oLista = new LinkedList<CEAlumno>();
        %>
        
        <h6>Lista de Clientes</h1>
           
        <% 
            oAlumno.setCodigo(33);
            oAlumno.setNombre("Illari");
            oLista.add(oAlumno);
            oAlumno = new CEAlumno();
            
            oAlumno.setCodigo(34);
            oAlumno.setNombre("Esteban");
            oLista.add(oAlumno);
            oAlumno = new CEAlumno();
            
            oAlumno.setCodigo(35);
            oAlumno.setNombre("Mery");
            oLista.add(oAlumno);
            oAlumno = new CEAlumno();
            
            oAlumno.setCodigo(36);
            oAlumno.setNombre("Paula");
            oLista.add(oAlumno);

        %>
            
        <table>
            <tr>
                <td>Código </td>
                <td>Alumno</td>
            </tr>
            <tr>
                <td><%=oLista.get(0).getCodigo()%>
                </td>
                <td><%=oLista.get(0).getNombre()%>
                </td>
            </tr>
            <tr>
                <td><%=oLista.get(1).getCodigo()%>
                </td>
                <td><%=oLista.get(1).getNombre()%>
                </td>
            </tr>
            <tr>
                <td><%=oLista.get(2).getCodigo()%>
                </td>
                <td><%=oLista.get(2).getNombre()%>
                </td>
            </tr>
            <tr>
                <td><%=oLista.get(3).getCodigo()%>
                </td>
                <td><%=oLista.get(2).getNombre()%>
                </td>
            </tr>            
        </table>
    </body>
</html>
