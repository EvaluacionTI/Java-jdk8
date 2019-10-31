<HTML>
    <HEAD>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </HEAD>
    <BODY>
        <h1 id="idTitulo">Formulario Login</h1>
        
        <%! String sLogin = "Mery"; %>
        <%! String sPassword = "15172027"; %>

        
        <form id="idTablaMantenimiento">
            <table>
                <tr>
                    <td>Login</td>
                    <td><input TYPE="text" NAME="txtLogin" SIZE="20" VALUE="<%=sLogin%>"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input TYPE="password" NAME="txtClave" SIZE="20" VALUE="<%=sPassword%>"></td>
                </tr>                
            </table>

            <P><input type="submit" value="Registrarse por Primera Vez" name="btnPrimera"></P>
            <P><input type="submit" value="OK" name="btnOK">
               <input type="submit" value="Salir" name="btnSalir"></P>
        </FORM>
    </BODY>
</HTML>