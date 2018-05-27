/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap29.swing.controls07.combobox.modelo;

import java.util.ArrayList;
import pe.aemsa.cap29.swing.controls07.combobox.entidad.CEAnimal;

/**
 *
 * @author ALDV
 */
public class CDDataDemo {
    private ArrayList<CEAnimal> oListaAnimal;
    private CEAnimal oCEAnimal;
    
    public ArrayList<CEAnimal> dataVacas(){
        
        oListaAnimal = new ArrayList<>();

        oCEAnimal = new CEAnimal();
        oCEAnimal.setIdAnimal(1);
        oCEAnimal.setCodigoAnimal("300");
        oCEAnimal.setNumeroArete("A300");
        oCEAnimal.setNombreAlias("Pasquel");
        oListaAnimal.add(oCEAnimal);
        
        oCEAnimal = new CEAnimal();
        oCEAnimal.setIdAnimal(2);
        oCEAnimal.setCodigoAnimal("400");
        oCEAnimal.setNumeroArete("A400");
        oCEAnimal.setNombreAlias("Raquel");
        oListaAnimal.add(oCEAnimal);

        oCEAnimal = new CEAnimal();
        oCEAnimal.setIdAnimal(3);
        oCEAnimal.setCodigoAnimal("500");
        oCEAnimal.setNumeroArete("A500");
        oCEAnimal.setNombreAlias("Pancha");
        oListaAnimal.add(oCEAnimal);
        
        return oListaAnimal;
    }    
}
