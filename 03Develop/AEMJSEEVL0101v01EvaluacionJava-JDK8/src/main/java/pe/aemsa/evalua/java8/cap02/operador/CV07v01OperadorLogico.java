/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aemsa.cap02.operador;

public class CV07v01OperadorLogico {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a || b;
        boolean d = a && b;
        boolean e = !b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("  Operador AND  = &&" + a + " && " + b + " = " + d);
        System.out.println("  Operador OR = || " + a + " && " + b + " = " + c);
        System.out.println("  Operador Negacion = ! " + b + " ! " + e);


        System.out.println("  Operador AND  = &" + a + " & " + b + " = " + d);
        System.out.println("  Operador OR = | " + a + " | " + b + " = " + c);

    }
}
