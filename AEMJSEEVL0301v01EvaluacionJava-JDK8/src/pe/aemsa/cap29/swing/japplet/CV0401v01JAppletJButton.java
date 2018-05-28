/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.japplet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author ALDV
 */
public class CV0401v01JAppletJButton extends JApplet implements ActionListener{
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
            JOptionPane.showMessageDialog(this, "Error identificado " +  ex);
        }
        
    }
    
    private void mostrarIU(){
        setLayout(new FlowLayout());
        
        // se anaden los botones al panel de contenido
        String sRuta = "F:\\01NetBeans8.2\\03Desarrollo\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\imagen\\cap29\\swing\\japplet\\AberdeenAngusMacho.jpg";
        ImageIcon oImagenToro = new ImageIcon(sRuta, "Aberdeen Angus");
        JButton oJBtnToro = new JButton("Angus", oImagenToro);
        oJBtnToro.setActionCommand("Aberdeen");
        oJBtnToro.addActionListener(this);
        add(oJBtnToro);
        
        sRuta = "F:\\01NetBeans8.2\\03Desarrollo\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\imagen\\cap29\\swing\\japplet\\BrahmanMacho.jpg";
        ImageIcon oImagenToroMacho = new ImageIcon(sRuta, "Brahman Macho");
        oJBtnToro = new JButton("Brahman", oImagenToroMacho);
        oJBtnToro.setActionCommand("Brahman");
        oJBtnToro.addActionListener(this);
        add(oJBtnToro);
        
        sRuta = "F:\\01NetBeans8.2\\03Desarrollo\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\imagen\\cap29\\swing\\japplet\\BrownSwissMacho.jpg";
        ImageIcon oImagenToroSwiss = new ImageIcon(sRuta, "Swiss Macho");
        oJBtnToro = new JButton("Swiss", oImagenToroSwiss);
        oJBtnToro.setActionCommand("Swiss");
        oJBtnToro.addActionListener(this);
        add(oJBtnToro);
        
        sRuta = "F:\\01NetBeans8.2\\03Desarrollo\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\imagen\\cap29\\swing\\japplet\\CharolaiseMacho.jpg";        
        ImageIcon oImagenToroCharolaise = new ImageIcon(sRuta, "Charolaise Macho");
        oJBtnToro = new JButton("Charolaise", oImagenToroCharolaise);
        oJBtnToro.setActionCommand("Charolaise");
        oJBtnToro.addActionListener(this);
        add(oJBtnToro);
        
        oJTxtFMensaje = new JTextField("Raza de animales", 27);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       oJTxtFMensaje.setText(e.getActionCommand());
    }
    
}
