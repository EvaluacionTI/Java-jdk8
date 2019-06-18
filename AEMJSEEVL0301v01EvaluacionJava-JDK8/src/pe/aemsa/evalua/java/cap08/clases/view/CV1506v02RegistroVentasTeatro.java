/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO08v01ClaseLectura;

public class CV1506v02RegistroVentasTeatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char dia;
        char localidad;
        double precioneto = 0, preciobruto = 0, descuento = 0;

        System.out.print("INGRESE EL DIA:");
        dia = CO08v01ClaseLectura.leerChar();
        System.out.print("INGRESE LA LOCALIDAD:");
        localidad = CO08v01ClaseLectura.leerChar();

        if (dia == 'v' && localidad == 'p') {
            preciobruto = 80;
            descuento = preciobruto * 0.10;
            precioneto = preciobruto - descuento;
        } else {
            if (dia == 'v' && localidad == 'P') {
                preciobruto = 60;
                descuento = preciobruto * 0.10;
                precioneto = preciobruto - descuento;
            } else {
                if (dia == 'v' && localidad == 'm') {
                    preciobruto = 50;
                    descuento = preciobruto * 0.10;
                    precioneto = preciobruto - descuento;
                } else {
                    if (dia == 's' && localidad == 'p') {
                        preciobruto = 80;
                        descuento = preciobruto * 0.05;
                        precioneto = preciobruto - descuento;
                    } else {
                        if (dia == 's' && localidad == 'P') {
                            preciobruto = descuento = preciobruto * 0.05;
                            precioneto = preciobruto - descuento;
                        } else {
                            if (dia == 's' && localidad == 'm') {
                                preciobruto = 50;
                                descuento = preciobruto * 0.05;
                                precioneto = preciobruto - descuento;
                            } else {
                                if (dia == 'd' && localidad == 'p') {
                                    preciobruto = 80;
                                    descuento = preciobruto * 0.03;
                                    precioneto = preciobruto - descuento;
                                } else {
                                    if (dia == 'd' && localidad == 'P') {
                                        descuento = preciobruto * 0.03;
                                        precioneto = preciobruto - descuento;
                                    } else {
                                        if (dia == 'd' && localidad == 'm') {
                                            preciobruto = 50;
                                            descuento = preciobruto * 0.03;
                                            precioneto = preciobruto - descuento;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("PRECIO BRUTO:" + preciobruto);
        System.out.println("DESCUENTO:" + descuento);
        System.out.print("PRECIO NETO:" + precioneto);


    }
}
