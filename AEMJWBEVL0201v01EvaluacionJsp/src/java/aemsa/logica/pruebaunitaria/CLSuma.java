/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.logica.pruebaunitaria;

public class CLSuma {
   public double getSuma(double a, double b) {
        // Se multiplica en vez de sumar a posta, para que los test fallen
        return a * b;
    }

    public double incrementa(double a) {
        return a + 1;
    } 
}
