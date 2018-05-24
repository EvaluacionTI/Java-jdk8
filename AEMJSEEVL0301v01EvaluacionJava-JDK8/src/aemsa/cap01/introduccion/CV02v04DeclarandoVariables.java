
package aemsa.cap01.introduccion;


public class CV02v04DeclarandoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1.0 Declarando variables miembro, estas se expresaran con el prefijo m.
        String mCadena;
        int mPrimerNumero;
        int mSegundoNumero;
        
        
        // 2.0 Asignado valores a las variables
        mCadena = "Fundamentos de Programacion";
        mPrimerNumero = 10;
        mSegundoNumero = 20;
        
        // 3.0 Los operados matematicos utilizados: Suma ( + ), Resta ( - ), Multiplicacion ( * ) y Division ( / ).
        //       El algoritmo de calculo sera
        
        System.out.println(" La suma = " + (mPrimerNumero + mSegundoNumero));
        System.out.println(" La suma = " + (mPrimerNumero - mSegundoNumero));
        System.out.println(" La suma = " + (mPrimerNumero * mSegundoNumero));
        System.out.println(" La suma = " + (mPrimerNumero / mSegundoNumero));
        
    }
}
