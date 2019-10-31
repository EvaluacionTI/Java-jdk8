package aemsa.cap04.iteracion;

import javax.swing.JOptionPane;

public class CV01v04ForTablaMultiplicarAscendente {

    public static void main(String[] args) {
        String lsNumero = null;
        int liNumeroTabla, liContador;
        int liNumeroTope = 13;

        lsNumero = JOptionPane.showInputDialog("Tabla Numero =");
        
        liNumeroTabla = Integer.parseInt(lsNumero);
        
        for (liContador=1; liContador<liNumeroTope; liContador++){
            System.out.println( liNumeroTabla + " * " + liContador +" = " + liContador*liNumeroTabla);
        }
            
    }

}
