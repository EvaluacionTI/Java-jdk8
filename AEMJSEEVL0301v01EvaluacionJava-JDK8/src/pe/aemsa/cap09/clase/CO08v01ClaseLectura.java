package pe.aemsa.cap09.clase;

import java.io.*;
/*
 * Clase que permite capturar literales desde el teclado.
 *
 */

public class CO08v01ClaseLectura {

    /**
     * Retoma un char capturado desde el teclado.
     */
    public static char leerChar() {
        char c = ' ';
        char[] c1 = leerString().toCharArray();
        if (c1.length == 1) {
            c = c1[0];
        }
        return c;
    }

    public static double leerDouble() {
        try {
            return Double.valueOf(leerString()).doubleValue();
        } catch (NumberFormatException e) {
            System.out.print("ERROR... \n Ingrese de nuevo : ");
            return leerDouble();
        }
    }

    /**
     * Retoma un literal float capturado desde el teclado.
     */
    public static float leerFloat() {
        try {
            return Float.valueOf(leerString()).floatValue();
        } catch (NumberFormatException e) {
            System.out.print("ERROR... \n Ingrese de nuevo:");
            return leerFloat();
        }
    }

    /**
     * Retorna un literal int capturado desde el teclado.
     */
    public static int leerInt() {
        try {
            return Integer.parseInt(leerString());
        } catch (NumberFormatException e) {
            System.out.print("ERROR... \n Ingrese de nuevo:");
            return leerInt();
        }
    }

    /**
     * Retoma un literal \or\g capturado desde el teclado.
     */
    public static long leerLong() {
        try {
            return Long.valueOf(leerString()).longValue();
        } catch (NumberFormatException e) {
            System.out.print("ERROR... \n Ingrese de nuevo:");
            return leerLong();
        }
    }

    /**
     * Retorna un literal short capturado desde el teclado.
     */
    public static short leerShort() {
        try {
            return Short.valueOf(leerString()).shortValue();
        } catch (NumberFormatException e) {
            System.out.print("ERROR... \n Ingrese de nuevo:");
            return leerShort();
        }
    }

    /**
     * Retorna una cadena capturada desde el teclado.
     */
    public static String leerString() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        try {
            cadena = in.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        return cadena;
    }
}
