/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jcombobox;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;

/**
 *
 * @author ALDV
 */
public class CV0701v01ComboAnimalesMetodoComboBoxModel extends AbstractListModel implements ComboBoxModel{
    String[] ComputerComps = { "Monitor", "Key Board", "Mouse", "Joy Stick", "Modem", "CD ROM",
      "RAM Chip", "Diskette" };
    
    String selection = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDialog oDialog = new JDialog();
        oDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        JComboBox oCbxModelo = new JComboBox(new CV0701v01ComboAnimalesMetodoComboBoxModel());  
        oCbxModelo.setMaximumRowCount(5);   
        oDialog.add(oCbxModelo);   

        oDialog.setSize(300, 200);
        oDialog.setVisible(true);
    }

    @Override
    public int getSize() {
        return ComputerComps.length;
    }

    @Override
    public Object getElementAt(int index) {
        return ComputerComps[index];
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
    
}
