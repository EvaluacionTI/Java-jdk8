
package pe.aemsa.cap29.swing04.windows;

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
/*
    Objetivo             :  Drag and Drop en JLabel
    Requerimiento   :   Arrastrar el texto de la etiqueta definida en un label a la caja de texto
    
*/
public class CV0205v03JFrameJLabelMousePressed extends JFrame{

    private JTextField textField;
    private JLabel label;
    private JPanel panel;
    
    public CV0205v03JFrameJLabelMousePressed(){
        // 1.0 Definimos la información del JFrame
        JFrame oFrame = new JFrame("JFrame with Drag and Drop and mousePressed");
        panel = new JPanel();   
        textField = new JTextField(40);
        label = new JLabel("Ingresar el texto que desea arrastrar : ");
        
        panel.add(label);
        panel.add(textField);
        oFrame.add(panel); //añadimos el panel al marco
        oFrame.setSize(700,200); //le ponemos las medidas que queramos
        oFrame.setLayout(new FlowLayout()); 
        oFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        oFrame.setLocationRelativeTo(null);
        oFrame.setVisible(true);
        
        //2.0 especificamos qué tipo de dato vamos a transferir
        label.setTransferHandler(new TransferHandler("text"));
        
        //3.0 //creamos el método para transferir
        //datos al presionar con el ratón
        MouseListener oML = new MouseAdapter() {
            //creamos el método para transferir
            //datos al presionar con el ratón
            public void mousePressed(MouseEvent e){
               JComponent jc = (JComponent)e.getSource();
               TransferHandler th = jc.getTransferHandler();
               th.exportAsDrag(jc, e, TransferHandler.COPY);
            }
        };
        
        label.addMouseListener(oML);
    }
    
    public static void main(String[] args) {
        CV0205v03JFrameJLabelMousePressed oDrogDrag = new CV0205v03JFrameJLabelMousePressed();
    }
    
}
