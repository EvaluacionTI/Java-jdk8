package pe.aemsa.evalua.java8.logical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class CL0102v01LeerTipoDato {

    private static final Logger MOLOG = Logger.getLogger("CL0102v01LeerTipoDato");

    public static String dato() throws IOException {
        String sdato = "";
        try {
            // Definir un flujo de caracteres de entrada: flujoE
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            // Leer. La entrada finaliza al pulsar la tecla Entrar
            sdato = flujoE.readLine();
            MOLOG.info("Dato tipo String : " + sdato);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return sdato; // devolver el dato tecleado
    }

    public static short datoShort() throws IOException {
        try {
            return Short.parseShort(dato());
        } catch (NumberFormatException e) {
            return Short.MIN_VALUE; // valor más pequeño
        }
    }

    public static int datoInt() throws IOException {
        try {
            return Integer.parseInt(dato());
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE; // valor más pequeño
        }
    }

    public static long datoLong() throws IOException {
        try {
            return Long.parseLong(dato());
        } catch (NumberFormatException e) {
            return Long.MIN_VALUE; // valor más pequeño
        }
    }

    public static float datoFloat() throws IOException {
        try {
            Float f = new Float(dato());
            MOLOG.info("Dato tipo Float : " + f.floatValue());
            return f.floatValue();
        } catch (NumberFormatException e) {
            return Float.NaN; // No es un Número; valor float.
        }
    }

    public static double datoDouble() throws IOException {
        try {
            Double d = new Double(dato());
            MOLOG.info("Dato tipo Double : " + d.doubleValue());
            return d.doubleValue();
        } catch (NumberFormatException e) {
            return Double.NaN; // No es un Número; valor double.
        }
    }

    public static char caracter() {
        try {
            char c = 0;
            MOLOG.info("Dato tipo caracter : " + c);
            return c;
        } catch (Exception ex) {

        }
        return 0;
    }
}
