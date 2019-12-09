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
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Administrador
 */
public class CV0301v01JTextField extends Applet implements ActionListener{
    JTextField name, pass;
    
    public void init(){
        JLabel namep = new JLabel("Name : ", JLabel.RIGHT);
        JLabel passp = new JLabel("Password  ", JLabel.RIGHT);
        
        name = new JTextField(22);
        pass = new JTextField(8);

        add(namep);
        add(name);
        add(passp);
        add(pass);
        
        // Se registra para recibir los eventos
        name.addActionListener(this);
        pass.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public void paint(Graphics g){
        g.drawString("Name : " + name.getText(), 6, 60);
        g.drawString("Selected text in name" + name.getSelectedText(), 6, 80);
        g.drawString("Password : " + pass.getText(), 6, 100);
    }

}
