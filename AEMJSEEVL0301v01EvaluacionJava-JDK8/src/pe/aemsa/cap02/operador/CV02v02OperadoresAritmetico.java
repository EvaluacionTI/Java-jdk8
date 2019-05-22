/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.aemsa.cap02.operador;

/**
 *
 * @author AEMSA
 */
public class CV02v02OperadoresAritmetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mCadena;
        int mPrimerNumero;
        int mSegundoNumero;
        double mResultado;
        
        // Calcular la suma de dos numeros
        mPrimerNumero = 10;
        mSegundoNumero = 15;
        mResultado = mPrimerNumero + mSegundoNumero;
        
        System.out.println("Mostrar resultados");
        System.out.println("Primer Numero = " + mPrimerNumero);
        System.out.println("Segundo Numero = " + mSegundoNumero);
        System.out.println("La suma es = " + mResultado);

        // Resta de numeros
        mCadena = "Resta de Numeros";
        mResultado = mPrimerNumero - mSegundoNumero;
        System.out.println("La resta es = " + mResultado);

        // Multiplicacion de numeros
        mPrimerNumero = 30;
        mSegundoNumero = 55;

        System.out.println("\n");
        
        mCadena = "Multiplicacion de Numeros";
        mResultado = mPrimerNumero * mSegundoNumero;
        System.out.println("La Multiplicacion es = " + mResultado);
        
        // Division de numeros
        mPrimerNumero = 130;
        mSegundoNumero = 55;

        System.out.println("\n");
        
        mCadena = "Division de Numeros";
        mResultado = mPrimerNumero / mSegundoNumero;
        System.out.println("La Division es = " + mResultado);
    }
}
