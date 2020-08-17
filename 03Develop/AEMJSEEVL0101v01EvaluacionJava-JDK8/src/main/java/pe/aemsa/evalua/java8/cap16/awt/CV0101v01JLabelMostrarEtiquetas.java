/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap16.awt;

import java.applet.Applet;
import javax.swing.JLabel;

public class CV0101v01JLabelMostrarEtiquetas extends Applet{
    
    public void init(){
        JLabel oLblOne = new JLabel("Huk");
        JLabel oLblTwo = new JLabel("Iskay");
        JLabel oLblThree = new JLabel("Kimsa");

        add(oLblOne);
        add(oLblTwo);
        add(oLblThree);
    }

}
