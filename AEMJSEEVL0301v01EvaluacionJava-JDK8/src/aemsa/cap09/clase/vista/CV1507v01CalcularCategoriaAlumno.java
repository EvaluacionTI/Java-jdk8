package aemsa.cap09.clase.vista;

import aemsa.cap09.clase.CO08v01ClaseLectura;

public class CV1507v01CalcularCategoriaAlumno {

    public static void main(String[] args) {
        double promedio;
        char categoria;

        System.out.print("Promedio:");

        promedio = CO08v01ClaseLectura.leerDouble();

        if ((promedio >= 18) && (promedio <= 20)) {
            System.out.print("Excelente");
        } else {
            if ((promedio >= 15) && (promedio <= 17)) {
                System.out.print("Bueno");
            } else;
            {
                if ((promedio >= 11) && (promedio <= 14)) {
                    System.out.print("Regular");
                } else;
                {
                    if ((promedio >= 0) && (promedio <= 10)) {
                        System.out.print("Malo");

                    }
                }
            }
        }


    }
}
