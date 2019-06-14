// Suma de polinomios dependientes de dos variables.
// Esta aplicaci�n utiliza la clase Leer.
//
package aemsa.cap09.clase.vista;

import pe.aemsa.cap09.clase.CO06v01LeerTipoDato;
import pe.aemsa.cap09.clase.CO07v01TerminoPolinomio;
import pe.aemsa.cap09.clase.CO07v02CalcularPolinomio;
import java.io.IOException;

public class CV1505v01EvaluarPolinomio {

    public static CO07v01TerminoPolinomio leerTermino() throws IOException {
        CO07v01TerminoPolinomio ptx = null;
        double coef;
        int expx, expy;


        System.out.print("Coeficiente:    ");
        coef = CO06v01LeerTipoDato.datoDouble();
        System.out.print("Exponente en X: ");
        expx = CO06v01LeerTipoDato.datoInt();
        System.out.print("Exponente en Y: ");
        expy = CO06v01LeerTipoDato.datoInt();
        System.out.println();
        if (coef == 0 && expx == 0 && expy == 0) {
            return null;
        }
        ptx = new CO07v01TerminoPolinomio(coef, expx, expy);
        return ptx;
    }

    public static void main(String[] args) throws IOException {
        // Definir los polinomios a sumar
        CO07v02CalcularPolinomio polinomioA = new CO07v02CalcularPolinomio();
        CO07v02CalcularPolinomio polinomioB = new CO07v02CalcularPolinomio();
        // Declarar una referencia al polinomio resultante
        CO07v02CalcularPolinomio polinomioR;
        // Declarar una referencia a un t�rmino cualquiera
        CO07v01TerminoPolinomio ptx = null; // puntero a un t�rmino
        // Leer los t�rminos del primer sumando
        System.out.print("T�rminos del polinomio A "
                + "(para finalizar introduzca 0 para el\n"
                + "coeficiente y para los exponentes).\n\n");
        ptx = leerTermino();
        while (ptx != null) {
            polinomioA.insertarTermino(ptx);
            ptx = leerTermino();
        }
        // Leer los t�rminos del segundo sumando
        System.out.println("T�rminos del polinomio B "
                + "(para finalizar introduzca 0 para el\n"
                + "coeficiente y para los exponentes).\n\n");
        ptx = leerTermino();
        while (ptx != null) {
            polinomioB.insertarTermino(ptx);
            ptx = leerTermino();
        }
        // Sumar los dos polinomios le�dos
        polinomioR = polinomioA.sumar(polinomioB);

        // Visualizar el primer sumando
        System.out.print("Polinomio A: ");
        polinomioA.mostrarPolinomio();
        System.out.println();
        // Visualizar el segundo sumando
        System.out.print("Polinomio B: ");
        polinomioB.mostrarPolinomio();
        System.out.println();
        // Visualizar el polinomio suma
        System.out.print("Polinomio R: ");
        polinomioR.mostrarPolinomio();
        System.out.println();

        // Visualizar el valor del polinomio suma para x = 1 e y = 1
        System.out.println("Para x = 1 e y = 1, el valor es: "
                + polinomioR.valorPolonomio(1, 1));
    }
}
