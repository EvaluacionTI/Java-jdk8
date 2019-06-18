package pe.aemsa.evalua.java.cap11.excepciones.entity;

import pe.aemsa.evalua.java.cap08.clases.view.CO09v04CuentaCorriente;
import java.util.Calendar;
import java.util.GregorianCalendar;

//////////////////////////////////////////////////////////////////
// Clase CO03v05CuentaCorrienteConIn: clase derivada de CO09v04CuentaCorriente
//
public class CO03v05CuentaCorrienteConIn extends CO09v04CuentaCorriente {
    // M�todos

    public CO03v05CuentaCorrienteConIn() {
    } // constructor sin par�metros

    public CO03v05CuentaCorrienteConIn(String nom, String cue, double sal,
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
