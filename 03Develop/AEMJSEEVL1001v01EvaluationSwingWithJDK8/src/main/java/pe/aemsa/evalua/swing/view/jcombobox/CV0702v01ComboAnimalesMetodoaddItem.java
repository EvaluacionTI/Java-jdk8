/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jcombobox;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import pe.aemsa.evalua.swing.view.jcombobox.entidad.CEAnimal;
import pe.aemsa.evalua.swing.view.jcombobox.modelo.CDDataDemo;

/**
 *
 * @author user
 */
public class CV0702v01ComboAnimalesMetodoaddItem {
    
    private static ArrayList<CEAnimal> oListaAnimal;
    private static CEAnimal oCEAnimal;
    private static JComboBox oCbxModelo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDialog oDialog = new JDialog();
        oDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        oCbxModelo = new JComboBox();  
        oCbxModelo.setMaximumRowCount(5);   
        oDialog.add(oCbxModelo);   

        oDialog.setSize(300, 200);
        oDialog.setVisible(true);
        
        traerAnimal();
    }

    private static void traerAnimal(){
        CDDataDemo oCDDatoCombo;
        oCDDatoCombo = new CDDataDemo();
        
        ArrayList<CEAnimal> oResultadoListaAnimales = oCDDatoCombo.dataVacas();
        if (oResultadoListaAnimales != null){

            int iTamano = oResultadoListaAnimales.size();

            for (int i=0; i < iTamano; i++){
                oCbxModelo.addItem(oResultadoListaAnimales.get(i));
            }
        }
    }    
}
