/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls.buttonGroup.vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ALDV
 */
public class CV0601v01JRadioButtonSeleccion {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    
    public CV0601v01JRadioButtonSeleccion(){
        iniciaPantalla();
    }
    public static void main(String[] args) {
        CV0601v01JRadioButtonSeleccion  swingControlDemo = new CV0601v01JRadioButtonSeleccion();     

        swingControlDemo.showRadioButtonDemo();       
    }
    
    private void iniciaPantalla(){
        mainFrame = new JFrame("JRadioButtom - Selección de un dato");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
            }       
        });
        headerLabel = new JLabel("", JLabel.CENTER);       
        statusLabel = new JLabel("",JLabel.CENTER);   
        statusLabel.setSize(350,100);
       // controlPanel = new JPanel();
       // controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
       // mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true); 
    }

    private void showRadioButtonDemo(){

        headerLabel.setText("Control in action: RadioButton");

        final JRadioButton radDog = new JRadioButton("Dog", true);
        final JRadioButton radCat = new JRadioButton("Cat");
        final JRadioButton radMouse = new JRadioButton("Mouse");

        radDog.setMnemonic(KeyEvent.VK_C);
        radCat.setMnemonic(KeyEvent.VK_M);
        radMouse.setMnemonic(KeyEvent.VK_P);
//        radDog.addItemListener(new ItemListener() {
//
//       public void itemStateChanged(ItemEvent e) {        
//          statusLabel.setText("DOG RadioButton: "
//          + (e.getStateChange()==1?"checked":"unchecked"));
//            }          
//        });
//
//        radCat.addItemListener(new ItemListener() {
//
//        public void itemStateChanged(ItemEvent e) {            
//              statusLabel.setText("CAT RadioButton: "
//              + (e.getStateChange()==1?"checked":"unchecked"));
//           }          
//        });
//
//        radMouse.addItemListener(new ItemListener() {
//           public void itemStateChanged(ItemEvent e) {            
//              statusLabel.setText("MOUSE RadioButton: "
//              + (e.getStateChange()==1?"checked":"unchecked"));
//           }          
//        });

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();

        group.add(radDog);
        group.add(radCat);
        group.add(radMouse);

//        controlPanel.add(radDog);
//        controlPanel.add(radCat);
//        controlPanel.add(radMouse);      

        mainFrame.setVisible(true); 
    }
}
