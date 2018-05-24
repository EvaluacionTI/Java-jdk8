/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap18.anotacion.vista;

import aemsa.cap18.anotacion.logica.CLAutomaticWeapon;
import aemsa.cap18.anotacion.logica.CLOperator;

public class CV01v01EjecutarArmaConAnotacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final CLAutomaticWeapon weapon = new CLAutomaticWeapon(30);
        final CLOperator operator = new CLOperator();
        operator.operate(weapon);
    }
    
}
