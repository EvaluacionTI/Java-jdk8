/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO0102v01DefineClaseInterna;

public class CV0201v04LlamarClaseExterna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CO0102v01DefineClaseInterna oOrdenador = new CO0102v01DefineClaseInterna();

        System.out.println("La clase principal hace refencia a una clase definida en el mismo package");

        oOrdenador.Marca = "Hyundai";
        oOrdenador.Procesador = "Intel Pentium";
        oOrdenador.Pantalla = "TFT";
        oOrdenador.EncenderOrdenador();
        oOrdenador.Estado();

    }

}
