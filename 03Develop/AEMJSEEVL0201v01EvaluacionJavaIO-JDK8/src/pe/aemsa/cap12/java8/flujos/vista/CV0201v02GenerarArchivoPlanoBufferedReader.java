package pe.aemsa.cap12.java8.flujos.vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.aemsa.cap12.java8.flujos.entidad.CECruceCuenta;

public class CV0201v02GenerarArchivoPlanoBufferedReader {

    private static final Logger MOLOG = Logger.getLogger("Lectura02v02GenerarArchivoPlanoBufferedReader");

    private static File moArchivoTexto = null;
    private static FileReader moFReader = null;
    private static BufferedReader moBReader = null;

    private static FileWriter moArchivoTextoSalida = null;
    private static PrintWriter moPWriter = null;

    public static void main(String[] args) {
        CECruceCuenta oCECuentaTitulo = new CECruceCuenta();
        CECruceCuenta oCECuentaDetalle = new CECruceCuenta();

        String lsPath = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\input\\";
        String lsArchivoEntrada = "CuentaContableCruzado.txt";
        String lsLinea = "";
        String lsEvaluaCadena = "";
        String lsDataTituloParrafo = "", lsDataDetalleParrafo = "";

        int liFlagTituloParrafo = 0;
        int liContadorFilaTitulo = 1;

        try {
            // 1. Validar archivo
            if (validarArchivo(lsPath + lsArchivoEntrada)) {
                moFReader = new FileReader(moArchivoTexto);
                moBReader = new BufferedReader(moFReader);

                MOLOG.log(Level.INFO, "File : {0}", moArchivoTexto);
                MOLOG.log(Level.INFO, "FileReader : {0}", moFReader);
                MOLOG.log(Level.INFO, "BufferedReader : {0}", moBReader);

                // 2. Revisar las primeras filas del título
                while ((lsLinea = moBReader.readLine()) != null) {
                    switch (liContadorFilaTitulo) {
                        case 1: // FECHA
                            lsEvaluaCadena = lsLinea.substring(0, 5);
                            liContadorFilaTitulo = 1; // Una nueva página
                            break;
                        case 2: // HORA
                            lsEvaluaCadena = lsLinea.substring(0, 4);
                            break;
                        case 3: // PROCESO
                            lsEvaluaCadena = lsLinea.substring(49, 56);
                            break;
                        case 4: // TIPO
                            lsEvaluaCadena = lsLinea.substring(0, 4);
                            break;
                        case 5: // CLASE
                            lsEvaluaCadena = lsLinea.substring(2, 7);
                            break;
                        case 6: // ----------
                            lsEvaluaCadena = lsLinea.substring(0, 10);
                            break;
                        default:
                            lsEvaluaCadena = lsLinea.substring(0, 4);
                            if (!lsEvaluaCadena.equals("    ")) { //Titulo Párrafo
                                liFlagTituloParrafo = 1;
                                lsDataTituloParrafo = lsLinea;
                            } else { // Detalle de Párrafo
                                liFlagTituloParrafo = 0;
                                lsDataDetalleParrafo = lsLinea;
                            }
                    }
                    if (validarCadena(lsEvaluaCadena)) {
                        if (liFlagTituloParrafo != 1) { //Detalle de la Data del Titulo del Párrafo

                            oCECuentaDetalle.setTipo(oCECuentaTitulo.getTipo());
                            oCECuentaDetalle.setCodigoTipo(oCECuentaTitulo.getCodigoTipo());
                            oCECuentaDetalle.setCodigoMoneda(oCECuentaTitulo.getCodigoMoneda());
                            oCECuentaDetalle.setNumeroCuentaContable(oCECuentaTitulo.getNumeroCuentaContable());
                            oCECuentaDetalle.setDescripcionCuenta(oCECuentaTitulo.getDescripcionCuenta());
                            oCECuentaDetalle.setDescripcionCruzada(lsDataDetalleParrafo.substring(9, 39));
                            oCECuentaDetalle.setNumeroCuentaContablecruzada(lsDataDetalleParrafo.substring(39, 55));
                            oCECuentaDetalle.setCodigoCruzada(lsDataDetalleParrafo.substring(56, 58));
                            oCECuentaDetalle.setDescripcionCuentacruzada(lsDataDetalleParrafo.substring(60));

                            MOLOG.log(Level.INFO, "oCECuentaDetalle : {0}", oCECuentaDetalle.toString());
                            grabarArchivo(oCECuentaDetalle);
                            oCECuentaDetalle = new CECruceCuenta();

                        } else { // Armar la data de la cabecera del titulo del párrafo
                            oCECuentaTitulo.setTipo(lsDataTituloParrafo.substring(0, 4));
                            oCECuentaTitulo.setCodigoTipo(lsDataTituloParrafo.substring(5, 7));
                            oCECuentaTitulo.setCodigoMoneda(lsDataTituloParrafo.substring(9, 12));
                            oCECuentaTitulo.setNumeroCuentaContable(lsDataTituloParrafo.substring(13, 29));
                            oCECuentaTitulo.setDescripcionCuenta(lsDataTituloParrafo.substring(31));
                        }
                    } else {
                        liContadorFilaTitulo++;
                    }
                }
                moFReader.close();
                moBReader.close();
            }
        }catch (IOException ex) {
            MOLOG.log(Level.SEVERE, lsPath);
            MOLOG.log(Level.SEVERE, ex.getMessage());
        }

    }

