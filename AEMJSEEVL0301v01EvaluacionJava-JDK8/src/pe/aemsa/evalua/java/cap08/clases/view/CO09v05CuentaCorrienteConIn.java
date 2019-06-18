package pe.aemsa.evalua.java.cap08.clases.view;

import java.util.*;
//////////////////////////////////////////////////////////////////
// Clase CO09v05CuentaCorrienteConIn: clase derivada de CO09v04CuentaCorriente
//
public class CO09v05CuentaCorrienteConIn extends CO09v04CuentaCorriente {
    // M�todos

    public CO09v05CuentaCorrienteConIn() {
    } // constructor sin par�metros

    public CO09v05CuentaCorrienteConIn(String nom, String cue, double sal,
            double tipo, double imptrans, int transex) {
        // Invocar al constructor de la superclase
        super(nom, cue, sal, tipo, imptrans, transex);
    }

    public double intereses() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        if (dia != 1 || estado() < 3000) {
            return 0.0;
        }

        // Acumular inter�s mensual s�lo los d�as 1 de cada mes
        double interesesProducidos = 0.0;
        interesesProducidos = estado() * obtenerTipoDeInteres() / 1200.0;
        ingreso(interesesProducidos);
        // Este ingreso no debe incrementar las transacciones
        decrementarTransacciones();

        // Devolver el inter�s mensual por si fuera necesario
        return interesesProducidos;
    }
}
//////////////////////////////////////////////////////////////////
