package aemsa.cap07.excepcion;

//////////////////////////////////////////////////////////////////
// Clase CO03v07Cuenta: clase abstracta que agrupa los datos comunes a
// cualquier tipo de cuenta bancaria.
//
public abstract class CO03v07Cuenta {
    // Atributos

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    // M�todos
    public CO03v07Cuenta() {
    }

    ;
  public CO03v07Cuenta(String nom, String cue, double sal, double tipo) {
        asignarNombre(nom);
        asignarCuenta(cue);
        ingreso(sal);
        asignarTipoDeInteres(tipo);
    }

    public void asignarNombre(String nom) {
        if (nom.length() == 0) {
            System.out.println("Error: cadena vac�a");
            return;
        }
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarCuenta(String cue) {
        if (cue.length() == 0) {
            System.out.println("Error: cuenta no v�lida");
            return;
        }
        cuenta = cue;
    }

    public String obtenerCuenta() {
        return cuenta;
    }

    public double estado() {
        return saldo;
    }

    public abstract void comisiones();

    public abstract double intereses();

    public void ingreso(double cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: cantidad negativa");
            return;
        }
        saldo += cantidad;
    }

    public void reintegro(double cantidad) {
        if (saldo - cantidad < 0) {
            System.out.println("Error: no dispone de saldo");
            return;
        }
        saldo -= cantidad;
    }

    public void asignarTipoDeInteres(double tipo) {
        if (tipo < 0) {
            System.out.println("Error: tipo no v�lido");
            return;
        }
        tipoDeInteres = tipo;
    }

    public double obtenerTipoDeInteres() {
        return tipoDeInteres;
    }
}
