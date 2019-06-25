package pe.aemsa.evalua.swing.view.events;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

public class CV0102v01MouseMotionListenerWithInterfaz extends Frame implements MouseMotionListener{
    private static JButton oJButton;
    
    public static void main(String[] paInverfin){
        oJButton = new JButton("Mover un evento");
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
