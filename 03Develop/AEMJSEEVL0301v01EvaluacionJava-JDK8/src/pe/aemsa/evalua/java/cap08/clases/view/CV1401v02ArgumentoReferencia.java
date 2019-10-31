/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.aemsa.evalua.java.cap08.clases.view;

class ParametroReferencia{
    int a, b;

    ParametroReferencia(int i, int j){
        a = i;
        b = j;
    }

    void referencia(ParametroReferencia poReferencia){
        poReferencia.a *= 2;
        poReferencia.b /= 2;
    }
}
public class CV1401v02ArgumentoReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParametroReferencia oReferencia = new ParametroReferencia(15, 20);

        System.out.println(" Parametro por referencia   " + oReferencia.a + "   " + oReferencia.b);

        oReferencia.referencia(oReferencia);

        System.out.println(" Parametro por referencia   " + oReferencia.a + "   " + oReferencia.b);
    }

}
