package aemsa.cap06.funcion;

import java.util.Date;

public class CV01v01FuncionRandom {
    // N�meros aleatorios entre 0 y 1

    public static double generarAleatorio(int[] random) {
        random[0] = (25173 * random[0] + 13849) % 65536;
        return ((double) random[0] / 65535);
    }

    public static void main(String[] args) {

        System.out.println("Fecha del Sistema como objeto" + new Date());
        System.out.println("Fecha y Hora del Sistema como objeto" + new Date().getTime());

        int inicio = (int) ((new Date()).getTime() % 65536); // semilla
        int[] random = {inicio}; // random = n�mero entre 0 y 65535

        System.out.print("Inicio = " + inicio + "\n");
        System.out.print("Random = " + random + "\n");
        // Generar n�meros seudoaleatorios
        double n;
        for (int i = 10; i != 0; i--) {
            n = generarAleatorio(random);
            System.out.println("Secuencia = " + i + "    " + n);
        }
    }
}
