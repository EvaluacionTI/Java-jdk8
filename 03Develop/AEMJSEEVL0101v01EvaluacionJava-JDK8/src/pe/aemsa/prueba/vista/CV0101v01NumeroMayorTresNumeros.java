/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.prueba.vista;

import pe.aemsa.prueba.logica.CL0101v01EvaluarNumeros;

public class CV0101v01NumeroMayorTresNumeros {

    public static void main(String[] args) {
        CL0101v01EvaluarNumeros oCLNumero = new CL0101v01EvaluarNumeros();
        int iResultado = oCLNumero.numeroMayorTresNumeros(5, 4, 7);
        
        System.out.println(iResultado);
    }
    
}
