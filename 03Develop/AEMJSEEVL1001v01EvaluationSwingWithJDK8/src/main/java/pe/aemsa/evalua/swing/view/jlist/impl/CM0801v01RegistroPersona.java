/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.evalua.swing.view.jlist.impl;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import pe.aemsa.evalua.swing.view.jlist.entidad.CE0801v01Persona;

/**
 *
 * @author ALDV
 */
public class CM0801v01RegistroPersona extends AbstractListModel{
    
    private final ArrayList<CE0801v01Persona> oListaPersona = new ArrayList<>();
    
    @Override
    public int getSize() {
        return oListaPersona.size();
    }

    @Override
    public Object getElementAt(int index) {
        CE0801v01Persona oCEPersona = oListaPersona.get(index);
        return oCEPersona.getNombre();
    }
    /*
        El método primero recibe un objeto persona y posteriormente agregarlo a la lista
        Tendremos que notificarle a nuestro modelo, que hemos recibido un dato nuevo y que tiene que actualizar 
        lo que se está viendo en este momento.
        El método fireIntervalAdded es un método que nos permite notificarle al JList que un elemento ha sido 
        agregado, enviandole un rango de intervalo (En este caso podemos utilizar getsize() y getsize()+1)
    */
    public void adicionaPersona(CE0801v01Persona poCEPersona){
        oListaPersona.add(poCEPersona);
        this.fireIntervalAdded(this, getSize(), getSize() + 1);
    }
    
    /*
        Un método que elimine la persona en funcion de su posición
    */
    public void eliminarPersona(int index){
        oListaPersona.remove(index);
        this.fireIntervalRemoved(index, getSize(), getSize() + 1);
    }
    
    /*
        Método, que nos permitirá acceder a los datos de una de las personas enviandole el indice seleccionado,
    */
    public CE0801v01Persona getPersona(int index){
        return oListaPersona.get(index);
    }
}
