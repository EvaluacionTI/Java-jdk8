/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.japplet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author ALDV
 */
public class CV0301v01JAppletJTextField extends JApplet implements ActionListener{
    JTextField oJTxtFMensaje;
    
    @Override
    public void init(){
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    mostrarIU();
                }
            });
            
        }catch(Exception ex){
            JOptionPane.showConfirmDialog(this, "Error identificado" + ex);
        }
    }
    
    private void mostrarIU(){
        // Se establece el diseno
        setLayout(new FlowLayout());
        
        // Se anade el campo de texto al panel de contenido
        oJTxtFMensaje = new JTextField("Puca - siembre de papa", 30);
        add(oJTxtFMensaje);
        
        oJTxtFMensaje.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        showStatus(oJTxtFMensaje.getText());
    }
    
}
