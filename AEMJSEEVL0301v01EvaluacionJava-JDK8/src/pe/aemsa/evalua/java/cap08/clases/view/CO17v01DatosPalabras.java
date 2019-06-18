package pe.aemsa.evalua.java.cap08.clases.view;

public class CO17v01DatosPalabras {
    // Atributos

    private String palabra;
    private int contador;

    // M�todos
    public CO17v01DatosPalabras() {
    }        // constructor sin par�metros

    public CO17v01DatosPalabras(String pal) // constructor con un par�metro
    {
        palabra = pal;
        contador = 0;
    }

    public CO17v01DatosPalabras(String pal, int cont) // constructor con dos par�metros
    {
        palabra = pal;
        contador = cont;
    }

    public void asignarPalabra(String pal) {
        palabra = pal;
    }

    public String obtenerPalabra() {
        return palabra;
    }

    public void asignarContador(int cont) {
        contador = cont;
    }

    public int obtenerContador() {
        return contador;
    }
}
