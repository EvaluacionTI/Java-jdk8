package pe.aemsa.evalua.swing.view;

import java.awt.BorderLayout;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class CV0101v01DragDrogJColorChooser {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Doble Selector de Color ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JColorChooser izquierda = new JColorChooser();
        izquierda.setDragEnabled(true);
        frame.add(izquierda, BorderLayout.WEST);
        
        JColorChooser derecha = new JColorChooser();
        derecha.setDragEnabled(true);
        frame.add(derecha, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }

}