    public static boolean validarArchivo(String psArchivo) {
        boolean lbExisteFile;

        moArchivoTexto = new File(psArchivo);
        lbExisteFile = true;

        if (!moArchivoTexto.exists()) {
            System.out.println("Archivo No Existe");
            lbExisteFile = false;
        }
        return lbExisteFile;
    }

    public static boolean validarCadena(String psCadena) {
        boolean lbNoConsiderar;
// fila1 FECHA ==> [0,5]
// fila2 HORA ==> [0,4]
// fila3 PROCESO ==> [49,56]
// fila4 TIPO ==> [0,3]
// fila5 CLASE ==> [2,7]
// fila6 ---------- == [0,9]

        lbNoConsiderar = true;
        switch (psCadena) {
            case "FECHA":
                lbNoConsiderar = false;
                break;
            case "HORA":
                lbNoConsiderar = false;
                break;
            case "PROCESO":
                lbNoConsiderar = false;
                break;
            case "TIPO":
                lbNoConsiderar = false;
                break;
            case "CLASE":
                lbNoConsiderar = false;
                break;
            case "----------":
                lbNoConsiderar = false;
                break;
            default:
                break;
        }
        return lbNoConsiderar;
    }

    public static void grabarArchivo(CECruceCuenta poCECuentaTitulo) {
        String lsPathOutput = "F:\\01Java8\\03Develop\\AEMJSEEVL0201v01EvaluacionJavaIO-JDK8\\src\\resources\\data\\output\\";
        String lsArchivoSalida = "CuentaTextoSalida.txt";
        String lsTrama;

        try {
            moArchivoTextoSalida = new FileWriter(lsPathOutput + lsArchivoSalida, true);
            moPWriter = new PrintWriter(moArchivoTextoSalida);

            lsTrama = poCECuentaTitulo.getTipo() + poCECuentaTitulo.getCodigoTipo() + poCECuentaTitulo.getCodigoMoneda()
                    + poCECuentaTitulo.getNumeroCuentaContable() + poCECuentaTitulo.getDescripcionCuenta()
                    + poCECuentaTitulo.getDescripcionCruzada() + poCECuentaTitulo.getNumeroCuentaContablecruzada()
                    + poCECuentaTitulo.getCodigoCruzada() + poCECuentaTitulo.getDescripcionCuentacruzada();

            moPWriter.println(lsTrama);
            moPWriter.close();
        } catch (IOException ex) {
            MOLOG.log(Level.SEVERE, lsPathOutput);
            MOLOG.log(Level.SEVERE, ex.getMessage());
        }
    }
}
