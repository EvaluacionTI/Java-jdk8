package aemsa.cap04.iteracion;

import javax.swing.JOptionPane;

public class CV01v05ForTablaMultiplicarDescendente {

    public static void main(String[] args) {
        String lsNumero = null;
        int liNumeroTabla, liContador;
        int liNumeroTope = 20;
        int liContadorTabla = 20;

        lsNumero = JOptionPane.showInputDialog("Tabla Numero =");

        liNumeroTabla = Integer.parseInt(lsNumero);

        for (liContador = liNumeroTope; liContador > 0; liContador--) {
            if (liContadorTabla == 2){
                liContador = 0;
            }
            if (liContadorTabla == 20) {
                System.out.println(liNumeroTabla + " * " + liContadorTabla + " = " + 
                        liContadorTabla * liNumeroTabla + " * ");
            } else if (liContadorTabla == 10) {
                System.out.println(liNumeroTabla + " * " + liContadorTabla + " = " + 
                        liContadorTabla * liNumeroTabla + " * ");
            } else {
                System.out.println(liNumeroTabla + " * " + liContadorTabla + " = " + 
                        liContadorTabla * liNumeroTabla);
            }
            liContadorTabla -= 2;

        }

    }
}
