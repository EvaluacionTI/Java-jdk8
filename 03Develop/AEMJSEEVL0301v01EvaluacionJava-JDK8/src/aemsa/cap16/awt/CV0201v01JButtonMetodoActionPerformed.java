/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap16.awt;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 *
 * @author Administrador
 */
public class CV0201v01JButtonMetodoActionPerformed extends Applet implements ActionListener{
    String msg = "";
    JButton yes, no, maybe;

    public void init(){
        yes = new JButton("Yes");
        no = new JButton("No");
        maybe = new JButton("Undecided");
        
        add(yes);
        add(no);
        add(maybe);
        
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        
        if (str.equals("Yes")){
            msg = "Usted presionó Yes";
        }else if (str.equals("No")){
            msg = "Usted presionó No";
        }else{
            msg = "Usted presionó Undecided";
        }
        repaint();
    }
    
    public void paint(Graphics g){
        g.drawString(msg, 6, 100);
    }
}
