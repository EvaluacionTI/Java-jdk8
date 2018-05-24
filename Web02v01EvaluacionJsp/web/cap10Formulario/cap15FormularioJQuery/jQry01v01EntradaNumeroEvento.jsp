<%-- 
    Document   : jQry01v01EntradaNumeroEvento
    Created on : 07-may-2013, 12:05:38
    Author     : background21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>jQuery: Entrada de Numeros y Evento</title>

        <link rel="stylesheet" href="../styleSheet/jqx.base.css" type="text/css" />
        <link rel="stylesheet" href="../styleSheet/cssTablaMantenimiento.css" type="text/css" />

        <script type="text/javascript" src="../js/gettheme.js"></script>
        <script type="text/javascript" src="../js/jquery-1.9.1.js"></script>

        <script type="text/javascript" src="../js/jqwidgets/jqxcore.js"></script>
        <script type="text/javascript" src="../js/jqwidgets/jqxbuttons.js"></script>
        <script type="text/javascript" src="../js/jqwidgets/jqxscrollbar.js"></script>
        <script type="text/javascript" src="../js/jqwidgets/jqxpanel.js"></script>
        <script type="text/javascript" src="../js/jqwidgets/jqxnumberinput.js"></script>

        <script type="text/javascript">
            $(document).ready(function() {

                var theme = getDemoTheme();

                // Create jqxNumberInput
                $("#numericInput").jqxNumberInput({width: '250px', 
                                                                            height: '25px', 
                                                                            inputMode: 'simple', 
                                                                            spinButtons: true, 
                                                                            theme: theme});

                $('#Events').css('border', 'none');
                $('#Events').jqxPanel({theme: theme, height: '250px', width: '300px'});

                $('#numericInput').on('valuechanged', function(event) {
                    var value = event.args.value;
                    $('#Events').jqxPanel('clearcontent');
                    $('#Events').jqxPanel('prepend', '<div style="margin-top: 5px;">Value: ' + value + '</div>');
                });
            });
        </script>

    </head>

    <body>
        <div id="TituloTablaMantenimiento">Numeros y Eventos</div>

        <div id='jqxWidget'>
            <div style='float: left;'>
                <div style='margin-top: 10px;'>
                    Importe del Préstamo:
                </div>
                <div style='margin-top: 3px;' id='numericInput'>
                </div>

                <div style='margin-left: 0px; margin-top: 20px; float: left;'>
                    <div>
                        <span>
                            Evento generado:</span>
                        <div id='Events'>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>

