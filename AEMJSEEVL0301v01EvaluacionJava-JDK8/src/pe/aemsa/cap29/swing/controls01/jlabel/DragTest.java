/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls01.jlabel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ALDV
 */
public class DragTest {
    public static void main(String[] args) {

        MyWindow window = new MyWindow();
        window.setVisible(true);
        window.setPreferredSize(new Dimension(400,400));
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MyWindow extends JFrame{

    public MyWindow(){

        super("Drag Test");
        Container container = getContentPane();
        container.setLayout(null);
        MyButton boton1 = new MyButton("Move me");
        container.add(boton1);
        boton1.setBounds(10, 10, 100, 30);

    }

}

class MyButton extends JButton implements MouseMotionListener{

    public MyButton(String text){

        super.setText(text);

        addMouseMotionListener(this);

    }

    public void mouseDragged(MouseEvent mme) {

        setLocation(

            this.getX() + mme.getX() - this.getWidth() / 2,
            this.getY() + mme.getY() - this.getHeight() / 2

        );

    }

    public void mouseMoved(MouseEvent mme) {}

}    
