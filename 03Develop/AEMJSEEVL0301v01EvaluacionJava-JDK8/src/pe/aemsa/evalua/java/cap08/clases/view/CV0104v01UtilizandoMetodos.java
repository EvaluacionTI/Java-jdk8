package pe.aemsa.evalua.java.cap08.clases.view;

import pe.aemsa.evalua.java.cap08.clases.view.CO0101v01VisualizarMensaje;

public class CV0104v01UtilizandoMetodos {

    public static void main(String[] args) {

        CO0101v01VisualizarMensaje oVerMensaje = new CO0101v01VisualizarMensaje();

        oVerMensaje.mensaje();

    }

    public void mensaje(){
        double dImporteGenerado = 7874.44;

        System.out.println("Valor de Salida" + dImporteGenerado);
    }

}
