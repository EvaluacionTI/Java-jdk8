/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap01.introduccion;

public class CV070101v01VariableEntorno {

    public static void main(String[] args) {
       System.err.println("Todas las variables de entorno : " + System.getenv());
       System.err.println("JAVA_HOME : " + System.getenv("JAVA_HOME"));
       System.err.println("LOCALAPPDATA : " + System.getenv("LOCALAPPDATA"));
       System.err.println("USERNAME : " + System.getenv("USERNAME"));
    }
    
}
