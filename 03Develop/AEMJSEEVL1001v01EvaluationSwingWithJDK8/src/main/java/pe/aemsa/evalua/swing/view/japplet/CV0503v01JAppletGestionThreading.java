/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.japplet;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author ALDV
 */
public class CV0503v01JAppletGestionThreading extends JApplet{
    public void init(){
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    mostrar();
                }
            });
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "No se tiene acceso" + ex);
        }
    }
    
    public void mostrar(){
        String sRuta = "F:\\01NetBeans8.2\\03Desarrollo\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\imagen\\cap29\\swing\\japplet\\AberdeenAngusMacho.jpg";
        ImageIcon oIcono = new ImageIcon(sRuta);
        JLabel oLblMostrar = new JLabel("Toro", oIcono, JLabel.CENTER);
        add(oLblMostrar);
    }
}
