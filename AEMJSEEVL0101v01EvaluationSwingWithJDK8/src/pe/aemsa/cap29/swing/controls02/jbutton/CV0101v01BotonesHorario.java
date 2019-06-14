/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls02.jbutton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

/**
 *
 * @author ALDV
 */
public class CV0101v01BotonesHorario extends JButton{
// implements MouseMotionListener
    public CV0101v01BotonesHorario(String text){

        super.setText(text);
        //addMouseMotionListener(this);
    }   

//    @Override
//    public void mouseDragged(MouseEvent e) {
//        int iEjeX = this.getX() + e.getX() - this.getWidth() / 2;
//        int iEjeY = this.getY() + e.getY() - this.getHeight() / 2;
//        
//        setLocation(iEjeX, iEjeY);
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
