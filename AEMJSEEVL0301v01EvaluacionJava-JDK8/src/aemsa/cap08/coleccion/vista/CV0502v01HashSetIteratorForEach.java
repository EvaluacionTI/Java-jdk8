/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap08.coleccion.vista;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class CV0502v01HashSetIteratorForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List<String> fruits =  Arrays.asList("Lemon", "Orange", "Banana", "Apple");
        HashSet<String> fruits =  new HashSet<>(Arrays.asList("Lemon", "Orange", "Banana", "Apple"));

            fruits.forEach(day -> {
                System.out.println("I am: "+ day);
            });
    }
    
}
