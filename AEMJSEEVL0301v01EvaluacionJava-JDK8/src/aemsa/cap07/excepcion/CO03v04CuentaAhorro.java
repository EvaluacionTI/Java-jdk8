package aemsa.cap07.excepcion;

//////////////////////////////////////////////////////////////////
import java.util.Calendar;
import java.util.GregorianCalendar;

// Clase CO03v04CuentaAhorro: clase derivada de CO03v07Cuenta
//
public class CO03v04CuentaAhorro extends CO03v07Cuenta {
    // Atributos

    private double cuotaMantenimiento;

    // M�todos
    public CO03v04CuentaAhorro() {
    } // constructor sin par�metros

    public CO03v04CuentaAhorro(String nom, String cue, double sal,
            double tipo, double mant) {
        super(nom, cue, sal, tipo); // invoca al constructor CO03v07Cuenta
        asignarCuotaManten(mant);   // inicia cuotaMantenimiento
    }

    public void asignarCuotaManten(double cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: cantidad negativa");
            return;
        }
        cuotaMantenimiento = cantidad;
    }

    public double obtenerCuotaManten() {
        return cuotaMantenimiento;
    }

    public void comisiones() {
        // Se aplican mensualmente por el mantenimiento de la cuenta
        GregorianCalendar fechaActual = new GregorianCalendar();
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        if (dia == 1) {
            reintegro(cuotaMantenimiento);
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
        interesesProducidos = estado() * obtenerTipoDeInteres() / 1200.0;
        ingreso(interesesProducidos);

        // Devolver el inter�s mensual por si fuera necesario
        return interesesProducidos;
    }
}

