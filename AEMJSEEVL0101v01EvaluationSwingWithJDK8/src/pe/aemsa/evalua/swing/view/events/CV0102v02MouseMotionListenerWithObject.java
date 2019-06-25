package pe.aemsa.evalua.swing.view.events;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CV0102v02MouseMotionListenerWithObject extends Frame{
    static JButton oJButton;
    JPanel oJPanelPrincipal;
    
    public static void main(String[] paInverfin){
        JFrame oJFrame = new JFrame("MouseMotionListener with Object");
        oJFrame.setSize(800, 600);
        oJFrame.setVisible(true);
        oJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel oJPanelPrincipal = new JPanel();
        oJPanelPrincipal.setLayout(new FlowLayout());
        
        oJButton = new JButton("Evento with Object");
        oJPanelPrincipal.add(oJButton);
        
        oJFrame.show();
        //new CV0102v02MouseMotionListenerWithObject();
    }
    
    public CV0102v02MouseMotionListenerWithObject(){
        
        
        MouseMotionListener oMML = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                oJButton.setLocation(e.getXOnScreen()-10, e.getYOnScreen()-55);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        oJButton.addMouseMotionListener(oMML);
    }
}
