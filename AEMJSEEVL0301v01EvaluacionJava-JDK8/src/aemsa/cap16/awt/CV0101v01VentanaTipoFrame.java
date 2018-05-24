/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap16.awt;

import java.awt.Frame;

public class CV0101v01VentanaTipoFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame oVentana = new Frame();

        //Definir el tamano de la ventana
        oVentana.setSize(500, 700);
        //Definir el titulo de la ventana
        oVentana.setTitle("Manejo de Ventanas: AWT");
        //Visualizar la ventana
        oVentana.setVisible(true);

    }

}
