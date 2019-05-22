package pe.aemsa.cap29.swing04.windows;

import javax.swing.JOptionPane;

public class CV0403v01JOptionExponencial {

    static String msBase;
    static double mdBase;

    public static void main(String[] args) {
        double ldExponencial;
        
        msBase = JOptionPane.showInputDialog("Ingrese el numero");
        mdBase = Double.parseDouble(msBase);

        ldExponencial = exponencial(mdBase);
        System.out.println("exp(" + msBase + ") = " + ldExponencial);
        JOptionPane.showMessageDialog(null, ldExponencial);
    }

    static double exponencial(double pdExponente) {

        //1.0 Declaro variables
        int liNumero = 1;
        double ldExponencial, ldTermino = 1;

        //2.0 Procesando o calculando
        ldExponencial = ldTermino;    // primer t�rmino
        while (ldTermino > 1e-7) {
            ldTermino *= pdExponente / liNumero; // siguiente t�rmino
            ldExponencial += ldTermino; // sumar otro t�rmino
            liNumero++;
        }
        //3.0 Retornando valores
        return ldExponencial;
    }
}
