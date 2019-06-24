package pe.etg.bbva.evalua.java8.view.quiz1;

import java.util.Scanner;

public class CV0301v02NumberParImpar {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner( System.in );

        System.out.printf( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
    }
    
}
