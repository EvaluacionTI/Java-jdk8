/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.prueba.logica;

public class CL0201v01OperacionNumeros {
    public double operacionBasica(char cTipoOperacion, double piPrimerSumando, double piSegundoSumado){
        double liResultado;
    
        switch (cTipoOperacion){
                case 'S':
                  liResultado = piPrimerSumando + piSegundoSumado;
                  break;
                case 'R':
                    liResultado = piPrimerSumando - piSegundoSumado;
                    break;
                case 'M':
                    liResultado = piPrimerSumando * piSegundoSumado;
                    break;
                case 'D':
                    liResultado = piPrimerSumando / piSegundoSumado;
                    break;                    
                default:
                    liResultado = 0.0;
                    //System.out.println("Fuera del rango");
        }        
        return liResultado;
    }
}
