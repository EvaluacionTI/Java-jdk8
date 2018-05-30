/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls01.label;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author ALDV
 */
public class CV0101v01CentradoEtiqueta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Label Demo");
        f.setLayout(new FlowLayout());
        f.setSize(400, 360);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label= new JLabel("asdf");
//        Border border = BorderFactory.createLineBorder(Color.BLACK);
//        label.setBorder(border);
//        label.setPreferredSize(new Dimension(50, 100));

        label.setText("Centered");
        label.setBackground(Color.BLUE);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        f.add(label);

        f.setVisible(true);
    }
    
}
