package aemsa.cap07.excepcion;

import java.io.PrintWriter;

public class CO03v03ListaClientes {

    private String[] listaClientes;
    private int nElementos;

    public CO03v03ListaClientes(int n) {
        nElementos = n;
        listaClientes = new String[n];
    }

    public void anadir(String nombre, int i) {
        listaClientes[i] = nombre + "\n";
    }

    public void escribir(PrintWriter fcli) {
        for (int i = 0; i < listaClientes.length; i++) {
            fcli.write(listaClientes[i]);
        }
    }
}
