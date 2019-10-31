package aemsa.cap16.awt;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class VentanaTipoFrame extends Frame{
    VentanaTipoFrame(String lStrTitulo){
        super(lStrTitulo);

        GestorVentana oGestorVentana = new GestorVentana(this);

        addWindowListener(oGestorVentana);

    }

    public void paint(Graphics g){
        g.drawString("Ventana tipo frame", WIDTH, WIDTH);
    }


}

class GestorVentana extends WindowAdapter{
    VentanaTipoFrame oVentanaFrame;

    public GestorVentana(VentanaTipoFrame poVentanaFrame){
        this.oVentanaFrame = poVentanaFrame;
    }

    public void CerrarVentana(WindowEvent poVentanaEvento){
        oVentanaFrame.setVisible(false);
    }
}

// Creacion de una ventana Frame en un Applet
// 1. Crear un subclase tipo frame
// 2. Escribir los metodos init, start, stop y paint
public class CV0102v01VentanaFrameEnApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */

    Frame oFrame;

    public void init() {
        // TODO start asynchronous download of heavy resources
        oFrame = new VentanaTipoFrame("Ventana Tipo Frame");

        oFrame.setSize(250, WIDTH);
        oFrame.setVisible(true);

    }

    // TODO overwrite start(), stop() and destroy() methods

    public void start(){
        oFrame.setVisible(true);
    }

    public void stop(){
        oFrame.setVisible(false);
    }

    public void paint(Graphics g){
        g.drawString("Esta ventana tipo Applet", WIDTH, WIDTH);
    }
}
