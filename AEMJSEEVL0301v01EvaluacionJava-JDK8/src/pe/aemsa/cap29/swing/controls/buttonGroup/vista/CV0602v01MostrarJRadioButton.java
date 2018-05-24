/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls.buttonGroup.vista;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author user
 */
public class CV0602v01MostrarJRadioButton extends JFrame{

    CV0602v01MostrarJRadioButton(){
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup bG = new ButtonGroup();
        bG.add(male);
        bG.add(female);
        this.setSize(100,200);
        //this.setLayout( new FlowLayout());
        this.add(male);
        this.add(female);
        //male.setSelected(true);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        CV0602v01MostrarJRadioButton j = new CV0602v01MostrarJRadioButton();
    }

}