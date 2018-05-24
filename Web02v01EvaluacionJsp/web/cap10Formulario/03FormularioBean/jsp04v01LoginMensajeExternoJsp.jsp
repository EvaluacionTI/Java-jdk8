<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="../../styleSheet/cssTablaMantenimiento.css" rel="stylesheet"/>
        <title>...[ Evaluación JSP]...</title>
    </head>
    <body>
        <h1 id="idTitulo">Registro Login con JSP externo para ver mensaje</H1>

        <jsp:useBean id="oCEUsuario" class="aemsa.entidad.bean.CEUsuarioBean" scope="session"/>

        <form id="idTablaMantenimiento" action="jsp04v02MostrarLogin.jsp" method="POST">

            <table>
                <tr>
                    <td>Login</td>
                    <td><input TYPE="text" NAME="txtLogin" SIZE="20"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input TYPE="password" NAME="txtClave" SIZE="20"></td>
                </tr>                
            </table>

            <P><input type="submit" value="Registrarse por Primera Vez" name="btnPrimera"></P>
            <P><input type="submit" value="OK" name="btnPrimera">
               <input type="submit" value="Salir" name="btnPrimera"></P>
        </form>
    </body>
</html>