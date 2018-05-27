/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 *
 * @author Administrador
 */
public class CV0502v01JAppletImage extends JApplet{
    public void init(){
        ImageIcon oIIcocono = new ImageIcon("F:\\01NetBeans8.2\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\pe\\aemsa\\cap29\\swing\\AberdeenAngusMacho.jpg");
        JLabel oJLblBandera = new JLabel("Toro", oIIcocono, JLabel.CENTER);
        oJLblBandera.setText("Agregando Imagen");
        add(oJLblBandera);
    }
}
