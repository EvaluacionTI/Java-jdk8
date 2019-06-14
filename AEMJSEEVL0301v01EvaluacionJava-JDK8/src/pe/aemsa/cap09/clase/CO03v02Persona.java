package pe.aemsa.cap09.clase;


public class CO03v02Persona {

    private String nombre;
    private CFecha fechaNacimiento;

    private class CFecha {

        private int dia , mes, ano ;

        private CFecha(int dd, int mm, int aa) {
            dia = dd;
            mes = mm;
            ano = aa;
        }
    }

    public CO03v02Persona() {
    }

    public CO03v02Persona(String nom, int dd, int mm, int aa) {
        nombre = nom;
        fechaNacimiento = new CFecha(dd, mm, aa);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerFechaNa() {
        return fechaNacimiento.dia + "/"
                + fechaNacimiento.mes + "/"
                + fechaNacimiento.ano;
    }
}
