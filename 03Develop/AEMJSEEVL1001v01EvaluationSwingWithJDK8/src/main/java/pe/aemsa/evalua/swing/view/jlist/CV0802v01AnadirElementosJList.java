/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jlist;

import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Administrador
 */
public class CV0802v01AnadirElementosJList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JList oListaElementos = new JList();
        DefaultListModel oModelo = new DefaultListModel();
        for(int i = 1; i<=10; i++){
                oModelo.addElement(i);
        }
        oListaElementos.setModel(oModelo);
        
    }
    
}
