package pe.unjfsc.ads.java8.view;

import java.util.Scanner;

public class CV02NumberPrimeFor {

    public static void main(String[] args) {
        
        System.out.print("Ingresa un numero: ");

        int contador, I, numero;

        Scanner obtenerNumero = new Scanner(System.in);        
        numero = obtenerNumero.nextInt();

        contador = 0;

        for (I = 1; I <= numero; I++) {
            if ((numero % I) == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

}
