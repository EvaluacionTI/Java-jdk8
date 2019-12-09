/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aemsa.cap02.operador;

public class CV08v02OperadorNivelDeBit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 1;
       int b = 2;
       int c = 3;

       a |= 4;
       b >>= 1;
       c<<=1;
       a^=c;

       System.out.println("a   = " + a);
       System.out.println("b   = " + b);
       System.out.println("c   = " + c);
    }

}
