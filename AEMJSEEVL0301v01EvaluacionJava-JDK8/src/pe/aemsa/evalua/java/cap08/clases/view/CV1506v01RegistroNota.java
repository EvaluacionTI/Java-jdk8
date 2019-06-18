package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO08v01ClaseLectura;

public class CV1506v01RegistroNota {

    public static void main(String[] args) {
        double n1;
        double n2;
        double nf;
        String mensaje = "";
        System.out.print("Nota 1:");
        n1 = CO08v01ClaseLectura.leerDouble();
        System.out.print("Nota 2:");
        n2 = CO08v01ClaseLectura.leerDouble();
        System.out.print("Nota Final:");
        nf = (n1 + n2) / 4;
        if (nf <= 18);
        {
            mensaje = "Felicitaciones";
            System.out.print(mensaje);

        }
    }
}
