/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls07.combobox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import pe.aemsa.cap29.swing.controls07.combobox.entidad.CEAnimal;
import pe.aemsa.cap29.swing.controls07.combobox.modelo.CDDataDemo;

/**
 *
 * @author ALDV
 */
public class CV0703v01ComboAnimalesWithDefaultComboBoxModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDialog oJDlgVentana = new JDialog();
        oJDlgVentana.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        DefaultComboBoxModel oModeloCombo = new DefaultComboBoxModel();
        JComboBox<CEAnimal> oJCbxAnimal = new JComboBox<>();
        CDDataDemo oData = new CDDataDemo();
        
        oModeloCombo.removeAllElements();
        oJCbxAnimal.setModel(oModeloCombo);
        ArrayList oLista = oData.dataVacas();
        
        for (int i=0; i<oLista.size(); i++){
            oModeloCombo.addElement(oLista.get(i));
        }
        
        // Detectar que se ha pulsado o variado
        oJCbxAnimal.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    JOptionPane.showMessageDialog(oJDlgVentana, oJCbxAnimal.getSelectedItem());
                }
            }
        });
        
        oJDlgVentana.setSize(800, 50);
        oJDlgVentana.add(oJCbxAnimal);
        oJDlgVentana.setVisible(true);
    }
    
}
