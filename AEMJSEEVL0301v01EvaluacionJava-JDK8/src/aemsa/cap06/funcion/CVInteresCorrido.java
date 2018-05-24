package aemsa.cap06.funcion;

public class CVInteresCorrido {

    public static void main(String[] args) {

        // 1. Declarar Variables

        double mTea;
        double mImportePrestamo;
        double mInteresCorrido, mBase, mExponente;
        int mPlazo;

        // 2. Asignar Valores
        mTea = 25;
        mImportePrestamo = 25000;
        mPlazo = 1;

        // 3. Calcular y utilizar la formula del interes
        mBase = (1 + (mTea * 0.01));
        mExponente = (mPlazo / 360);
        mInteresCorrido = (Math.pow(mBase, mExponente) - 1)*mImportePrestamo;

        // 4. Mostrar resultados
        System.out.println("Datos del Interes");
        System.out.println("Tea = " + mTea + "%");
        System.out.println("Monto Prestamo = " + mImportePrestamo + " en Nuevos Soles");
        System.out.println("Plazo = " + mPlazo + " dia ");
        System.out.println("===========================");
        System.out.println("Base = " + mBase);
        System.out.println("Exponente = " + mExponente);
        System.out.println("Interes Corrido = " + mInteresCorrido);
    }
}
