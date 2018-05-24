<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<HTML>
    <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
            <title>...[ Evaluación JSP]...</title>
    </head>
    <body>
        <h2 id="idTitulo">Archivo JSP que recibe los datos de otro JSP</H2>

        <%--
            1. Defino la entidad Usuario para validar la información de entrada
        --%>
        <jsp:useBean id="oCEUsuario" class="aemsa.entidad.bean.CEUsuarioBean" scope="session" />

        <%--
            2. Declaración de variables
        --%>
        
        <%! String sLogin = ""; %>
        <%! String sPassword = ""; %>
        <%! String showPage = ""; %>
        <%! String action = ""; %>
        <%! String sMensaje = ""; %>

        <%--
            2.1 Seguimiento de variables
        --%>
        <%=request.getParameter("txtLogin")%>
        <%=request.getParameter("txtClave")%>
        <%=request.getParameter("btnPrimera")%>
        <%=oCEUsuario%>

        <%--
            3. Validar para evitar un error en la primera carga de la página
        --%>
        <%
            if (request.getParameter("btnPrimera")!=""){
                action = request.getParameter("btnPrimera");
        %>

        <%--
            4. Verificar la información registrada con los datos de la clase entidad
        --%>        
        <%  
            if (action.equals("Salir") == true)
                sMensaje="Salida del sistema";
            else if (action.equals("OK") == true) {
                if (oCEUsuario != null){
                    sLogin = request.getParameter("txtLogin");
                    sPassword = request.getParameter("txtClave");
                    if (oCEUsuario.validar(sLogin, sPassword) == true)
                        sMensaje="Bienvenido, " + sLogin;
                    else
                        sMensaje="Usuario desconocido";
                }
                else
                    sMensaje="Bean registrado desconocido";
            }
            else
                sMensaje=action;
            
            showPage = "jsp04v03Mensaje.jsp?mensaje=" + sMensaje;
        %>
        <%=sMensaje%>
        <%
            }
        %>
        <%--
            5. Enviar la información a otra página para visualizar un mensaje
        --%>    

        <jsp:forward page="<%=showPage%>" />

    </body>
</HTML>
