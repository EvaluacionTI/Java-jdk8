/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jcombobox.impl;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ALDV
 */
public class CM0701v01ArrayListComboBoxModel extends AbstractListModel implements ComboBoxModel{
    private Object oSeleccionItem;
    private ArrayList moaArrayList;
    
    public CM0701v01ArrayListComboBoxModel(ArrayList poaArrayList){
        moaArrayList = poaArrayList;
    }
    
    /*
        Tamaño del array
    */
    @Override
    public int getSize() {
        return moaArrayList.size();
    }

    /*
        Posición del array
    */
    @Override
    public Object getElementAt(int index) {
        return moaArrayList.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        oSeleccionItem = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return oSeleccionItem;
    }
    
}
