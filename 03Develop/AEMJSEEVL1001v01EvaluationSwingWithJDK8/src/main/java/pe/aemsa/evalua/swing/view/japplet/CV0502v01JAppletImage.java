/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.japplet;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;

/**
 *
 * @author Administrador
 */
public class CV0502v01JAppletImage extends JApplet{
    public void init(){
        String sRuta = "F:\\01NetBeans8.2\\03Desarrollo\\AEMJSEEVL0301v01EvaluacionJava-JDK8\\src\\resources\\imagen\\cap29\\swing\\japplet\\AberdeenAngusMacho.jpg";
        ImageIcon oIIcocono = new ImageIcon(sRuta);
        JLabel oJLblBandera = new JLabel("Toro", oIIcocono, JLabel.CENTER);
        oJLblBandera.setText("Agregando Imagen");
        add(oJLblBandera);
    }
}
