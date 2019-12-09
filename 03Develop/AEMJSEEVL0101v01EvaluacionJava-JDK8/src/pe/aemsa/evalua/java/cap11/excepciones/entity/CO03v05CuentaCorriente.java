package pe.aemsa.evalua.java.cap11.excepciones.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

//////////////////////////////////////////////////////////////////
// Clase CO03v05CuentaCorriente: clase derivada de CO03v07Cuenta
//
public class CO03v05CuentaCorriente extends CO03v07Cuenta {
    // Atributos

    private int transacciones;
    private double importePorTrans;
    private int transExentas;

    // M�todos
    public CO03v05CuentaCorriente() {
    } // constructor sin par�metros

    public CO03v05CuentaCorriente(String nom, String cue, double sal,
            double tipo, double imptrans, int transex) {
        super(nom, cue, sal, tipo);       // invoca al constructor CO03v07Cuenta
        transacciones = 0;                // inicia transacciones
        asignarImportePorTrans(imptrans); // inicia importePorTrans
        asignarTransExentas(transex);     // inicia transExentas
    }

    public void decrementarTransacciones() {
        transacciones--;
    }

    public void asignarImportePorTrans(double imptrans) {
        if (imptrans < 0) {
            System.out.println("Error: cantidad negativa");
            return;
        }
        importePorTrans = imptrans;
    }

    public double obtenerImportePorTrans() {
        return importePorTrans;
    }

    public void asignarTransExentas(int transex) {
        if (transex < 0) {
            System.out.println("Error: cantidad negativa");
            return;
        }
        transExentas = transex;
    }

    public int obtenerTransExentas() {
        return transExentas;
    }

    public void ingreso(double cantidad) {
        super.ingreso(cantidad);
        transacciones++;
    }

    public void reintegro(double cantidad) {
        super.reintegro(cantidad);
        transacciones++;
    }

    public void comisiones() {
        // Se aplican mensualmente por el mantenimiento de la cuenta
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);
        if (dia == 1) {
            int n = transacciones - transExentas;
            if (n > 0) {
                reintegro(n * importePorTrans);
            }
            transacciones = 0;
        }
    }

    public double intereses() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        if (dia != 1) {
            return 0.0;
        }

        // Acumular los intereses por mes s�lo los d�as 1 de cada mes
        double interesesProducidos = 0.0;
        // Hasta 3000 euros al 0.5%. El resto al inter�s establecido.
        if (estado() <= 3000) {
            interesesProducidos = estado() * 0.5 / 1200.0;
        } else {
            interesesProducidos = 3000 * 0.5 / 1200.0
                    + (estado() - 3000) * obtenerTipoDeInteres() / 1200.0;
        }
        ingreso(interesesProducidos);
        // Este ingreso no debe incrementar las transacciones
        decrementarTransacciones();

        // Devolver el inter�s mensual por si fuera necesario
        return interesesProducidos;
    }
}
//////////////////////////////////////////////////////////////////
