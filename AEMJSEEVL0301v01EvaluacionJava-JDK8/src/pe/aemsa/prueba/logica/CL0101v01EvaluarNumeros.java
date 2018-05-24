/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.prueba.logica;

public class CL0101v01EvaluarNumeros {
        public int numeroMayorTresNumeros(int piNumero1, int piNumero2, int piNumero3){
            int dResultado;
            
            if (piNumero1 > piNumero2 && piNumero1 > piNumero3){
                dResultado = piNumero1;
            }else if (piNumero2 > piNumero3){
                dResultado = piNumero2;
            }else{
                dResultado = piNumero3;
            }
            return dResultado;
        }
}
