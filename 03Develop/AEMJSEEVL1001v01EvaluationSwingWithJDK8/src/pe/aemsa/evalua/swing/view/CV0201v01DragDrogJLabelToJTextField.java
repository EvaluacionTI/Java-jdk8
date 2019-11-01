package pe.aemsa.evalua.swing.view;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

public class CV0201v01DragDrogJLabelToJTextField {

    private final JTextField oJTextFieldDragDrog;
    private final JLabel oJLabelDragDrog;
    private final JPanel oJPanel;

    public static void main(String[] args) {
        CV0201v01DragDrogJLabelToJTextField oDDView = new CV0201v01DragDrogJLabelToJTextField();
    }

    public CV0201v01DragDrogJLabelToJTextField() {
        JFrame oFrameMain = new JFrame("Evaluación Swing : Drag and Drop");
        oJPanel = new JPanel();
        oJLabelDragDrog = new JLabel("El texto de la etiqueta se debe arrastrar");
        oJTextFieldDragDrog = new JTextField(40);

        //especificamos qué tipo de dato vamos a transferir
        oJLabelDragDrog.setTransferHandler(new TransferHandler("text"));
        
        MouseListener oML = new MouseAdapter() {
            //creamos el método para transferir
            //datos al presionar con el ratón
            @Override
            public void mousePressed(MouseEvent e) {
                JComponent oJC = (JComponent) e.getSource();
                TransferHandler oTH = oJC.getTransferHandler();
                oTH.exportAsDrag(oJC, e, TransferHandler.COPY);
            }
        };

        oJLabelDragDrog.addMouseListener(oML);
        oJPanel.add(oJLabelDragDrog);
        oJPanel.add(oJTextFieldDragDrog);

        oFrameMain.add(oJPanel); //añadimos el panel al marco
        oFrameMain.setSize(800, 600); //le ponemos las medidas que queramos
        oFrameMain.setLayout(new FlowLayout());
        oFrameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oFrameMain.setLocationRelativeTo(null);
        oFrameMain.setVisible(true);
    }
}
