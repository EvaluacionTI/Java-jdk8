package pe.aemsa.cap29.swing04.windows;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class CV0202v01JFrameCodigoMostrarMensaje extends JFrame {
    // Referencias a los componentes

    private JLabel etiqueta;
    private JButton boton;
    // Otras referencias
    static String mensaje = "..... Aplicacion Swing ..... !!!";

    private CV0202v01JFrameCodigoMostrarMensaje(String titulo) // constructor
    {
        super(titulo); // t�tulo de la ventana principal
        iniciarComponentes();
        // Ajustar el tama�o de la ventana al m�nimo
        pack();
    }

    private void iniciarComponentes() {
        // Crear una etiqueta con el texto centrado
        etiqueta = new JLabel();
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        // Crear un bot�n
        boton = new JButton("Haga clic aqu�");
        // Establecer como tecla aceleradora la C. Entonces, pulsar Alt+C
        // ser� equivalente ha hacer clic, sobre el bot�n.
        boton.setMnemonic(KeyEvent.VK_C);
        // Asignar al bot�n una descripci�n abreviada
        boton.setToolTipText("bot�n de pulsaci�n");
        // Permitir que el bot�n responda a los eventos de acci�n
        ActionListener al =
                new ActionListener() {
            // Este m�todo se ejecutar� cuando se haga clic en "bot�n"
            public void actionPerformed(ActionEvent evento) {
                Object obj = evento.getSource();
                if (obj == boton) {
                    mostrarMensaje();
                }
            }
        };
        boton.addActionListener(al);

        // Crear un panel para colocar los controles
        JPanel panel = new JPanel();
        // Introducimos un borde sin pintar alrededor de los controles:
        // createEmptyBorder(top, left, bottom, right)
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        // Establecer un administrador de dise�o de cuadr�cula
        panel.setLayout(new GridLayout(0, 1));
        // Los controles se a�aden en columna (filas = 0)
        panel.add(etiqueta);
        panel.add(boton);

        // A�adir los componentes al contenedor de la aplicaci�n
        getContentPane().add(panel, BorderLayout.CENTER);

        // Permitir que la ventana de la aplicaci�n responda a los
        // eventos de ventana (p.e. cerrar la ventana)
        addWindowListener(
                new WindowAdapter() {
            public void windowClosing(WindowEvent evento) {
                cerrarVentana();
            }
        });
    }

    private void mostrarMensaje() {
        // Mostrar el "mensaje" en la "etiqueta"
        etiqueta.setText(mensaje);
    }

    private void cerrarVentana() {
        // Salir de la aplicaci�n
        System.exit(0);
    }

    public static void main(String[] args) {
        try {
            // Aspecto y percepci�n de la interfaz gr�fica
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el aspecto deseado: " + e);
        }
        CV0202v01JFrameCodigoMostrarMensaje vPpal = new CV0202v01JFrameCodigoMostrarMensaje("Aplicaci�n Swing");
        vPpal.show();
    }
}