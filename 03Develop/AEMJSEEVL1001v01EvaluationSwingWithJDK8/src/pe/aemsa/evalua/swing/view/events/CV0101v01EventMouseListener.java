package pe.aemsa.evalua.swing.view.events;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
    1. Extender de Frame
    2. Implementar un MouseMotionListener
    3. Declarar un constructor
 */
public class CV0101v01EventMouseListener extends Frame implements MouseMotionListener {
    Frame oFrm;
        
    CV0101v01EventMouseListener() {
        addMouseMotionListener(this);
        setSize(400, 500);
        setVisible(true);
        oFrm = new Frame("Revisión de MouseMotionListener");
        
    }

    public static void main(String[] args) {
        new CV0101v01EventMouseListener();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
          System.out.println("X1 = " +  e.getX() + "y1 = " + e.getY());
          oFrm.setLocation(e.getX(),  e.getY());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        System.out.println(g);
        g.getColor().getBlue();
        g.fillOval(e.getX(), e.getY(), 20, 20);
         System.out.println(g.getFontMetrics());
        System.out.println("X = " +  e.getX() + "y = " + e.getY());

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
