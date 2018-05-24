package aemsa.cap09.clase.vista;

import aemsa.cap09.clase.CO08v01ClaseLectura;

public class CV1507v02CalcularDescuento {

    public static void main(String[] args) {
        String nombreTelevisor;
        String nombre1 = "Samsung";
        String nombre2 = "Sony";
        String nombre3 = "LG";
        String nombre4 = "Philips";
        double descuento;
        System.out.println("CALCULAR DESCUENTO DE UN TELEVISOR");
        System.out.print("Marca del televisor: ");
        nombreTelevisor = CO08v01ClaseLectura.leerString();
        if (nombreTelevisor.compareTo(nombre1) == 0) {
            descuento = 500 * 0.1;
            System.out.print("El Descuento es de:" + descuento);
        } else if (nombreTelevisor.compareTo(nombre2) == 0) {
            descuento = 1000 * 0.05;
            System.out.print("El Descuento es de:" + descuento);
        } else if (nombreTelevisor.compareTo(nombre3) == 0) {
            descuento = 900 * 0.08;
            System.out.print("El Descuento es de:" + descuento);
        } else if (nombreTelevisor.compareTo(nombre4) == 0) {
            descuento = 800 * 0.10;
            System.out.print("El Descuento es de:" + descuento);
        } else {
            System.out.print("No hay Descuento");
        }
    }
}
