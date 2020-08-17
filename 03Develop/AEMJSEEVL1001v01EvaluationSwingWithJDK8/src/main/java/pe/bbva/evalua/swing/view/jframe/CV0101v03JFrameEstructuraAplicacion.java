package pe.bbva.evalua.swing.view.jframe;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class CV0101v03JFrameEstructuraAplicacion extends JFrame {
    // Referencias a los componentes

    // Otras referencias
    private CV0101v03JFrameEstructuraAplicacion(String titulo) // constructor
    {
        super(titulo); // t�tulo de la ventana principal
        iniciarComponentes();
        // Ajustar el tama�o de la ventana al m�nimo
        pack();
    }

    private void iniciarComponentes() {
        /* Este m�todo es llamado desde el constructor para iniciar la
         * ventana principal, tambi�n llamada formulario.
         */

        // Permitir que la ventana de la aplicaci�n reciba los eventos
        // de ventana (p.e. cerrar la ventana)
        addWindowListener(
                new WindowAdapter() {
            public void windowClosing(WindowEvent evento) {
                cerrarVentana(evento);
            }
        });
    }

    private void cerrarVentana(WindowEvent evento) {
        // Salir de la aplicaci�n
        System.exit(0);
    }

    public static void main(String[] args) {
        CV0101v03JFrameEstructuraAplicacion miApp = new CV0101v03JFrameEstructuraAplicacion("Aplicacion Swing");
        miApp.show();
    }
}
